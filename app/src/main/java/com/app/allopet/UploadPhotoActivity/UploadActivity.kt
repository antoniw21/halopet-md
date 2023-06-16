package com.app.allopet.UploadPhotoActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.allopet.R
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class UploadActivity : AppCompatActivity() {

    private lateinit var _bg__upload_photo_ek2: View
    private lateinit var vector: ImageView
    private lateinit var allopet: TextView
    private lateinit var rectangle_4204: View
    private lateinit var vector_8: ImageView
    private lateinit var rectangle_4205: View
    private lateinit var rectangle_4213: ImageView
    private lateinit var rectangle_142: View
    private lateinit var rectangle_143: View
    private lateinit var upload_photo_ek3: TextView
    private lateinit var take_picture: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        _bg__upload_photo_ek2 = findViewById<View>(R.id._bg__upload_photo_ek2)
        vector = findViewById(R.id.vector)
        allopet = findViewById(R.id.allopet)
        rectangle_4204 = findViewById(R.id.rectangle_4204)
        vector_8 = findViewById(R.id.vector_8)
        rectangle_4205 = findViewById(R.id.rectangle_4205)
        rectangle_4213 = findViewById(R.id.rectangle_4213)
        rectangle_142 = findViewById(R.id.rectangle_142)
        rectangle_143 = findViewById(R.id.rectangle_143)
        upload_photo_ek3 = findViewById(R.id.upload_photo_ek3)
        take_picture = findViewById(R.id.take_picture)

        //
    }
}