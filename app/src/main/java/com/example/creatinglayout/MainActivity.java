package com.example.creatinglayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk button
    Button btnLogin;

    //deklrasi variabel untuk EditText
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi evem untuk button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittex email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittex password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan password anda: " + password + "", Toast.LENGTH_LONG);
                //menampilkan toast
                t.show();
            }
        });
    }
}