package mx.ipn.escom.mejiaP.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var countTxt:TextView
    private  lateinit var txtMsm: EditText
    private var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countTxt = findViewById(R.id.txt_count)
        txtMsm = findViewById(R.id.txt_msm)

        if(savedInstanceState != null){
            val c = savedInstanceState.getString("contador")
            val m = savedInstanceState.getString("mensaje")
            countTxt.setText(c)
            txtMsm.setText(m)
            count = Integer.parseInt(c);
        }
    }

    fun counter(view: View){
        count++
        countTxt.setText(count.toString())
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("contador", countTxt.text.toString())
        outState.putString("mensaje", txtMsm.text.toString())
    }
}