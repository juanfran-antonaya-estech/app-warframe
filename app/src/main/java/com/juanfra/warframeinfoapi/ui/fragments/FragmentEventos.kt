package com.juanfra.warframeinfoapi.ui.fragments

import AdaptadorEventos
import android.media.metrics.Event
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.databinding.FragmentEventosBinding
import com.juanfra.warframeinfoapi.model.WarfraModel
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Evento


class FragmentEventos : Fragment() {

    private lateinit var binding: FragmentEventosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEventosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setDefaultEvents()
        viewModel.getEvents().observe(viewLifecycleOwner){
            llenarAdapter(it)
        }
    }

    fun llenarAdapter(listado: ArrayList<Evento>){

        val adaptador = AdaptadorEventos(listado)
        val layoutmanager = LinearLayoutManager(context)
        binding.rvEvents.adapter = adaptador
        binding.rvEvents.layoutManager = layoutmanager
    }

    companion object {
        lateinit var viewModel: WarfraModel
    }
}