package com.example.cashcompass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cashcompass.ui.HomeFragment
import com.example.cashcompass.ui.ProfileFragment
import com.example.cashcompass.ui.StatisticFragment
import com.example.cashcompass.ui.TransactionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homepage : AppCompatActivity() {

    private lateinit var navigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        navigationView=findViewById(R.id.nav_view)

        replace(HomeFragment())

        navigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_home->replace(HomeFragment())
                R.id.nav_transaction->replace(TransactionFragment())
                R.id.nav_statistic->replace(StatisticFragment())
                R.id.nav_profile->replace(ProfileFragment())
            }
            true
        }
    }

    private fun replace(fragment:Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navhost, fragment)
        fragmentTransaction.commit()
    }

}