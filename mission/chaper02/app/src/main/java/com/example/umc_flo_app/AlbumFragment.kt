package com.example.umc_flo_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.umc_flo_app.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {

    lateinit var binding: FragmentAlbumBinding
    private val args: AlbumFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumBinding.inflate(inflater, container, false)

        val title = args.albumTitle
        val singer = args.albumSinger
        val album_img = args.albumImg

        binding.albumSongTitleTv.text = title
        binding.albumSongSingerTv.text = singer
        binding.albumSongCoverIv.setImageResource(album_img)

        binding.albumBtnBackIv.setOnClickListener {
            findNavController().navigateUp();
        }

        return binding.root
    }
}