# BluetoothAndroid
there is no gold here this is trivial Repo .. .i just learn how to access Bluetooth in android Application so i could communicate with embedded systems through my phone  .
and  i publish it in github to get practicing with version control in android studio


u can find some useful date in [android devolper website](https://developer.android.com/guide/topics/connectivity/bluetooth)

### major tasks necessary to communicate using Bluetooth
      setting up Bluetooth
      finding devices that are either paired or available in the local area 
      connecting devices 
      transferring data between devices
            
### Bluetooth permissions
you need some user permation to can access Bluetooth features in your application
-"BLUETOOTH" You need this permission to perform any Bluetooth communication, such as requesting a connection, accepting a connection, and transferring data
-"BLUTOOTH_ADMAIN" If you want your app to initiate device discovery or manipulate Bluetooth settings, you must declare this permation 
-"ACCESS_COARSE_LOCATION" A location permission is required because Bluetooth scans can be used to gather information about the location of the user.

Declare the Bluetooth permission(s) in your application manifest file. For example:
         <manifest ... >
             <uses-permission android:name="android.permission.BLUETOOTH" />
             <uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
             <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
             ...
         </manifest>
         
