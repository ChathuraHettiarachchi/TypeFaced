# TypeFaced[ ![Download](https://api.bintray.com/packages/chathurahettiarachchi/maven/TypeFaced/images/download.svg) ](https://bintray.com/chathurahettiarachchi/maven/TypeFaced/_latestVersion)
This library allows developer to create textView, button, editTextView and etc with custom type-face.

![libintro](https://cloud.githubusercontent.com/assets/13764097/22328954/f6fa03be-e3e4-11e6-86c7-000da62f8042.jpg)

TypeFaced, contains many types of customized views as follow,
* TypeFacedTextView
* TypeFacedEditText
* TypeFacedButton
* TypeFacedRadioButton
* TypeFacedCheckBox
* TypeFacedToggleButton
* TypeFacedSwitch

####Let's take a look how to add this to your project

For the android project just include the following dependency inside you build.gradle's depedency list.

Gradle
------
```
repositories {
  jcenter()
}

dependencies {
    ...
    compile 'com.chootdev:typefaced:1.1.7'
}
```

if you using maven use following
Maven
------
```
<dependency>
  <groupId>com.chootdev</groupId>
  <artifactId>typefaced</artifactId>
  <version>1.1.7</version>
  <type>pom</type>
</dependency>
```

After setup installing lib to your project you just need only to call it using just few lines of code. It will return you a string with the results.

Usage
-----
To add custom TextView with TypeFaced, You can use TypeFacedTextView
```xml
<com.chootdev.typefaced.TypeFacedTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:textView_font="YOUR_FONT_NAME.ttf/>
```

To add custom Button with TypeFaced, You can use TypeFacedButton
```xml
<com.chootdev.typefaced.TypeFacedButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

or to add custom EditText with TypeFaced, You can use TypeFacedEditText
```xml
<com.chootdev.typefaced.TypeFacedEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

or to add custom RadioButton with TypeFaced, You can use TypeFacedRadioButton
```xml
<com.chootdev.typefaced.TypeFacedRadioButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

or to add custom CheckBox with TypeFaced, You can use TypeFacedCheckbox
```xml
<com.chootdev.typefaced.TypeFacedCheckbox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

or to add custom ToggleButton with TypeFaced, You can use TypeFacedToggleButton
```xml
<com.chootdev.typefaced.TypeFacedToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

or to add custom Switch with TypeFaced, You can use TypeFacedSwitch
```xml
<com.chootdev.typefaced.TypeFacedSwitch
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:button_font="YOUR_FONT_NAME.ttf"/>
```

You need only to enter font name with the extension .ttf to each custom view.

NOTE
-----
Your fonts need to be added to your project's assets folder. Inside of your assetc need to add new folder with name "fonts", and place all your font .ttf files inside of it.

![screen shot 2017-01-26 at 4 57 20 pm](https://cloud.githubusercontent.com/assets/13764097/22329713/9827ab4e-e3e8-11e6-89ea-7999dd084bf3.png)

TypeFaced also contains some pre-added fonts with the library,
```java
Roboto-Bold.ttf
Roboto-Italic.ttf
Roboto-Light.ttf
Roboto-LightItalic.ttf
Roboto-Medium.ttf
Roboto-Regular.ttf
Roboto-Thin.ttf
Roboto-ThinItalic.ttf
```

Limitations
-----------
* Currently min SDK is set to 14 due to customization of android.widget.Switch

Output Generated
----------------
![screenshot_20170126-170154](https://cloud.githubusercontent.com/assets/13764097/22329863/45f989e0-e3e9-11e6-86e0-25836707bd1d.png)

Changelog
---------
* **1.1.7**
    * Added sample project with all customizations
* **1.1.6**
    * Support for Switch
* **1.1.5**
    * Fixed change on android ToggleButton
* **1.1.4**
    * Support for EditText
* **1.1.3**
    * Support for RadioButton
* **1.1.2**
    * Fixed crash with adding custom exception and added support for Checkbox
* **1.1.1**
    * Support for TextView
* **1.0.0**
    * Initial release
    
## Author

Chathura Hettiarachchi, chathura93@yahoo.com

Checkout my other contributions, https://github.com/ChathuraHettiarachchi?tab=repositories

# License
Copyright 2017 Chathura Hettiarachchi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
