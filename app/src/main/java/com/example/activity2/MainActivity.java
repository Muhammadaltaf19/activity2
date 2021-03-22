package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edEml, edPwd;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnLogin = findViewById(R.id.btSignin);
        edEml = findViewById(R.id.tEmail);
        edPwd = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edEml.getText().toString();
                password = edPwd.getText().toString();

                String email = "altaf@gmaill.com";
                String pass = "altaf";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),"Email dan password wajib diisi",Toast.LENGTH_LONG);
                    t.show();
                } else {
                    if (nama.equals("altaf@gmail.com") && password.equals("altaf")) {
                        Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                        i.putExtras(b);

                        startActivity(i);
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });
    }
}