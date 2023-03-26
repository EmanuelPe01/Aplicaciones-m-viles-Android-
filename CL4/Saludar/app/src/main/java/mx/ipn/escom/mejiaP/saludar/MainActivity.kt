package mx.ipn.escom.mejiaP.saludar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USERNAME = "mx.ipn.escom.mejiaP.saludar.extra.USERNAME"
    }

    private val LOG_TAG = MainActivity::class.java.simpleName
    private var mMessageEditText: EditText? = null
    private lateinit var mReplyTextView: TextView
    val TEXT_REQUEST:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.edit_name)

        //Mensaje de respuesta
        mReplyTextView = findViewById(R.id.text_message_reply)

        //Mensaje de Logueo
        Log.d(LOG_TAG, "------")
        Log.d(LOG_TAG, "onCreate")

        if (savedInstanceState != null) {
            val isVisible = savedInstanceState.getBoolean("reply_visible")
            if (isVisible) {
                mReplyTextView.setVisibility(View.VISIBLE)
                mReplyTextView.setText(
                    savedInstanceState
                        .getString("reply_text")
                )
                mReplyTextView.setVisibility(View.VISIBLE)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if (mReplyTextView.getVisibility() === View.VISIBLE) {
            outState.putBoolean("reply_visible", true)
            outState.putString(
                "reply_text",
                mReplyTextView!!.text.toString()
            )
        }
    }


    fun saludar(view: View) {
        val intent = Intent(this, SaludarActivity::class.java)
        val message:String = mMessageEditText?.text.toString()
        Log.d(LOG_TAG, message)
        intent.putExtra(EXTRA_USERNAME, message)
        //startActivity(intent)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent? ) {
        super.onActivityResult(requestCode, resultCode, data)
        var mensaje:String? = null
        if (requestCode == TEXT_REQUEST){
            if (resultCode == RESULT_OK){
                val reply: String? = data?.getStringExtra(SaludarActivity.EXTRA_REPLY)
                try{
                    val hour: Int? = reply?.toInt()
                    if (hour != null) {
                        mensaje = when (hour){
                            in 4..11 -> "¡Buenos días!"
                            in 12..19 -> "¡Buenas tardes!"
                            else -> "¡Buenas noches!"
                        }
                    }
                } catch (ex: java.lang.NumberFormatException){
                    mensaje = "Hola de nuevo"
                }

                mReplyTextView?.setText(mensaje)
                mReplyTextView?.setVisibility(View.VISIBLE)
            }
        }
    }
}
