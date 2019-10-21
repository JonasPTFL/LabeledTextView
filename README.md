# LabeledTextView - Open source Library


[![](https://jitpack.io/v/JonasPTFL/LabeledTextView.svg)](https://jitpack.io/#JonasPTFL/LabeledTextView)

This is my simple and easy to use  `LabeledTextView` library! Its **flexible** and styleable. I'm open for all new pull requests and ideas or features. It's quite **simple** but **quick** and **looks pretty nice**.

## Download

You can import this library by adding the following:
Add this to your root _build.gradle_:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add this in your app _build.gradle_ to your dependecies:
```
dependencies {
    implementation 'com.github.JonasPTFL:LabeledTextView:v1.0.1'
}
```
## Easy-to-use
Create/Style label and content with xml attributes:

Tip: To use "`app: ...` " add 
`xmlns:app="http://schemas.android.com/apk/res-auto"`
to your root layout and then you can start customize `LabeledTextView`
```
    <com.JonasPTFL.library.labeledtextview.LabeledTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:label_text="This is the label-text"
        app:label_color="@color/your_label_color"
        app:label_all_caps="true"
        app:label_single_line="true"
        app:label_bold="true"
        app:content_text="This is the content-text"
        app:content_padding_left="@dimen/your_content_padding_left" />
```


## Demo
And then create nice labeled text views like shown above in my demo app:
<p align="center">
  <img src="https://github.com/JonasPTFL/LabeledTextView/blob/master/screenshots/demo_scrrenshot.jpg?raw=true" height="500" title="demo-app-screenshot">
</p>



Have fun with creating textviews with styleable labels.
