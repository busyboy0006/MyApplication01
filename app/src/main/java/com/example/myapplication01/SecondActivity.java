package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.AvailableNetworkInfo;
import android.view.View;
import android.widget.TextView;
import android.telephony.SmsManager;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences getSharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //=====================
        Intent getintent = getIntent();
        String getname = getintent.getExtras().getString("myname");
        //==============
        getSharedPref = getSharedPreferences("MySharedprefAccount", Context.MODE_PRIVATE);
        String sharedpref = getSharedPref.getString("key1", "default");
        //===============
        TextView getusername = (TextView) findViewById(R.id.username05);
        getusername.setText("hello " + getname + ", who am i ?");





    }

    public void searchweb(View view) {
        //==================================

        /*

        HttpURLConnection httpconn = null;
        try {

            URL myurl = new URL("http://192.168.43.105:3307/index.php");
            //URL myurl = new URL("http://www.merslas.onlinewebshop.net/home.php");
            httpconn = (HttpURLConnection) myurl.openConnection();
            //httpconn.setRequestMethod("GET");
            //httpconn.setDoInput(true);
            httpconn.connect();
            Toast.makeText(this, "try block", Toast.LENGTH_SHORT).show();
            /*InputStream inPutStreeam = httpconn.getInputStream();
            InputStreamReader inPutStreamReader = new InputStreamReader(inPutStreeam);
            int data = inPutStreamReader.read();
            while (data != -1) {
                char dataToChar = (char) data;
                data = inPutStreamReader.read();
                Toast.makeText(this, dataToChar, Toast.LENGTH_SHORT).show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (httpconn != null) {
                Toast.makeText(this, "Connection is null", Toast.LENGTH_SHORT).show();
                httpconn.disconnect();
            }
        }*/

        Toast.makeText(this, "Internet is ON", Toast.LENGTH_SHORT).show();

    }
}
