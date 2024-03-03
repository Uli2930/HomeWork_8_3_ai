package com.geeks.homework_8_3_ai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.geeks.homework_8_3_ai.databinding.FragmentRoomDetailingBinding


class RoomDetailFragment : Fragment() {
    private lateinit var binding: FragmentRoomDetailingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRoomDetailingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val room = arguments?.getSerializable(Keys.KEY_FOR_ROOM) as House
        binding.apply {
            room.apply {
                tvName.text = name
                tvStudy.text = study
                imgHouse.loadImage(img)
                requireContext().makeToast(room.name)
            }
        }
    }
}