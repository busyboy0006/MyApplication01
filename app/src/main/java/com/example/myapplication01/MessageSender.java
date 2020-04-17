package com.example.myapplication01;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MessageSender extends AsyncTask<Void, Void, Void> {
    Socket client;
    DataOutputStream dos;

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            client = new Socket("192.168.43.105", 8080);
            dos = new DataOutputStream(client.getOutputStream());
            String data = "hello from ANDROID";
            int num = 10;
            while (num < 200){
                dos.writeChar(num);
                num++;
            }
            dos.flush();
            dos.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
