package com.pqd.sciencefunfactsapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pqd.sciencefunfactsapp.DetailActivity
import com.pqd.sciencefunfactsapp.R
import com.pqd.sciencefunfactsapp.model.FunFact

class FunFactAdapter(
    private val context: Context,
    private val funFacts: List<FunFact>
) : RecyclerView.Adapter<FunFactAdapter.FunFactViewHolder>() {

    class FunFactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunFactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fun_fact, parent, false)
        return FunFactViewHolder(view)
    }

    override fun onBindViewHolder(holder: FunFactViewHolder, position: Int) {
        val fact = funFacts[position]
        holder.titleTextView.text = fact.title
        holder.descriptionTextView.text = fact.description
        holder.imageView.setImageResource(fact.imageResId)

        // Bắt sự kiện click để mở DetailActivity
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("title", fact.title)
                putExtra("description", fact.description)
                putExtra("imageResId", fact.imageResId)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = funFacts.size
}
