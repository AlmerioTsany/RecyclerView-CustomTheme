package com.almerio.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.almerio.recyclerview.databinding.ActivityMainBinding
import com.almerio.recyclerview.firstrecyclerview.FirstActivity
import com.almerio.recyclerview.secondrecyclerview.SecondActivity
import com.almerio.recyclerview.thirdrecyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstRecyclerView.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        binding.secondRecyclerView.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            startActivity(intent2)
        }

        binding.thirdRecyclerView.setOnClickListener {
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)
        }
    }
}