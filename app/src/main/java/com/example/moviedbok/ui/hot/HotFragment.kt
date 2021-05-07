package com.example.moviedbok.ui.hot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviedbok.databinding.FragmentHotBinding

class HotFragment : Fragment() {

    private lateinit var binding: FragmentHotBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotBinding.inflate(inflater, container, false)
        return binding.root
    }
}
