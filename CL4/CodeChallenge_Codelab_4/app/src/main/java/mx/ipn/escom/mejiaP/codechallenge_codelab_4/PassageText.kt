package mx.ipn.escom.mejiaP.codechallenge_codelab_4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class PassageText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.passage_text)
        val intent = intent
        val title:String? = intent.getStringExtra(MainActivity.EXTRA_TITLE)
        val text:String? = intent.getStringExtra(MainActivity.EXTRA_TEXT)

        var title_textView:TextView? = findViewById(R.id.article_heading)
        var text_textView:TextView? = findViewById(R.id.article)

        title_textView?.text = title
        text_textView?.text = text
    }
}