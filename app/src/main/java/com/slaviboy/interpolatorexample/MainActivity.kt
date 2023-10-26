package com.slaviboy.interpolatorexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.slaviboy.interpolator.Easing
import com.slaviboy.interpolator.EasingProvider

class MainActivity : ComponentActivity() {

    @Composable
    fun Float.pxToDp() = with(LocalDensity.current) { this@pxToDp.toDp() }

    @Composable
    fun Dp.dpToPx() = with(LocalDensity.current) { this@dpToPx.toPx() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var widthPx by remember {
                mutableStateOf(0f)
            }
            val ballSize = 20.dp
            val ballSizePx = ballSize.dpToPx()
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .onGloballyPositioned {
                        widthPx = (it.size.width - ballSizePx)
                    }
            ) {
                val infiniteTransition = rememberInfiniteTransition(label = "")
                val xFact by infiniteTransition.animateFloat(
                    initialValue = 0f,
                    targetValue = 1f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(durationMillis = 1000, easing = LinearEasing),
                        repeatMode = RepeatMode.Reverse
                    ),
                    label = ""
                )
                Column {
                    Easing.values().forEach {
                        Spacer(
                            modifier = Modifier
                                .height(10.dp)
                        )
                        Box(
                            modifier = Modifier
                                .size(ballSize)
                                .offset(
                                    x = (widthPx * EasingProvider[it, xFact]).pxToDp()
                                )
                                .background(Color.Red, CircleShape)
                        )
                        Spacer(
                            modifier = Modifier
                                .height(10.dp)
                        )
                    }
                }
            }
        }
    }
}