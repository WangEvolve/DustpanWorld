package com.bbguiot.dustpanworld.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.widget.EditText;

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
    }

}