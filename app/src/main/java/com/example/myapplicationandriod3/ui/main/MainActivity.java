package com.example.myapplicationandriod3.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.myapplicationandriod3.R;
import com.example.myapplicationandriod3.data.local.PreferenceUtils;
import com.example.myapplicationandriod3.ui.UserInfoActivity;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userName, userPass;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName =  findViewById(R.id.user_name_ed);
        userPass =  findViewById(R.id.user_pass_ed);
        logIn = findViewById(R.id.log_in_btn);
        logIn.setOnClickListener(this);

        if (!PreferenceUtils.getUserName().isEmpty()){
            startActivity(new Intent(this,UserInfoActivity.class));
        }

        if (!PreferenceUtils.gerUserPass().isEmpty()){
            startActivity(new Intent(this,UserInfoActivity.class));
        }



    }

    @Override
    public void onClick(View view) {
        PreferenceUtils.saveUserName(userName.getText().toString());
        Intent intent = new Intent(this, UserInfoActivity.class);
        startActivity(intent);


    }
}