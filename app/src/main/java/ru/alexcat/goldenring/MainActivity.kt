package ru.alexcat.goldenring
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate called")
        Toast.makeText(this, "" + getString(R.string.toast_info), Toast.LENGTH_SHORT).show()

      //  val radioGroup = findViewById<View>(R.id.rg_icon) as RadioGroup
       // val rb_eng = findViewById<View>(R.id.rb_eng)
       // val rb_rus = findViewById<View>(R.id.rb_eng)


    }


    override fun onResume() {
        super.onResume()


        val btnSmallRing = findViewById<View>(R.id.btn_smallRing)
        val btnBigRing = findViewById<View>(R.id.btn_bigRing)
        val btnInfo = findViewById<View>(R.id.btn_info)


        btnSmallRing.setOnClickListener {
            val intent = Intent(this, SmallRing::class.java)
            startActivity(intent)
        }
        btnBigRing.setOnClickListener {
            val intent = Intent(this, BigRing::class.java)
            startActivity(intent)
        }
        btnInfo.setOnClickListener {
            val intent = Intent(this, Information::class.java)
            startActivity(intent)
        }


    }
}




