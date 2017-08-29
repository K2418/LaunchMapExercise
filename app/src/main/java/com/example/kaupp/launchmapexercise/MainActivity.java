package com.example.kaupp.launchmapexercise;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Double2;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowMap(View view){
        EditText latText = (EditText) findViewById(R.id.latitude);
        EditText lngText = (EditText) findViewById(R.id.longitude);
        double lat = Double.parseDouble(latText.getText().toString());
        double lng = Double.parseDouble(lngText.getText().toString());

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);

    }
}
