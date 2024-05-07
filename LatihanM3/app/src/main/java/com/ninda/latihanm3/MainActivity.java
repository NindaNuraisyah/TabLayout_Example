package com.ninda.latihanm3;

import static android.widget.Toast.LENGTH_LONG;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String lifeCycle = "androidlifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) { // bLOK CODE ONCREATE()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(this, "Posisi lagi start nih", LENGTH_LONG).show();
    }

    public void onStop() {
        super.onStop();
        Toast.makeText(this, "Posisi lagi stop nih", LENGTH_LONG).show();
    }

    public void onResume() {
        super.onResume();
        Toast.makeText(this, "Posisi lagi Resume nih", LENGTH_LONG).show();
        TextView txt1 = findViewById(R.id.txt1);
        txt1.setText("POSISI LAGI RESUME");
        Log.i(lifeCycle, "onResume() called");
    }

    public void onPause() {
        super.onPause();
        Toast.makeText(this, "Posisi lagi pause nih", LENGTH_LONG).show();
        LinearLayout linearLayout = findViewById(R.id.linearParent);
//        Log.i(lifeCycle, "onPause() called");
        // Ubah warna latar belakang LinearLayout
        linearLayout.setBackgroundColor(getResources().getColor(R.color.purple_200));
//        TextView txt1 = findViewById(R.id.txt1);
//        txt1.setText("POSISI LAGI PAUSE");
//        txt1.setTextColor(getColor(R.color.black));
    }

    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Posisi udah hancur  nih", LENGTH_LONG).show();
    }
}