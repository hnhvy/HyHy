package com.example.hyhy.EmailLoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.hyhy.MainActivity;
import com.example.hyhy.R;

public class EmailLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);
        /////////////status bar hide start ///////////////
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /////////////status bar hide end ///////////////
    }

    public void goToRegister(View view) {
        Intent intent = new Intent(EmailLoginActivity.this,EmailRegisterActivity.class);
        startActivity(intent);
        Animatoo.animateSlideLeft(this);
        finish();
    }

    public void backToMainPage(View view) {
        Intent intent = new Intent(EmailLoginActivity.this, MainActivity.class);
        startActivity(intent);
        Animatoo.animateSlideRight(this);
        finish();
    }
}