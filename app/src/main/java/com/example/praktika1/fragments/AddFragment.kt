package com.example.praktika1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.praktika1.R
import com.example.praktika1.databinding.FragmentAddBinding
import com.example.praktika1.databinding.FragmentDetailsBinding
import com.example.praktika1.databinding.FragmentHomeBinding

class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater)
        return binding.root
    }

}