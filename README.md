Android
=======
When using Gradle, don't forget to add a local.properties file and set the sdk.dir as needed. Unless it can recognize the ANDROID_HOME...

Windows command: "set ANDROID_HOME" using export doesn't work.

If the Android project doesn't compile.
	Go to Project->Properties->Android and add the proper build target...not sure which one it's based on. Maybe just use the most recent?

Repository to hold Android practice development

Setting up project:
	java -jar gdx-setup.jar --dir mygame --name mygame --package com.badlogic.mygame --mainClass MyGame --sdkLocation mySdkLocation
