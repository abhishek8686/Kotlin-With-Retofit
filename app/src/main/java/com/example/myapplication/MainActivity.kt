package com.example.myapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.myapplication.api_call.RestApi
import com.example.myapplication.model.ChildrenItem
import com.example.myapplication.model.RedditModel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var progerssProgressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progerssProgressDialog=ProgressDialog(this)
        progerssProgressDialog.setTitle("Loading")
        progerssProgressDialog.setMessage("Please wait..")
        progerssProgressDialog.setCancelable(false)
        progerssProgressDialog.show()

        val call: Call<RedditModel> = RestApi.getClient.getTop("", "10")
        call.enqueue(object : Callback<RedditModel> {
            override fun onFailure(call: Call<RedditModel>, t: Throwable) {
                progerssProgressDialog.dismiss()
            }

            override fun onResponse(call: Call<RedditModel>, response: Response<RedditModel>) {
                progerssProgressDialog.dismiss()
                val redditModel: RedditModel? = response.body();
                reddit_list.layoutManager = LinearLayoutManager(this@MainActivity)
                reddit_list.adapter = RedditAdapter(
                    this@MainActivity, redditModel?.data?.children as List<ChildrenItem>
                )
            }
        })
    }
}
