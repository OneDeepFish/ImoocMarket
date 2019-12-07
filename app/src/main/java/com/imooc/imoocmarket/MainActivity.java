package com.imooc.imoocmarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imooc.util.L;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        L.d( TAG, "你好，我的android!" );

        new Thread( "leak_canary" ) {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep( 3 * 60 * 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
