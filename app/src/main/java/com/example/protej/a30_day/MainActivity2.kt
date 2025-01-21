package com.example.protej.a30_day

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val button=findViewById<Button>(R.id.cearma)
        val button1=findViewById<Button>(R.id.Broser)

        button.setOnClickListener {

            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE) // Camera kholne ka action
            startActivity(cameraIntent) // Camera app ko launch karte hain
        }
button1.setOnClickListener {

    val intent=Intent(Intent.ACTION_VIEW)
    intent.data= Uri.parse("https://github.com/raj-9693")
    startActivity(intent)
}



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}