package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    TextInputLayout textFieldEmail;
    TextInputEditText txtEmail;
    TextInputLayout textFieldFName;
    TextInputEditText txtFName;
    TextInputLayout textFieldSName;
    TextInputEditText txtSName;
    TextInputLayout textFieldPhoto;
    TextInputEditText txtPhoto;
    TextInputLayout textFieldPhone;
    TextInputEditText txtPhone;
    TextInputLayout textFieldPassword;
    TextInputEditText txtPassword;
    TextView txtReg;
    TextView txtLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFieldEmail = findViewById(R.id.textFieldEmail);
        txtEmail = findViewById(R.id.txtEmail);
        textFieldFName = findViewById(R.id.textFieldFName);
        txtFName = findViewById(R.id.txtFName);
        textFieldSName = findViewById(R.id.textFieldSName);
        txtSName = findViewById(R.id.txtSName);
        textFieldPhoto = findViewById(R.id.textFieldPhoto);
        txtPhoto = findViewById(R.id.txtPhoto);
        textFieldPhone = findViewById(R.id.textFieldPhone);
        txtPhone = findViewById(R.id.txtPhone);
        textFieldPassword = findViewById(R.id.textFieldPassword);
        txtPassword = findViewById(R.id.txtPassword);
        txtReg = findViewById(R.id.textReg);
        txtLog = findViewById(R.id.textLog);

    }

    public Account handleClick(View view) {
        Account account = new Account();
        textFieldEmail.setError("");
        textFieldFName.setError("");
        textFieldSName.setError("");
        textFieldPhoto.setError("");
        textFieldPhone.setError("");
        textFieldPassword.setError("");
        if( txtEmail.getText().toString().equals(""))
            textFieldEmail.setError("Вкажіть пошту");
        else
            account.setEmail(txtEmail.getText().toString());
        if( txtFName.getText().toString().equals(""))
            textFieldFName.setError("Вкажіть ім'я");
        else
            account.setFName(txtFName.getText().toString());
        if( txtSName.getText().toString().equals(""))
            textFieldSName.setError("Вкажіть прізіище");
        else
            account.setSName(txtSName.getText().toString());
        if( txtPhoto.getText().toString().equals(""))
            textFieldPhoto.setError("Вкажіть фото");
        else
            account.setPhoto(txtPhoto.getText().toString());
        if( txtPhone.getText().toString().equals(""))
            textFieldPhone.setError("Вкажіть номер телефону");
        if( txtPassword.getText().toString().equals(""))
            textFieldPassword.setError("Вкажіть пароль");
        else
            account.setPhone(txtPhone.getText().toString());
        if( txtPassword.getText().toString().length() != 5)
            textFieldPassword.setError("Некоректний пароль");
        else
            account.setPassword(txtPassword.getText().toString());

        return account;
    }

    public void handleChangeLayoutClick(View view) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void handleChangeLayoutClickPLaceHolder(View view) {
        Intent i = new Intent(MainActivity.this, PlaceHolderActivity.class);
        startActivity(i);
    }
}