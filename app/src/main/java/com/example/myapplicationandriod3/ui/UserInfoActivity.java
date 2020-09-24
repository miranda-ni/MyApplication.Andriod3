package com.example.myapplicationandriod3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplicationandriod3.R;
import com.example.myapplicationandriod3.data.local.PreferenceUtils;
import com.example.myapplicationandriod3.ui.main.MainActivity;

public class UserInfoActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView userName;
     Button logOutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

         userName = findViewById(R.id.text_view);
        logOutBtn = findViewById(R.id.log_out_btn);
        userName.setText(PreferenceUtils.getUserName());


        logOutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      PreferenceUtils.onDelete();
        Log.e("yoyo", "on click deleted");
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

    }
}