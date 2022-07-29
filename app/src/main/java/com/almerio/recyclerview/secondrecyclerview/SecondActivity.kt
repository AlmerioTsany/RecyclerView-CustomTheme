package com.almerio.recyclerview.secondrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.almerio.recyclerview.R
import com.almerio.recyclerview.secondrecyclerview.data.Cars
import com.almerio.recyclerview.secondrecyclerview.data.DataCars

class SecondActivity : AppCompatActivity() {

    private lateinit var rvCars: RecyclerView
    private var list: ArrayList<Cars> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rvCars = findViewById(R.id.recycler_view2)
        rvCars.setHasFixedSize(true)

        list.addAll(DataCars.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCars.layoutManager = LinearLayoutManager(this)
        val listCarAdapter = ListCarAdapter(list)
        rvCars.adapter = listCarAdapter
    }
}