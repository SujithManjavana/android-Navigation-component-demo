package com.sujith.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sujith.navigationcomponentdemo.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val input = arguments?.getString("user_input")
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        binding.textView2.text = input
        return binding.root
    }
}