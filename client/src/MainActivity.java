package com.example.chatnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText_id;
    private EditText editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        editText_id = (EditText) findViewById(R.id.edit_text_id);
        editText_password = (EditText) findViewById(R.id.edit_text_key);
        Button login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //after click
                switch (v.getId()){
                    case R.id.login_button:
                        String inputId = editText_id.getText().toString();
                        String inputkey = editText_password.getText().toString();
                        Intent intent = new Intent(MainActivity.this,chat.class);
                        intent.putExtra("id",inputId);
                        intent.putExtra("key",inputkey);
                        startActivity(intent);
                    default:
                        break;
                }
            }
        });
    }
}
