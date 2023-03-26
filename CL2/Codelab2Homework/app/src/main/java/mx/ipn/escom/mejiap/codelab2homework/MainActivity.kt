package mx.ipn.escom.mejiap.codelab2homework

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount:Int = 0
    private var mShowCount: TextView? = null
    private var zeroButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.showCount)
        zeroButton = findViewById(R.id.button_cero)

        if(mCount == 0){
            zeroButton?.setBackgroundColor(Color.parseColor("#808080"))
        }
    }

    fun showMessage(view: View) {
        val toast = Toast.makeText(this, R.string.text_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    @SuppressLint("ResourceAsColor")
    fun restartCount(view: View) {
        mCount = 0
        mShowCount?.setText(Integer.toString(mCount))
        zeroButton?.setBackgroundColor(Color.parseColor("#808080"))
    }

    @SuppressLint("ResourceAsColor")
    fun countUp(view: View) {
        mCount++
        mShowCount?.setText(Integer.toString(mCount))
        zeroButton?.setBackgroundColor(Color.parseColor("#efa111"))
    }
}