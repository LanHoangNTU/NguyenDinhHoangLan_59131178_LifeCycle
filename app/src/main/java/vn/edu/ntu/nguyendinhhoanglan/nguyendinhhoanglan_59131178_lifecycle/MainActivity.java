package vn.edu.ntu.nguyendinhhoanglan.nguyendinhhoanglan_59131178_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String message = "onCreate called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String message = "onStart called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
        String strDate = stf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String message = "onResume called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String message = "onRestart called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        String message = "onPause called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        String message = "onStop called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String message = "onDestroy called!";
        Log.d("LifeCycle", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
