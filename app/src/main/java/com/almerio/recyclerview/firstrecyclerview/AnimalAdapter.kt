package com.almerio.recyclerview.firstrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
<<<<<<< HEAD
import com.almerio.recyclerview.databinding.ItemAnimalBinding

class AnimalAdapter(private val animalList: Array<String>): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    inner class AnimalViewHolder(private val itemBinding: ItemAnimalBinding): RecyclerView.ViewHolder(itemBinding.root){
=======
import com.almerio.recyclerview.databinding.AnimalItemBinding

class AnimalAdapter(private val animalList: Array<String>): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    inner class AnimalViewHolder(private val itemBinding: AnimalItemBinding): RecyclerView.ViewHolder(itemBinding.root){
>>>>>>> b5263994bfdd4142c4c6208877fac6948713d77f
        fun bind(word: String){
            itemBinding.animalText.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
<<<<<<< HEAD
        val itemBinding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
=======
        val itemBinding = AnimalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
>>>>>>> b5263994bfdd4142c4c6208877fac6948713d77f
        return AnimalViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val word = animalList[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

}