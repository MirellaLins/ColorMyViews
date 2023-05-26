package dev.mlds.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount: TextView = findViewById(R.id.tvCount)
        val btCount = findViewById<Button>(R.id.btCount)
        val btToast: Button = findViewById(R.id.btToast)

        btToast.setOnClickListener {
            val value = if (count > 0) "Contador: $count" else "Hello Mirella!"

            Toast.makeText(this, value, Toast.LENGTH_LONG).show()
        }

        btCount.setOnClickListener {
            count += 1
            tvCount.text = "$count"
        }
    }
}