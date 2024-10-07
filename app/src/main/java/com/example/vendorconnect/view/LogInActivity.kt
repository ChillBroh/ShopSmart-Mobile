package com.example.vendorconnect.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vendorconnect.R
import com.example.vendorconnect.adapter.TabLayoutAdapter
import com.example.vendorconnect.databinding.ActivityLogInBinding
import com.example.vendorconnect.fragment.LogInFragment
import com.example.vendorconnect.fragment.SignUpFragment

class LogInActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_VendorConnect_NoActionBar)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = TabLayoutAdapter(supportFragmentManager)
        adapter.addFragment(LogInFragment(),"Log In")
        adapter.addFragment(SignUpFragment(),"Sign Up")
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        /*  tabLayout.getTabAt(0)?.setIcon(R.drawable.vector_card)
          tabLayout.getTabAt(1)?.setIcon(R.drawable.vector_card)
  */
    }

}