package mx.ipn.escom.mejiaP.codignchallenge_5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val ITEM_REQUEST = 1
    private val articulo = arrayOfNulls<TextView>(10)
    private var listArticulo: ArrayList<String> = ArrayList(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        articulo[0] = findViewById(R.id.articulo1)
        articulo[1] = findViewById(R.id.articulo2)
        articulo[2] = findViewById(R.id.articulo3)
        articulo[3] = findViewById(R.id.articulo4)
        articulo[4] = findViewById(R.id.articulo5)
        articulo[5] = findViewById(R.id.articulo6)
        articulo[6] = findViewById(R.id.articulo7)
        articulo[7] = findViewById(R.id.articulo8)
        articulo[8] = findViewById(R.id.articulo9)
        articulo[9] = findViewById(R.id.articulo10)

        if (savedInstanceState != null){
            listArticulo = savedInstanceState.getStringArrayList("ListaArticulos") as ArrayList<String>
            var sizeList = listArticulo.size
            if (listArticulo != null || sizeList > 0){
                for(i in listArticulo.indices){
                    if (sizeList >= 10){
                        Toast.makeText(this, "No se pueden agregar más articulos", Toast.LENGTH_SHORT).show()
                        break
                    }
                    articulo[i]?.setText(listArticulo[i])
                }
            }
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("ListaArticulos", listArticulo)
    }

    fun agregarArticulo(view: View){
        val intent = Intent(this, ListProducts::class.java)
        startActivityForResult(intent, ITEM_REQUEST)
    }

    protected override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ITEM_REQUEST){
            if(resultCode == RESULT_OK){
                var sizeList = listArticulo.size
                val nombreArticulo= data!!.getStringExtra(ListProducts.EXTRA_PRODUCT)

                if (nombreArticulo != null) listArticulo.add(nombreArticulo)

                if (listArticulo != null || sizeList > 0) {
                    for (i in listArticulo.indices) {
                        if (sizeList >= 10) {
                            Toast.makeText(
                                this,
                                "No se pueden agregar más articulos",
                                Toast.LENGTH_SHORT
                            ).show()
                            break
                        }
                        articulo[i]?.setText(listArticulo[i])
                    }
                }
            }
        }
    }
}