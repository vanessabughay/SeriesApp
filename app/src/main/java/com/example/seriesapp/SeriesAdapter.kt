package com.example.seriesapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class SeriesAdapter(
    private val series: List<Serie>,
    private val context: Context
) : Adapter<SeriesAdapter.SeriesViewHolder>() {
    inner class SeriesViewHolder(
        private val itemView: View
    ) : ViewHolder(itemView) {
        val serieName = itemView.findViewById<TextView>(R.id.serieName)
        val serieTemporadas = itemView.findViewById<TextView>(R.id.serieTemporadas)
        val serieImage = itemView.findViewById<ImageView>(R.id.serieImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return SeriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return series.size
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        val serie = series[position]
        holder.serieName.text = serie.serieName
        holder.serieTemporadas.text = serie.serieTemporadas
        holder.serieImage.setImageResource(serie.serieImage)



        holder.serieName.setOnClickListener {

            val intent = Intent(context, Tela2::class.java).apply {
                putExtra("serieName", serie.serieName)
                putExtra("serieTemporadas", serie.serieTemporadas)
                putExtra("serieImage", serie.serieImage)
                putExtra("serieAno", serie.serieAno)
                putExtra("serieDesc", serie.serieDesc)
            }

            context.startActivity(intent)
        }
    }

    class Serie(
        val serieImage: Int,
        val serieName: String,
        val serieTemporadas: String,
        val serieAno: String,
        val serieDesc: String
    )
}