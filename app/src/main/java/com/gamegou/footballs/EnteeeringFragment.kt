package com.gamegou.footballs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gamegou.footballs.databinding.FragmentEnteeeringBinding
import com.google.android.material.snackbar.Snackbar

class EnteeeringFragment : Fragment() {
    private var gtgtgthyjhuju: FragmentEnteeeringBinding? = null
    private val gtgyhujuju get() = gtgtgthyjhuju ?: throw RuntimeException("FragmentEnteeeringBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgthyjhuju = FragmentEnteeeringBinding.inflate(inflater, container, false)
        return gtgyhujuju.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtgyhujuju.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_enteeeringFragment_to_oneFragment)
            }

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        gtgtgthyjhuju = null
        super.onDestroy()
    }




    private fun gthyhuyjuju() {
        Snackbar.make(
            gtgyhujuju.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }




}