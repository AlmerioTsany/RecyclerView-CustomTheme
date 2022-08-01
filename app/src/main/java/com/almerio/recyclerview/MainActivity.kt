package com.almerio.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.almerio.recyclerview.databinding.ActivityMainBinding
import com.almerio.recyclerview.firstrecyclerview.FirstActivity
import com.almerio.recyclerview.secondrecyclerview.SecondActivity
<<<<<<< HEAD
import com.almerio.recyclerview.thirdrecyclerview.ThirdActivity
=======
>>>>>>> b5263994bfdd4142c4c6208877fac6948713d77f

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
<<<<<<< HEAD

        binding.thirdRecyclerView.setOnClickListener {
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)
        }
=======
>>>>>>> b5263994bfdd4142c4c6208877fac6948713d77f
    }
}