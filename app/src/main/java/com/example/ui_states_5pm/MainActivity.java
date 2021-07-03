package com.example.ui_states_5pm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtInput;
    private Button mBtnClickHere;
    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtInput = findViewById(R.id.etOne);
        mBtnClickHere = findViewById(R.id.btnClickHere);
        mTvShow = findViewById(R.id.tvShow);

        mBtnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = mEtInput.getText().toString();
                mTvShow.setText(str);
            }
        });
        mEtInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() >= 6)
                    Toast.makeText(MainActivity.this, "" + s.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}