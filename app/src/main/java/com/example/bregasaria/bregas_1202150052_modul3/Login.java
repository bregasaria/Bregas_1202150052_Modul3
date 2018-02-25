package com.example.bregasaria.bregas_1202150052_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.txt_pwd);
        btnLogin = findViewById(R.id.signin);

    }
    public void showLogin(View view) {
        if (username.getText().toString().equalsIgnoreCase("EAD") && password.getText().toString().equalsIgnoreCase("MOBILE")){
            Toast.makeText(this, "Hallo, Selamat Datang", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username atau Password yang anda masukkan salah..... please try again", Toast.LENGTH_LONG).show();
        }
    }
}
