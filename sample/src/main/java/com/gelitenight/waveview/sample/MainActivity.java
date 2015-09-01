package com.gelitenight.waveview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gelitenight.waveview.library.WaveView;

public class MainActivity extends AppCompatActivity {

    private WaveHelper mWaveHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WaveView waveView = (WaveView) findViewById(R.id.wave);
        mWaveHelper = new WaveHelper(waveView);

        waveView.postDelayed(new Runnable() {
            @Override
            public void run() {

                mWaveHelper.start();
            }
        }, 2000);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
