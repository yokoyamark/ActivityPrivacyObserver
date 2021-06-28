# ActivityPrivacyObserver
The library protects the screen privacy of Android Activity.  
**However, this library is not complete.**  

<img src="./resReadMe/screen-20210629-031643_Trim.gif" alt="Preview1" width=300>

## Installation
### JitPack.io
1. Add the JitPack repository to your build file  
2. Add the dependency  

See detail ↓  
[![](https://jitpack.io/v/yokoyamark/ActivityPrivacyObserver.svg)](https://jitpack.io/#yokoyamark/ActivityPrivacyObserver) 

## Usage
1. Activity#onCreate  
    An LifecycleObserver that can overlay a PrivacyView when the Activity moves to the background. This class must **initialize after Activity#setContentView()**.  
    You can set the layout that covers the activity.
    ```kotlin
      // setContentView() exists before
      privacyObserver = PrivacyObserver(this, R.layout.activity_splash)
      lifecycle.addObserver(privacyObserver)
    ```  
   
2. Activity#onUserLeaveHint  
    You have to override onUserLeaveHint. Because it cannot be monitored by Lifecycle Observer.   
    ```kotlin
      override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        // need call
        privacyObserver.onUserLeaveHint()
      }
    ```

## Developed By
Ryosuke Yokoyama (yokoyamark)  

## Copyright
see ./LICENSE

ActivityPrivacyObserver is released under the [MIT License](https://github.com/yokoyamark/ActivityPrivacyObserver/blob/master/LICENSE).  
Copyright 2021 yokoyamark  
