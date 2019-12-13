package com.example.myapplication.model


import com.google.gson.annotations.SerializedName


data class ResizedIconsItem(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)