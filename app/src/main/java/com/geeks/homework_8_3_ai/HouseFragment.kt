package com.geeks.homework_8_3_ai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.geeks.homework_8_3_ai.databinding.FragmentHouseBinding


class HouseFragment : Fragment() {
    private lateinit var binding: FragmentHouseBinding
    private val house = arrayListOf(
        House(
            "Eating",
            "Kitchen",
            "https://wpmedia.roomsketcher.com/content/uploads/2023/07/11112310/kitchen.jpg"
        ),
        House(
            "Washing",
            "Bathroom",
            "https://wpmedia.roomsketcher.com/content/uploads/2022/09/16151229/inexpensive-bathroom-design-ideas.jpg"
        ),
        House(
            "Sleeping",
            "Bedroom",
            "https://foyr.com/learn/wp-content/uploads/2022/05/master-bedroom-in-a-house-1024x795.jpg"
        ),
        House(
            "Watch movies",
            "Keeping room",
            "https://www.southernliving.com/thmb/uz1ZFTCUluEhK58SQAldhppFv1s=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/keepingroom-2000-09717dc2963d42aba8f5ed8af15aaa4a.jpeg"
        ),
        House(
            "For guests",
            "living room",
            "https://wpmedia.roomsketcher.com/content/uploads/2021/12/09143522/Interior_design_trends_Wellness_At_Home.jpg"
        ),
        House(
            "For family",
            "Family room",
            "https://wpmedia.roomsketcher.com/content/uploads/2021/12/09132528/Interior_design_trends_living_room.jpg"
        ),
        House(
            "For children",
            "Kit's bedroom",
            "https://wpmedia.roomsketcher.com/content/uploads/2023/07/11133958/kids-bedroom.jpg"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHouseBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = HouseAdapter(house, this::onClick)
        binding.rvHouse.adapter = adapter
    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.houseDetailingFragment, bundleOf(Keys.KEY_FOR_ROOM to house[position]))
    }
}