package com.gamegou.footballs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.gamegou.footballs.databinding.FragmentSecSecBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay

class SecSecFragment : Fragment() {
    private var rffr: FragmentSecSecBinding? = null
    private val hyhyy get() = rffr ?: throw RuntimeException("FragmentSecSecBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rffr = FragmentSecSecBinding.inflate(inflater, container, false)
        return hyhyy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launchWhenCreated {
                delay(1500)
                findNavController().navigate(R.id.action_secSecFragment_to_oneFragment)
            }


        } catch (e: Exception) {
            gtttgtt()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        rffr = null
        super.onDestroy()
    }




    private fun gtttgtt() {
        Snackbar.make(
            hyhyy.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }




}