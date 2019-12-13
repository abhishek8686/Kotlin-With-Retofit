package com.example.myapplication.model


import com.google.gson.annotations.SerializedName


data class ImagesItem(

	@field:SerializedName("resolutions")
	val resolutions: List<ResolutionsItem?>? = null,

	@field:SerializedName("source")
	val source: Source? = null,

	@field:SerializedName("variants")
	val variants: Variants? = null,

	@field:SerializedName("id")
	val id: String? = null
)