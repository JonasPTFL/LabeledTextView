# LabeledTextView - Open source Android Library


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
Alternative you can style your `LabeledTextView` programmatically and dynamically with these methods:

|   	| Method                                 	| Description                                                                          	|
|---	|----------------------------------------	|--------------------------------------------------------------------------------------	|
| 1 	| setContentPaddingLeft(int paddingLeft) 	| apply specific padding to content view to let it look like structered                	|
| 2 	| setContentText(String text)            	| changes text under label(content-text) to new text                                   	|
| **3** 	| **setContentTextStyle(int styleRes)**      	| **apply custom textAppearance to content-text**                                          	|
| 4 	| setLabelAllCaps(boolean allCaps)       	| true: label text is in all-caps(sometimes looks better), false: label text is normal 	|
| 5 	| setLabelSingleLine(boolean singleLine) 	| true: label just allows single-line, false: label is without line-limit              	|
| 6 	| setLabelBold(boolean bold)             	| true: label text is bold, false: label text is normal                                	|
| 7 	| setLabelColor(int color)               	| apply custom color as label text-color                                               	|
| 8 	| setLabelText(String text)              	| changes text of label(label-text) to new text                                        	|

Tip: The **3th Method** is only programmatically available. You can't change `textappereance` using xml attributes! 

## Demo
And then create nice labeled text views like shown above in my demo app:
<p align="center">
  <img src="https://github.com/JonasPTFL/LabeledTextView/blob/master/screenshots/demo_scrrenshot.jpg?raw=true" height="500" title="demo-app-screenshot">
</p>



Have fun with creating textviews with styleable labels.
