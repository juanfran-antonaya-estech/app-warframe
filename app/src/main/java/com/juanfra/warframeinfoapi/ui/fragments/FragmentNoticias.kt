package com.juanfra.warframeinfoapi.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.databinding.FragmentNoticiasBinding
import com.juanfra.warframeinfoapi.model.WarfraModel
import com.juanfra.warframeinfoapi.model.data.defaultEndpoint.Noticia
import com.juanfra.warframeinfoapi.ui.adapters.AdaptadorNoticias

class FragmentNoticias : Fragment() {

    companion object {
        lateinit var viewModel: WarfraModel
    }

    private lateinit var binding: FragmentNoticiasBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoticiasBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setNews(1)

        viewModel.getNews().observe(viewLifecycleOwner){
            rellenarRecycler(ArrayList(it.sortedByDescending { it.date }))
        }


    }

    fun rellenarRecycler(listado: ArrayList<Noticia>){
        val adaptador = AdaptadorNoticias(listado)
        val layoutManager = LinearLayoutManager(requireContext())

        binding.recyclerNoticias.adapter = adaptador
        binding.recyclerNoticias.layoutManager = layoutManager
    }
}