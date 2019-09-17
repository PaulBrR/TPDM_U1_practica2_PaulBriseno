package paulbriseno.ittepi.edu.mx.tpdm_u1_practica2_pualbriseno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lista:ListView?=null
    var celdas:EditText?=null
    var renglones :EditText?=null
    var raGroup1:RadioGroup?=null
    var rbVector :RadioButton?=null
    var rbMatriz : RadioButton?=null
    var layorenglones:LinearLayout?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lista=findViewById(R.id.menuListView)
        celdas=findViewById(R.id.celdillas)
        renglones=findViewById(R.id.renglones)
        raGroup1=findViewById(R.id.rg)
        rbMatriz=findViewById(R.id.rbMatriz)
        rbVector=findViewById(R.id.rbVector)
        layorenglones=findViewById(R.id.layo_de_renglones)


        rbVector?.setOnClickListener { layorenglones?.setVisibility(View.GONE) }
        rbMatriz?.setOnClickListener { layorenglones?.setVisibility(View.VISIBLE) }

        lista?.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {

                0 -> abrirCapturar()
                1 -> abrirMostrar()
                2 -> abrirAcercaDe()
                3 -> finish()

            }
        }


    }
    fun abrirCapturar(){

        if(rbMatriz?.isChecked==true){
            var momento1 :Boolean=true

            if(celdillas?.text.toString().isEmpty()==true){
                val alerta= AlertDialog.Builder(this)
                alerta.setTitle("ERROR").setMessage("No debe estar vacio el Campo de Celdillas").show()
                return
            }

            if(renglones?.text.toString().isEmpty()==true){
                val alerta =AlertDialog.Builder(this)
                alerta.setTitle("ERROR").setMessage("No debe estar vacio el campo de Renglones").show()
                return
            }
            var CapturarDatos = Intent(this,Main2Activity::class.java)


            startActivity(CapturarDatos)
        }


        if(rbVector?.isChecked==true){


            if(celdillas?.text.toString().isEmpty()==true){
                val alerta = AlertDialog.Builder(this)
                alerta.setTitle("ERROR").setMessage("No debe estar vacio el campo de celdillas").show()
                return
            }
            var CapturarDatos = Intent(this,Main2Activity::class.java)

            startActivity(CapturarDatos)

        }

    }

    fun abrirMostrar(){
        var abrirMostrar = Intent(this,Main3Activity::class.java)

        startActivity(abrirMostrar)


    }
    fun abrirAcercaDe(){
        val acercaDe =AlertDialog.Builder(this)
        acercaDe.setTitle("Acerca De...").setMessage("(c) Paul Alberto Briseno Rosales").setPositiveButton("Aceptar"){dialogInterface, i ->  }.show()



    }
}
