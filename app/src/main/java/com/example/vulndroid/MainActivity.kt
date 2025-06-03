
package com.example.vulndroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example button to trigger one vulnerability demo (placeholder)
        findViewById<Button>(R.id.btnDemo).setOnClickListener {
            // Start activity for vulnerability demo
        }
    }
}
