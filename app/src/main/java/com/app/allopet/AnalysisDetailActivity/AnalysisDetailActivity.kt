package com.app.allopet.AnalysisDetailActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.allopet.R
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.app.allopet.model.YourResponseClass
import com.app.allopet.network.YourApiService
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.text.SimpleDateFormat
import java.util.*

class AnalysisDetailActivity : AppCompatActivity() {

    private lateinit var _bg__analysis_detail_ek2: View
    private lateinit var vector: ImageView
    private lateinit var rectangle_4: View
    private lateinit var rectangle_140: View
    private lateinit var vector_ek1: ImageView
    private lateinit var vector_ek2: ImageView
    private lateinit var vector_ek3: ImageView
    private lateinit var rectangle_141: View
    private lateinit var vector_ek4: ImageView
    private lateinit var vector_ek5: ImageView
    private lateinit var rectangle_141_ek1: View
    private lateinit var analysis_detail_ek3: TextView
    private lateinit var result__: TextView
    private lateinit var result_diagnosed: TextView
    private lateinit var image_result: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analysis_detail)

        _bg__analysis_detail_ek2 = findViewById(R.id._bg__analysis_detail_ek2)
        vector = findViewById(R.id.vector)
        rectangle_4 = findViewById(R.id.rectangle_4)
        rectangle_140 = findViewById(R.id.rectangle_140)
        vector_ek1 = findViewById(R.id.vector_ek1)
        vector_ek2 = findViewById(R.id.vector_ek2)
        vector_ek3 = findViewById(R.id.vector_ek3)
        rectangle_141 = findViewById(R.id.rectangle_141)
        vector_ek4 = findViewById(R.id.vector_ek4)
        vector_ek5 = findViewById(R.id.vector_ek5)
        rectangle_141_ek1 = findViewById(R.id.rectangle_141_ek1)
        analysis_detail_ek3 = findViewById(R.id.analysis_detail_ek3)
        result__ = findViewById(R.id.result__)
        result_diagnosed = findViewById(R.id.result_diagnosed)
        image_result = findViewById(R.id.image_result)

        fetchImageData()
    }

    private fun fetchImageData() {
        // Create Retrofit instance
        val retrofit = Retrofit.Builder()
            .baseUrl("http://34.101.242.32:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Create API service
        val apiService = retrofit.create(YourApiService::class.java)

        // Make API call
        val call = apiService.getImageData()
        call.enqueue(object : Callback<YourResponseClass> {
            override fun onResponse(
                call: Call<YourResponseClass>,
                response: Response<YourResponseClass>
            ) {
                if (response.isSuccessful) {
                    val imageData = response.body()
                    handleApiResponse(imageData)
                } else {
                    // Handle API call error
                    val errorBody = response.errorBody()
                    val errorMessage = errorBody?.string()
                    // Display an error message or retry the request
                    Toast.makeText(this@AnalysisDetailActivity, "API Error: $errorMessage", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<YourResponseClass>, t: Throwable) {
                // Handle API call failure
                // Display an error message or retry the request
                Toast.makeText(this@AnalysisDetailActivity, "API Call Failed: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun handleApiResponse(response: YourResponseClass?) {
        val imageUrl = response?.data?.gambar
        val hasil = response?.data?.hasil

        // Display the image using Picasso library
        val imageView: View = findViewById(R.id.image_result)
        val imageResult: ImageView = imageView as ImageView
        Picasso.get().load(imageUrl).into(imageResult)

        // Update the result_diagnosed and date_uploaded TextViews
        val resultDiagnosedTextView: TextView = findViewById(R.id.result_diagnosed)
        resultDiagnosedTextView.text = hasil
    }


}