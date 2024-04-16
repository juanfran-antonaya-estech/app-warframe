package com.juanfra.warframeinfoapi.ui.adapters

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.getColor
import androidx.core.graphics.ColorUtils
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
import androidx.core.graphics.toColorLong
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.chip.Chip
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.databinding.AlertsHolderBinding
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import kotlin.coroutines.coroutineContext

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
            tvAlertMissionDesc.text = "Misión sin nombre"
            mision.description?.let {
                tvAlertMissionDesc.text = it
            }
            tvAlertMissionExpiry.text = alerta.expiry
            tvAlertMissionFaction.text = mision.faction
            tvAlertMissionType.text = mision.type
            tvAlertMissionNode.text = mision.node
            tvAlertsReward.text = mision.reward.asString

            filltags(llAlertTags, alerta, holder.itemView.context)

            Glide.with(holder.itemView)
                .load(mision.reward.thumbnail)
                .into(ivAlertRewards)
        }

    }

    private fun getColorFromInt(color: Int): String {
        val colorin = "#" + color.toString().substring(0, 6)
        return colorin
    }
    private fun isDark(hexColor: String) : Boolean {
        return ColorUtils.calculateLuminance(hexColor.substring(1).toInt()) < 0.5
    }

    private fun filltags(ll: LinearLayout, alerta: Alerta, context: Context) {
        ll.addView(createChip(if (alerta.active){
            "activo"
        } else {
            "inactivo"
        }, context))

        alerta.tag?.let {
            ll.addView(createChip(it, context))
        }

        if (alerta.mission.nightmare){
            ll.addView(createChip("Pesadilla", context))
        }

        if (alerta.mission.archwingRequired){
            ll.addView(createChip("Archwing", context))
        }
    }

    private fun createChip(s: String, context: Context): View? {
        val chip = Chip(context)
        chip.text = s

        return chip
    }


}