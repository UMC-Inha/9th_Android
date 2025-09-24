package com.example.umc_flo_app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.umc_flo_app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.homeAlbumImgIv.setOnClickListener {
            Log.d("", "버튼이 클릭되었습니다!")
            val action = HomeFragmentDirections.actionHomeFragmentToAlbumFragment4(binding.homeAlbumTitleTv.text.toString(),
                binding.homeAlbumSingerTv.text.toString(), R.drawable.img_album_exp2 )
            findNavController().navigate(action)
        }
        return binding.root
    }
}