package com.ghiiyaats.dashboardislami.menus.videokajian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ghiiyaats.dashboardislami.R
import com.ghiiyaats.dashboardislami.databinding.ActivityMenuVideoKajianBinding
import com.ghiiyaats.dashboardislami.menus.videokajian.adapter.VideoKajianListAdapter
import com.ghiiyaats.dashboardislami.menus.videokajian.data.VideoKajianData
import com.ghiiyaats.dashboardislami.menus.videokajian.model.VideoKajianModel

class MenuVideoKajianActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuVideoKajianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuVideoKajianBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbarrMenuVideoKajian)
        initNavMenu()
    }

    private fun initNavMenu() {
        val list : ArrayList <VideoKajianModel> = arrayListOf()
        binding.rvVideoKajian.setHasFixedSize(true)
        list.addAll(VideoKajianData.listData)
        binding.rvVideoKajian.layoutManager = LinearLayoutManager(this)
        val listVideoAdapter = VideoKajianListAdapter(list)
        binding.rvVideoKajian.adapter = listVideoAdapter
    }
}