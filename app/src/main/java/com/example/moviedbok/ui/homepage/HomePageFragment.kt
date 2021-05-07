package com.example.moviedbok.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import com.example.moviedbok.R

class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val testCLick: TextView = view.findViewById(R.id.editTextSearch)
        testCLick.setOnClickListener {
            var bundle = Bundle().apply {
                putInt("id", 30)
            }
            NavHostFragment.findNavController(this).navigate(R.id.searchFragment, bundle)
        }
    }
}