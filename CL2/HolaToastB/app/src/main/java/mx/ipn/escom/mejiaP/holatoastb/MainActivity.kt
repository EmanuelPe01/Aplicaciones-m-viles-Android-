package mx.ipn.escom.mejiaP.holatoastb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount:Int = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showMessage(view: View) {
        val toast = Toast.makeText(this, R.string.text_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUP(view: View){
        mCount++
        mShowCount?.setText(Integer.toString(mCount))
    }
}