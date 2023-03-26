package mx.ipn.escom.mejiaP.saludar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SaludarActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_REPLY = "mx.ipn.escom.mejiaP.saludar.extra.REPLY"
    }
    private var mReply:EditText? = null
    private val LOG_TAG: String = SaludarActivity::class.java.getSimpleName()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saludar_activity)
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        var textView:TextView? = findViewById(R.id.text_header)
        textView?.text = "¡Hola $message!"

        //Respuesta
        mReply = findViewById(R.id.edit_reply)
    }



    fun returnReply(view: View) {
        val replyIntent = Intent()
        val reply:String = mReply?.text.toString()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SaludarActivity")
        finish()
    }
}