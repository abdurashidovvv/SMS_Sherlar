package com.abdurashidov.sms_sherlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.abdurashidov.sms_sherlar.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {

            sevgiSherlar.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "sevgi_sherlar"))
            }
            soginchArmon.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "soginch_armon"))

            }
            tabrikSherlar.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "tabrik"))

            }
            otaOna.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "ota_ona"))

            }
            dostlikSherlar.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "dostlik"))

            }
            hazilSherlar.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "hazil"))

            }
            news.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("news" to "news"))

            }
            like.setOnClickListener {
                findNavController().navigate(R.id.infoFragment, bundleOf("key" to "like"))
            }
        }

        return binding.root
    }
}