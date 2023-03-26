package mx.ipn.escom.mejiaP.holatoast

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mCount:Int = 0
    private var mShowCount: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count);
    }

    //Lógica para mostrar un mensaje en pantalla
    fun showMessage(view: View) {
        val toast = Toast.makeText(this, R.string.text_message, Toast.LENGTH_SHORT)
        toast.show()
    }
    //Lógica cambiar el contador en patalla
    fun countUp(view: View) {
        mCount++
        mShowCount?.setText(Integer.toString(mCount));
    }
}