package ru.alexcat.goldenring

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Information : AppCompatActivity() {
    private val url1 : String ="https://tourweek.ru/articles/world/277593"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
    }

    override fun onStart() {
        super.onStart()
        val goUri = findViewById<View>(R.id.btn_uri)

        goUri.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url1)
                      startActivity(intent)
        }
    }
}