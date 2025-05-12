package com.example.cashcompass.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cashcompass.ExpenseFragment
import com.example.cashcompass.fragment_income


class AddPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

        override fun getItemCount(): Int = 2 // Income + Expense

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> fragment_income()
                else -> ExpenseFragment()
            }
        }
}

