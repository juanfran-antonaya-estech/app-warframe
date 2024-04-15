package com.juanfra.warframeinfoapi.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.juanfra.warframeinfoapi.databinding.NewsHolderBinding
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia

class AdaptadorNoticias(var listado: ArrayList<Noticia>) : RecyclerView.Adapter<AdaptadorNoticias.MiCelda>(){
    inner class MiCelda(var binding: NewsHolderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiCelda {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NewsHolderBinding.inflate(layoutInflater, parent, false)
        return MiCelda(binding)
    }

    override fun getItemCount(): Int {
        return listado.size
    }

    override fun onBindViewHolder(holder: MiCelda, position: Int) {
        val noticia = listado[position]

        holder.binding.tvNewsMensaje.text = noticia.message
        holder.binding.tvNewsFecha.text = noticia.date
        holder.binding.tvNewsEta.text = noticia.eta

        Glide.with(holder.itemView)
            .load(noticia.imageLink)
            .into(holder.binding.ivNewsFoto)

    }


}