package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedpref;
    SharedPreferences.Editor sharedpref_Editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //====================
        Toast.makeText(this, "WELCOME TO MYANGELS TECHNOLOGY", Toast.LENGTH_LONG).show();
        sharedpref = getSharedPreferences("MySharedprefAccount", Context.MODE_PRIVATE);

    }

    public void goToSecondScreen(View view) {

        //MessageSender ms = new MessageSender();
        //ms.execute();

        //=====================

        EditText getname = (EditText) findViewById(R.id.edittext01);
        String getnameString = String.valueOf(getname.getText());
        sharedpref_Editor = sharedpref.edit();
        sharedpref_Editor.putString("key1", getnameString);
        sharedpref_Editor.commit();
        Intent intentxx = new Intent(MainActivity.this, SecondActivity.class);
        intentxx.putExtra("myname", getnameString);
        MainActivity.this.startActivity(intentxx);
    }
}
