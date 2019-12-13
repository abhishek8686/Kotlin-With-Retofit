package com.example.myapplication.model


import com.google.gson.annotations.SerializedName


data class AllAwardingsItem(

	@field:SerializedName("end_date")
	val endDate: Any? = null,

	@field:SerializedName("icon_url")
	val iconUrl: String? = null,

	@field:SerializedName("icon_width")
	val iconWidth: Int? = null,

	@field:SerializedName("award_sub_type")
	val awardSubType: String? = null,

	@field:SerializedName("is_new")
	val isNew: Boolean? = null,

	@field:SerializedName("coin_reward")
	val coinReward: Int? = null,

	@field:SerializedName("days_of_drip_extension")
	val daysOfDripExtension: Int? = null,

	@field:SerializedName("icon_height")
	val iconHeight: Int? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("resized_icons")
	val resizedIcons: List<ResizedIconsItem?>? = null,

	@field:SerializedName("coin_price")
	val coinPrice: Int? = null,

	@field:SerializedName("subreddit_coin_reward")
	val subredditCoinReward: Int? = null,

	@field:SerializedName("award_type")
	val awardType: String? = null,

	@field:SerializedName("subreddit_id")
	val subredditId: String? = null,

	@field:SerializedName("is_enabled")
	val isEnabled: Boolean? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("days_of_premium")
	val daysOfPremium: Int? = null,

	@field:SerializedName("start_date")
	val startDate: Any? = null
)