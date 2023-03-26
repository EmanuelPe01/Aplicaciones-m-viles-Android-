package mx.ipn.escom.mejiaP.codignchallenge_5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ListProducts : AppCompatActivity() {

    companion object{
        val EXTRA_PRODUCT = "mx.ipn.escom.mejiaP.codignchallenge_5.extra.PRODUCT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_products)
    }

    fun selectProduct(view: View){
        val registroArticulo = Intent()

        when(view.id){
            R.id.btn_queso -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Queso")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_harina -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Harina")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_huevos-> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Huevos")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_aceite -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Aceite")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_crema -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Crema")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_yogurth -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Yogurth")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_leche -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Leche")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_refresco -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Refresco")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_cereal -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Cereal")
                setResult(RESULT_OK, registroArticulo)
            }
            R.id.btn_galletas -> {
                registroArticulo.putExtra(EXTRA_PRODUCT, "Galletas")
                setResult(RESULT_OK, registroArticulo)
            }
            else -> {
                Toast.makeText(this, "Ocurrió un error", Toast.LENGTH_SHORT).show()
            }
        }
        finish()
    }
}