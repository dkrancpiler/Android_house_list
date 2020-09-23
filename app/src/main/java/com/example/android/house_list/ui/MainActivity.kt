package com.example.android.house_list.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.android.house_list.R
import com.example.android.house_list.data.HousePull
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        val apihouses = HousePull()

        GlobalScope.launch (Dispatchers.Main) {
            val currentHouses = apihouses.gethouselist()
            textView.text = currentHouses.data.toString()
        }
    }
}
