# Groovy

Groovy support is provided by [groovy-android-gradle-plugin](https://github.com/groovy/groovy-android-gradle-plugin).

Build / install / start from command line:

```
➜  AndroidJavaAlternatives  ./gradlew :app-groovy:assembleDebug
...
➜  AndroidJavaAlternatives  adb -e install -r ./app-groovy/build/outputs/apk/app-groovy-debug.apk
1295 KB/s (2672448 bytes in 2.014s)
	pkg: /data/local/tmp/app-groovy-debug.apk
Success
➜  AndroidJavaAlternatives  adb -e shell am start -n app.groovy/app.groovy.Home
Starting: Intent { cmp=app.groovy/.Home }
```

Debug apk size: **2.6MB**.

Notes:

- Android run configuration can't find default Activity.
  Alternative: select "Do not lauch Activity" and start manually the app.
- Android Studio poor support for groovy (no autocomplete when overriding super methods)
