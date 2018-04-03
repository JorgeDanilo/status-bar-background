###Status Bar Background Color Android

- Set the status bar of your android device to the transulenct color.

## Install

In your project Cordova execute the following command to install

```
cordova plugin add status-bar-background-color
```

## How to use ?

```
declare var StatusBarBackgroundColor: any;
```

```
initializeApp() {
  this.platform.ready().then(() => {
     // Add this code here.
     StatusBarBackgroundColor.enable();
  });
}
```





