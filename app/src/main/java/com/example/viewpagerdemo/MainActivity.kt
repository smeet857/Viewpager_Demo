package com.example.viewpagerdemo

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private lateinit var pageCurlView: PageCurlView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)
        val imageList = listOf(R.drawable.image_1, R.drawable.image_2,R.drawable.image_2)
        pageCurlView = findViewById(R.id.pagecurlView)
        pageCurlView.setCurlView(imageList)
        pageCurlView.setCurlSpeed(600)
        pageCurlView.setCurlMode(PageCurlView.CURLMODE_DYNAMIC)
    }
}
