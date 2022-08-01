package com.almerio.recyclerview.firstrecyclerview

import android.content.Context
import com.almerio.recyclerview.R

class AnimalModel(val context: Context) {
    fun getAnimalList(): Array<String>{
        return context.resources.getStringArray(R.array.animalList)
    }
}