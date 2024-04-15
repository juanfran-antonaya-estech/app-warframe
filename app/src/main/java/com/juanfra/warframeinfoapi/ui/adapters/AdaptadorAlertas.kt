package com.juanfra.warframeinfoapi.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.juanfra.warframeinfoapi.databinding.AlertsHolderBinding
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta

class AdaptadorAlertas(var listado: ArrayList<Alerta>) : RecyclerView.Adapter<AdaptadorAlertas.MiCelda>(){
    inner class MiCelda(var binding: AlertsHolderBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiCelda {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = AlertsHolderBinding.inflate(layoutInflater, parent, false)
        return MiCelda(binding)
    }

    override fun getItemCount(): Int {
        return listado.size
    }

    override fun onBindViewHolder(holder: MiCelda, position: Int) {
        val alerta = listado[position]
        val mision = alerta.mission


        with(holder.binding){
            tvAlertMissionDesc.text = mision.description
            tvAlertMissionExpiry.text = alerta.expiry
            tvAlertMissionFaction.text = mision.faction
            tvAlertMissionType.text = mision.type
            tvAlertMissionNode.text = mision.node
            tvAlertsReward.text = mision.reward.asString

            Glide.with(holder.itemView)
                .load(mision.reward.thumbnail)
                .into(ivRewards)
        }

    }


}