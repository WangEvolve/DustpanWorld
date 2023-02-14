package com.bbguiot.dustpanworld.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.bbguiot.dustpanworld.R;

/**
 * @Date: 2023/2/15 4:24
 * @Name: Wang Evolve
 * @Email: w35417091@gmail.com
 **/
public class SearchActivity extends AppCompatActivity {

    private ImageButton searchbackImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //返回首页按钮
        searchbackImageButton = findViewById(R.id.search_back);
        searchbackImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SearchActivity.this,HomeActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


    }
}
