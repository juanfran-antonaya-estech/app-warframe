package com.juanfra.warframeinfoapi.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.core.view.GravityCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.model.WarfraModel
import com.juanfra.warframeinfoapi.databinding.ActivityMainBinding
import com.juanfra.warframeinfoapi.ui.fragments.FragmentAlertas
import com.juanfra.warframeinfoapi.ui.fragments.FragmentEventos
import com.juanfra.warframeinfoapi.ui.fragments.FragmentNoticias

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    var viewModel: WarfraModel = WarfraModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navHost = supportFragmentManager.findFragmentById(R.id.fcv1) as NavHost
        navController = navHost.navController
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.nav_inicio,
            R.id.nav_events,
            R.id.nav_news,
            R.id.nav_alerts,
            R.id.nav_syndicateMissions,
            R.id.nav_fissures,
            R.id.nav_flashSales,
            R.id.nav_invasions,
            R.id.nav_darkSectors,
            R.id.nav_voidTraders,
            R.id.nav_dailyDeals,
            R.id.nav_conclaveChallenges,
            R.id.nav_cycle,
            R.id.nav_weeklyChallenges,
            R.id.nav_nightwave,
            R.id.nav_kuva,
            R.id.nav_arbitration,
            R.id.nav_steelPath,
            R.id.nav_vaultTrader,
            R.id.nav_archonHunt,
            R.id.nav_duviriCycle
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navigationView.setupWithNavController(navController)


        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (binding.dl1.isDrawerOpen(GravityCompat.START)) {
                    binding.dl1.closeDrawer(GravityCompat.START)
                } else {
                    if (!navController.navigateUp())
                        finish()
                }
            }
        })

        viewModel.firstTime()
        viewModel.getDefaultEndpoint().observe(this){
            Log.d("el yeison", it.toString())
        }

        giveViewModel(viewModel)
    }

    private fun giveViewModel(viewModel: WarfraModel) {
        FragmentNoticias.viewModel = viewModel
        FragmentAlertas.viewModel = viewModel
        FragmentEventos.viewModel = viewModel
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
}