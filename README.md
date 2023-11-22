# KotlinInterpolator

### How to add:
1. Add it in your root build.gradle at the end of repositories:
```kotlin
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
2. Add the dependency 
```kotlin
dependencies {
	implementation 'com.github.slaviboy:KotlinInterpolator:1.0.0'
}
```

### 🧪 Examples:

|  Name  | Description  | Animation |
| --- | --- | --- |
| Ease | _**Easing Curve**_ that speeds up quickly and ends slowly.  | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease.gif" width="350" height="auto"/>  |
| EaseOut | _**Easing Curve**_ that starts quickly and ends slowly.  | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out.gif" width="350" height="auto"/>  |
| EaseIn | _**Easing Curve**_ that starts slowly and ends quickly.  | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in.gif" width="350" height="auto"/>  |
| EaseInOut | _**Easing Curve**_ that starts slowly, speeds up and then ends slowly  | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out.gif" width="350" height="auto"/>  |
| EaseInSine | _**Easing Curve**_ that starts slowly and ends quickly. Similar to EaseIn, but with slightly less abrupt beginning  | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_sine.gif" width="350" height="auto"/>  |
| EaseOutSine | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_sine.gif" width="350" height="auto"/>  |
| EaseInOutSine | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_sine.gif" width="350" height="auto"/>  |
| EaseInCubic | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_cubic.gif" width="350" height="auto"/>  |
| EaseOutCubic | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_cubic.gif" width="350" height="auto"/>  |
| EaseInOutCubicm | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_cubic.gif" width="350" height="auto"/>  |
| EaseInQuint | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_quint.gif" width="350" height="auto"/>  |
| EaseOutQuint | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_quint.gif" width="350" height="auto"/>  |
| EaseInOutQuint | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_quint.gif" width="350" height="auto"/>  |
| EaseInCirc | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_circ.gif" width="350" height="auto"/>  |
| EaseOutCircm | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_circ.gif" width="350" height="auto"/>  |
| EaseInOutCirc | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_circ.gif" width="350" height="auto"/>  |
| EaseInQuad | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_quad.gif" width="350" height="auto"/>  |
| EaseOutQuad | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_quad.gif" width="350" height="auto"/>  |
| EaseInOutQuad | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_quad.gif" width="350" height="auto"/>  |
| EaseInQuart | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_quart.gif" width="350" height="auto"/>  |
| EaseOutQuart | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_quart.gif" width="350" height="auto"/>  |
| EaseInOutQuart | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_quart.gif" width="350" height="auto"/>  |
| EaseInExpo | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_expo.gif" width="350" height="auto"/>  |
| EaseOutExpo | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_expo.gif" width="350" height="auto"/>  |
| EaseInOutExpo | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_expo.gif" width="350" height="auto"/>  |
| EaseInBack | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_back.gif" width="350" height="auto"/>  |
| EaseOutBack | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_back.gif" width="350" height="auto"/>  |
| EaseInOutBack | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_back.gif" width="350" height="auto"/>  |
| EaseInElastic | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_elastic.gif" width="350" height="auto"/>  |
| EaseOutElastic | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_elastic.gif" width="350" height="auto"/>  |
| EaseInOutElastic | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_elastic.gif" width="350" height="auto"/>  |
| EaseInBounce | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_bounce.gif" width="350" height="auto"/>  |
| EaseOutBounce | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_out_bounce.gif" width="350" height="auto"/>  |
| EaseInOutBounce | - | <img src="https://raw.githubusercontent.com/slaviboy/RepositoryImages/main/gifs/interpolations/ease_in_out_bounce.gif" width="350" height="auto"/>  |




