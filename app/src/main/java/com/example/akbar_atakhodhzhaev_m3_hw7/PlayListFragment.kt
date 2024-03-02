package com.example.akbar_atakhodhzhaev_m3_hw7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.akbar_atakhodhzhaev_m3_hw7.databinding.FragmentPlayListBinding

class PlayListFragment : Fragment() {
    private lateinit var binding: FragmentPlayListBinding
    private val playList = arrayListOf(
        Song("Сережа","Валентин Стрыкало"),
        Song("Бей","Монгол Шуудан"),
        Song("Breath","Yeat"),
        Song("Dead But Pretty","IC3PEAK"),
        Song("Дедушка","Каникулы на марсе"),
        Song("КОННЕКТ","Гидравлика"),
        Song("One Call", "Rich Amiri"),
        Song("WTF 2","Ugovhb"),
        Song("Мой Друг","АрктидА"),
        Song("Валашский Князь","АрктидА")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PlaylistAdapter(playList,this::onClick)
        binding.rvPlaylist.adapter = adapter
    }
    private fun onClick(position: Int) {
        val intent = Intent(requireContext(), MainActivity2::class.java)
        startActivity(intent)
    }

}


