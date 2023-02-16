package com.bbguiot.dustpanworld.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.bbguiot.dustpanworld.R;

public class LoginActivity extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //设置提示输入手机号码字体大小
       EditText ed_phone = findViewById(R.id.ed_phone);
        SpannableString s = new SpannableString("请输入手机号码");
        AbsoluteSizeSpan ts = new AbsoluteSizeSpan(14, true);
        s.setSpan(ts, 0, s.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ed_phone.setHint(s);

        //设置提示输入密码字体大小
        EditText ed_password = findViewById(R.id.ed_password);
        SpannableString s2 = new SpannableString("请输入密码");
        AbsoluteSizeSpan ts2 = new AbsoluteSizeSpan(14, true);
        s2.setSpan(ts2, 0, s2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ed_password.setHint(s2);

        //右上角返回
        ImageButton login_back = findViewById(R.id.login_back);
        login_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //点击注册按钮
        Button bt_register= findViewById(R.id.bt_register);
        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }

}