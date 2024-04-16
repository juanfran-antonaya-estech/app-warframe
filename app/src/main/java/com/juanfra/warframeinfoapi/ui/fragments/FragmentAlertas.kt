package com.juanfra.warframeinfoapi.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.databinding.FragmentAlertasBinding
import com.juanfra.warframeinfoapi.model.WarfraModel
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Alerta
import com.juanfra.warframeinfoapi.ui.adapters.AdaptadorAlertas


class FragmentAlertas : Fragment() {

    private lateinit var binding: FragmentAlertasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlertasBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setDefaultAlerts()
        viewModel.getAlerts().observe(viewLifecycleOwner){
            llenarAdapter(it)
        }

    }

    fun llenarAdapter(listado: ArrayList<Alerta>){

        val adaptadorAlertas = AdaptadorAlertas(listado)
        val layoutmanager = LinearLayoutManager(context)
        binding.recyclerAlertas.adapter = adaptadorAlertas
        binding.recyclerAlertas.layoutManager = layoutmanager

    }

    companion object {
        lateinit var viewModel: WarfraModel
    }
}