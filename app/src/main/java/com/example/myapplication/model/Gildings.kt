package com.example.myapplication.model


import com.google.gson.annotations.SerializedName


data class Gildings(

	@field:SerializedName("gid_1")
	val gid1: Int? = null,

	@field:SerializedName("gid_2")
	val gid2: Int? = null,

	@field:SerializedName("gid_3")
	val gid3: Int? = null
)