package com.mirsdev.mirsfang.updateapk;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mirsdev.mirsfang.updataapklib.util.DownloadeApkManager;

public class MainActivity extends AppCompatActivity {
    private Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url="http://res.yuntaohongbao.com/resource/android/user.apk";
        final DownloadeApkManager downloadManager =new DownloadeApkManager(this,"user",url);


        download= (Button) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager.checkUpdateInfo("v4.1.0");
            }
        });
    }
}
