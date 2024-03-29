package com.example.myapplication.model


import com.google.gson.annotations.SerializedName


data class Preview(

	@field:SerializedName("images")
	val images: List<ImagesItem?>? = null,

	@field:SerializedName("enabled")
	val enabled: Boolean? = null
)