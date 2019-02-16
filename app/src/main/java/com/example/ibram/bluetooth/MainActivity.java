package com.example.ibram.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    BluetoothAdapter BTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTS= BluetoothAdapter.getDefaultAdapter();

        Button B1 = (Button) findViewById(R.id.BluetothOn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnableBt();

            }
        });
    }//end of Oncreat func

    private static final String TAG = "MyActivity";

    public  void EnableBt(){
        if(BTS==null){
            Log.d(TAG , "enable Bluetooth: Your Device has no Bluetooth module");
        }
        else if(BTS.isEnabled()){
            Log.d(TAG , "enable Bluetooth: Bluetooth is already enabled");
        }
        else  if(!BTS.isEnabled()){
            Log.d(TAG , "enable Bluetooth: enable.. ");
            Intent BV=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(BV);

        }
    }

    public void DisableBt(View v){
        if(BTS==null){
            Log.d(TAG , "Disable Bluetooth: Your Device has no Bluetooth module");
        }
        else if(BTS.isEnabled()){
            BTS.disable();
            Log.d(TAG , "Disable Bluetooth: Bluetooth is disable..");
        }
        else  if(!BTS.isEnabled()){
            Log.d(TAG , "Disable Bluetooth: Bluetooth is already disabled");

        }

    }

}
