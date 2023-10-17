package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Tombol Logout
        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Logout di sini
                navigateToMainActivity();  // Call the method to navigate to MainActivity
            }
        });

        // Tombol Ambil Absensi
        Button btnAmbilAbsensi = findViewById(R.id.btnAmbilAbsensi);
        btnAmbilAbsensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, ambilabsen.class);
                startActivity(intent);
            }
        });

        // Tombol Daftar Matakuliah
        Button btnDaftarMatakuliah = findViewById(R.id.btnDaftarMatakuliah);
        btnDaftarMatakuliah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, daftarmatakuliah.class);
                startActivity(intent);
            }
        });
    }

    // Method to navigate to MainActivity
    private void navigateToMainActivity() {
        Intent intent = new Intent(dashboard.this, MainActivity.class);
        startActivity(intent);
        finish();  // Optional: Call finish to close the current activity if needed
    }
}
