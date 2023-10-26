package com.slaviboy.interpolator

/**
 * The Easing class provides a collection of ease functions. It does not use the standard 4 param
 * ease signature. Instead it uses a single param which indicates the current linear ratio (0 to 1) of the tween.
 */
enum class Easing {
    Ease,
    EaseOut,
    EaseIn,
    EaseInOut,
    EaseInSine,
    EaseOutSine,
    EaseInOutSine,
    EaseInCubic,
    EaseOutCubic,
    EaseInOutCubic,
    EaseInQuint,
    EaseOutQuint,
    EaseInOutQuint,
    EaseInCirc,
    EaseOutCirc,
    EaseInOutCirc,
    EaseInQuad,
    EaseOutQuad,
    EaseInOutQuad,
    EaseInQuart,
    EaseOutQuart,
    EaseInOutQuart,
    EaseInExpo,
    EaseOutExpo,
    EaseInOutExpo,
    EaseInBack,
    EaseOutBack,
    EaseInOutBack,
    EaseInElastic,
    EaseOutElastic,
    EaseInOutElastic,
    EaseOutBounce,
    EaseInBounce,
    EaseInOutBounce,
    FastOutSlowIn,
    LinearOutSlowIn,
    FastOutLinearIn,
    Linear;
}