package mx.ipn.escom.mejiap.codelab1homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.e("Mensaje de registro tipo: ", "Error");
        //Log.d("Mensaje de registro tipo: ", "Debug");
        Log.i("Mensaje de registro tipo: ", "INFO");
        //Log.v("Mensaje de registro tipo: ", "VERBOSE");
        //Log.w("Mensaje de registro tipo: ", "WARNING");
        //Log.wtf("Mensaje de registro tipo: ", "What a Terrible Failure");
    }
}