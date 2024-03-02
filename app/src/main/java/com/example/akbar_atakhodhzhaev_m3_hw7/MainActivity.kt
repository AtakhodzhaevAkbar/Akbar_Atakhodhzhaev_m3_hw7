package com.example.akbar_atakhodhzhaev_m3_hw7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bannerFragment=BannerFragment()
        val playListFragment=PlayListFragment()
        supportFragmentManager.beginTransaction().add(R.id.container1, bannerFragment).commit()
        supportFragmentManager.beginTransaction().add(R.id.container2, playListFragment).commit()
    }
}