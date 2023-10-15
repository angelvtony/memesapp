package com.example.memeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memeapp.databinding.ActivityMainBinding
import com.example.memeapp.databinding.RvItemBinding
import com.example.memeapp.model.Meme
import com.squareup.picasso.Picasso

class RecyclerViewAdapter (private val memesList:List<Meme>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    class ViewHolder(val binding: RvItemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return memesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = memesList[position]
        holder.binding.apply {
            textView.text = currentItem.name
            Picasso.get().load(currentItem.url).into(imageView)
        }
    }
}