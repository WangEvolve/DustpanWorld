package com.bbguiot.dustpanworld.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bbguiot.dustpanworld.R;

/**
 * @Date: 2023/2/16 17:36
 * @Name: Went Sister
 * @Email: 2534895738@gmail.com
 **/
public class RegisterActivity extends AppCompatActivity {

    Button bt_back_login = findViewById(R.id.bt_back_login);
    ImageButton register_back = findViewById(R.id.register_back);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //点击返回登录页面
        bt_back_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //点击左上角返回
        register_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //验证手机号码
    private void checkUSphoneNumber(String phoneNumber) {
        if (TextUtils.isEmpty(phoneNumber)) {
            Toast.makeText(RegisterActivity.this, "手机号码不能为空!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (phoneNumber.length() < 11) {
            Toast.makeText(RegisterActivity.this, "手机号码长度为11个字符", Toast.LENGTH_SHORT).show();
            return;
        }
        if (phoneNumber.contains("@")) {
            Toast.makeText(RegisterActivity.this, "手机号码不能包含特殊字符", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    //验证密码
    private void checkUSPassword(String password, String rePassword) {
        if (password.length() < 8||password.length()>20) {
            Toast.makeText(RegisterActivity.this, "密码长度为8——20个字符", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(RegisterActivity.this, "密码不能为空!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!password.equals(rePassword)) {
            Toast.makeText(RegisterActivity.this, "两次输入的密码不一致!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
