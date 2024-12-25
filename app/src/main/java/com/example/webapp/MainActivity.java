package com.example.webapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt_hoten, edt_lop, edt_masv;
    Button btn_xemtt, btn_webapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt_hoten = findViewById(R.id.edt_hoten);
        edt_lop = findViewById(R.id.edt_lop);
        edt_masv = findViewById(R.id.edt_masv);
        btn_xemtt = findViewById(R.id.btn_xemtt);
        btn_webapp = findViewById(R.id.btn_webapp);

        btn_xemtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edt_hoten.getText().toString();
                String lop = edt_lop.getText().toString();
                String masv = edt_masv.getText().toString();
                // Hiển thị dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông Tin Sinh Viên")
                        .setMessage("Họ Tên: " + hoten + "\nLớp: " + lop + "\nMã SV: " + masv)
                        .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
                builder.create().show();
            }
        });
        btn_webapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}