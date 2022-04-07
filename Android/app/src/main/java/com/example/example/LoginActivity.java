package com.example.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends Activity {
    TextInputLayout textFieldEmail;
    TextInputEditText txtEmail;
    TextInputLayout textFieldPassword;
    TextInputEditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textFieldEmail = findViewById(R.id.textFieldEmail);
        txtEmail = findViewById(R.id.txtEmail);
        textFieldPassword = findViewById(R.id.textFieldPassword);
        txtPassword = findViewById(R.id.txtPassword);
    }

    public void handleChangeLayoutClick(View view) {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void handleClick(View view) {
        textFieldEmail.setError("");
        textFieldPassword.setError("");
        if( txtEmail.getText().toString().equals(""))
            textFieldEmail.setError("Вкажіть пошту");
        if( txtPassword.getText().toString().length() != 5)
            textFieldPassword.setError("Некоректний пароль");
    }
}
