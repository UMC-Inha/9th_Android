package com.example.nikeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nikeapp.databinding.FragmentBagBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentBagBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 뷰 바인딩 초기화가 제대로 되었는지 확인
        binding = FragmentBagBinding.inflate(inflater, container, false)

        // return하는 뷰가 null이 아닌지 확인
        return binding.root
    }

}