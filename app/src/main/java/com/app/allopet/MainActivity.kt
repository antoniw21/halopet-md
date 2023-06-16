package com.app.allopet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import com.app.allopet.UploadPhotoActivity.ImportPhotoActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var _bg__home_ek2: View
    private lateinit var rectangle_139: View
    private lateinit var windah_basudara: TextView
    private lateinit var woof_woof_: TextView
    private lateinit var upload_your_pet_photo: TextView
    private lateinit var vector: ImageView
    private lateinit var vector_ek1: ImageView
    private lateinit var vector_ek2: ImageView
    private lateinit var vector_ek3: ImageView
    private lateinit var vector_ek4: ImageView
    private lateinit var vector_ek5: ImageView
    private lateinit var what_are_you_looking_for_: TextView
    private lateinit var ellipse_28: ImageView
    private lateinit var rectangle_4: View
    private lateinit var rectangle_140: View
    private lateinit var vector_ek6: ImageView
    private lateinit var vector_ek7: ImageView
    private lateinit var vector_ek8: ImageView
    private lateinit var vector_ek9: ImageView
    private lateinit var rectangle_141: View
    private lateinit var vector_ek10: ImageView
    private lateinit var rectangle_142: View
    private lateinit var vector_ek11: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _bg__home_ek2 = findViewById(R.id._bg__home_ek2)
        rectangle_139 = findViewById(R.id.rectangle_139)
        windah_basudara = findViewById(R.id.windah_basudara)
        woof_woof_ = findViewById(R.id.woof_woof_)
        upload_your_pet_photo = findViewById(R.id.upload_your_pet_photo)
        vector = findViewById(R.id.vector)
        vector_ek1 = findViewById(R.id.vector_ek1)
        vector_ek2 = findViewById(R.id.vector_ek2)
        vector_ek3 = findViewById(R.id.vector_ek3)
        vector_ek4 = findViewById(R.id.vector_ek4)
        vector_ek5 = findViewById(R.id.vector_ek5)
        what_are_you_looking_for_ = findViewById(R.id.what_are_you_looking_for_)
        ellipse_28 = findViewById(R.id.ellipse_28)
        rectangle_4 = findViewById(R.id.rectangle_4)
        rectangle_140 = findViewById(R.id.rectangle_140)
        vector_ek6 = findViewById(R.id.vector_ek6)
        vector_ek7 = findViewById(R.id.vector_ek7)
        vector_ek8 = findViewById(R.id.vector_ek8)
        vector_ek9 = findViewById(R.id.vector_ek9)
        rectangle_141 = findViewById(R.id.rectangle_141)
        vector_ek10 = findViewById(R.id.vector_ek10)
        rectangle_142 = findViewById(R.id.rectangle_142)
        vector_ek11 = findViewById(R.id.vector_ek11)

        // Custom code goes here

        val btnOpenCamera: Button = findViewById(R.id.rectangle_142)
        btnOpenCamera.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rectangle_142 -> {
                val moveIntent = Intent(this@MainActivity, ImportPhotoActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}