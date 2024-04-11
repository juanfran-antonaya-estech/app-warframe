package com.juanfra.warframeinfoapi.ui

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.juanfra.warframeinfoapi.R
import com.juanfra.warframeinfoapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navHost = supportFragmentManager.findFragmentById(R.id.fcv1) as NavHost
        navController = navHost.navController
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.nav_inicio,
            R.id.nav_alerts,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio,
            R.id.nav_inicio
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
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
}