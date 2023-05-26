package dev.mlds.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class ColorMyViewsActivity : AppCompatActivity() {

    private var itemEscolhido: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)

        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.TextView2)
        val textView3: TextView = findViewById(R.id.TextView3)

        val btRed: Button = findViewById(R.id.btRed)

        textView1.setOnClickListener {
            itemEscolhido = it as TextView
        }

        textView2.setOnClickListener {
            itemEscolhido = it as TextView
        }

        textView3.setOnClickListener {
            itemEscolhido = textView3
        }

        btRed.setOnClickListener {
            val resColorRed = ContextCompat.getColor(this, R.color.red)
            itemEscolhido?.setBackgroundColor(resColorRed)
        }
    }
}