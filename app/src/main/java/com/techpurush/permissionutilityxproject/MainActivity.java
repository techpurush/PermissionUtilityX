package com.techpurush.permissionutilityxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.techpurush.permissionutilityx.PermissionGrantedOrDeniedInterface;
import com.techpurush.permissionutilityx.PermissionUtilsX;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {

        PermissionUtilsX.Builder(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE)
                .requestWithListener(new PermissionGrantedOrDeniedInterface() {
                    @Override
                    public void granted(String... permissions) {

                        Toast.makeText(MainActivity.this, "granted", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void denied(String... permissions) {

                        Toast.makeText(MainActivity.this, "denied", Toast.LENGTH_SHORT).show();


                    }
                });
    }

    private Activity getContext() {
        return this;
    }
}