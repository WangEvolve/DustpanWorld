package com.bbguiot.dustpanworld.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.bbguiot.dustpanworld.R;
import com.bbguiot.dustpanworld.fragment.HomeFragment;
import com.bbguiot.dustpanworld.fragment.ShopFragment;
import com.bbguiot.dustpanworld.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment selectFragment = new Fragment();
    private ImageButton messageImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        进门默认选择首页
        selectFragment = new HomeFragment();
//        绑定导航栏组件
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();
//        点击右上角“信息”图标跳转到MessageActivity
        messageImageButton = findViewById(R.id.home_message);
        messageImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,MessageActivity.class);
                startActivity(intent);
            }
        });

    }
//       选择导航栏按钮的方法
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            selectFragment = new HomeFragment();
                            break;
                        case R.id.navigation_shop:
                            selectFragment = new ShopFragment();
                            break;
                        case R.id.navigation_user:
                            selectFragment = new UserFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();
                    return true;
                }
            };
}
