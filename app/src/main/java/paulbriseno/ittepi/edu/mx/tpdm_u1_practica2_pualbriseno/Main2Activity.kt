package paulbriseno.ittepi.edu.mx.tpdm_u1_practica2_pualbriseno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class Main2Activity : AppCompatActivity() {
    var layoposR : LinearLayout?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        layoposR=findViewById(R.id.layo_posR)

        layoposR?.setVisibility(View.GONE)


    }
}
