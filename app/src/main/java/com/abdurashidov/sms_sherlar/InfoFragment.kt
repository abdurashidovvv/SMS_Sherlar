package com.abdurashidov.sms_sherlar

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abdurashidov.sms_sherlar.databinding.FragmentInfoBinding
import com.abdurashidov.sms_sherlar.databinding.ItemCustomDialogBinding
import com.abdurashidov.sms_sherlar.models.RvAdapter
import com.abdurashidov.sms_sherlar.models.Sher
import com.abdurashidov.sms_sherlar.utils.LikesList
import com.abdurashidov.sms_sherlar.utils.SherlarList
import com.abdurashidov.todoapp.Cache.MySharedPreference
import com.google.android.material.bottomsheet.BottomSheetDialog

class InfoFragment : Fragment(), RvAdapter.RvClick {

    private lateinit var binding: FragmentInfoBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var list: ArrayList<Sher>
    private val TAG = "InfoFragment"

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInfoBinding.inflate(layoutInflater)

        val key = arguments?.getString("key")

        list = ArrayList()

        when (key) {
            "sevgi_sherlar" -> {
                binding.toolbar.text = "Sevgi\nshe'rlari"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "soginch_armon" -> {
                binding.toolbar.text = "Sog'inchi-armon\nShe'rlari"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "tabrik" -> {
                binding.toolbar.text = "Tabrik she'rlar"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "ota_ona" -> {
                binding.toolbar.text = "Ota-ona haqida \nShe'rlar"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "dostlik" -> {
                binding.toolbar.text = "Do'stlik \nShe'rlari"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "hazil" -> {
                binding.toolbar.text = "Hazil\nshe'rlar"
                SherlarList.list.forEach {
                    if (it.type == key) {
                        list.add(it)
                    }
                }
            }
            "news" -> {
                binding.toolbar.text = "Yangi \nshe'rlar"
                SherlarList.list.forEach {
                    if (it.like) {
                        list.add(it)
                    }
                }
            }
            "like" -> {
                binding.toolbar.text = "Tanglangan\nShe'rlar"
                SherlarList.list.forEach {
                    if (it.like) {
                        list.add(it)
                    }
                }
            }

        }

        rvAdapter = RvAdapter(list, this)
        binding.rv.adapter = rvAdapter

        return binding.root
    }



    @SuppressLint("InflateParams")
    override fun onClick(sher: Sher) {

        val key = ItemCustomDialogBinding.inflate(LayoutInflater.from(binding.root.context), null, false)
        key.like.setOnClickListener {
            sher.like = !sher.like
            if (sher.like) {
                key.like.setCardBackgroundColor(Color.BLUE)
            } else {
                key.like.setBackgroundColor(Color.WHITE)
            }
        }
        val bottomSheetDialog = BottomSheetDialog(binding.root.context)
        bottomSheetDialog.setContentView(key.root)
        bottomSheetDialog.show()
    }

}