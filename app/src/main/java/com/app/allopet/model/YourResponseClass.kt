package com.app.allopet.model

data class YourResponseClass(
    val status: String,
    val message: String,
    val data: YourDataClass
)

data class YourDataClass(
    val gambar: String,
    val hasil: String
)
