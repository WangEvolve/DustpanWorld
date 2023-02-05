package com.bbguiot.dustpanworld.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.bbguiot.dustpanworld.R;
import com.bbguiot.dustpanworld.fragment.HomeFragment;
import com.bbguiot.dustpanworld.fragment.ShopFragment;
import com.bbguiot.dustpanworld.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment selectFragment = new Fragment();

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
