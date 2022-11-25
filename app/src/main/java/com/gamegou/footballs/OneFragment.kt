package com.gamegou.footballs

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.gamegou.footballs.databinding.FragmentOneBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class OneFragment : Fragment() {
    private var ololoolo: FragmentOneBinding? = null
    private val binding
        get() = ololoolo ?: throw RuntimeException("FragmentOneBinding = null")


    val gtgtt by lazy {
        listOf(
            ContextCompat.getDrawable(requireActivity(), R.drawable.cargo),
            ContextCompat.getDrawable(requireActivity(), R.drawable.plane),
        )
    }

    val frrr by lazy {
        listOf(
            binding.imgElem1Back,
            binding.imgElem2Back,
            binding.imgElem3Back,
            binding.imgElem4Back,
            binding.imgElem5Back,
            binding.imgElem6Back
        )
    }


    val gthyyyyyy = listOf(0, 2, 3)
    val gtgttgttt = listOf(2, 3, 5)
    val variant4 = listOf(0, 4, 5)
    val variant5 = listOf(0, 3, 5)
    val frrfrrrr = listOf(1, 4, 5)


    val preList = listOf(
        gthyyyyyy,
        gtgttgttt,
        frrfrrrr,
        variant4,
        variant5,
    ).shuffled()

    var isFront = true
    var itIsFirstTime = true



    private fun createAnimatorSetFront(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.front_animator
        ) as AnimatorSet
    }

    private fun createAnimatorSetBack(): AnimatorSet {
        return AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.back_animator
        ) as AnimatorSet
    }

    private val kikiik by lazy {
        createAnimatorSetFront()
    }
    private val frontAnim5 by lazy {
        createAnimatorSetFront()
    }
    private val frontAnim6 by lazy {
        createAnimatorSetFront()
    }
    private val frrefrthg by lazy {
        createAnimatorSetFront()
    }
    private val hyhyyy by lazy {
        createAnimatorSetFront()
    }
    private val hyjikoko by lazy {
        createAnimatorSetFront()
    }



    private val frfrftgyh by lazy {
        createAnimatorSetBack()
    }

    private val jikolpp by lazy {
        createAnimatorSetBack()
    }

    private val yhujijiki5 by lazy {
        createAnimatorSetBack()
    }
    private val frrrrrfrgyy by lazy {
        createAnimatorSetBack()
    }
    private val dedededee by lazy {
        createAnimatorSetBack()
    }
    private val gtgyhuu6 by lazy {
        createAnimatorSetBack()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ololoolo = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val deftgyhy = preList.random()

            for (element in 0..5) {
                if (deftgyhy.contains(element)) {
                    frrr[element].contentDescription = "ok"
                    val imaaaage = ContextCompat.getDrawable(requireActivity(), R.drawable.img_1)
                    frrr[element].setImageDrawable(imaaaage)
                } else {
                    frrr[element].contentDescription = "false"
                    frrr[element].setImageDrawable(gtgtt.random())
                }
            }


            if (itIsFirstTime) {
                lifecycleScope.launch {
                    hujuikiki()
                    gtgttgtgttgt()
                    gtgtgttgt()
                    gtghyujujji()
                    launchAnimationIsFrontElem5()
                    ddefrgthyhyy()

                    delay(2000)

                    dfrty()
                    gyjik()
                    launchAnimationIsBackElem3()
                    launchAnimationIsBackElem4()
                    launchAnimationIsBackElem5()
                    gyhhyhyy()
                }


            }


            val j3u33u6 = requireContext().applicationContext.resources.displayMetrics.density
            binding.imgElem1.cameraDistance = 8000 * j3u33u6
            binding.imgElem1Back.cameraDistance = 8000 * j3u33u6


            binding.btnImgExitInfo.setOnClickListener {
                requireActivity().onBackPressed()
            }

            binding.imgElem1.setOnClickListener {
                hujuikiki()
                lifecycleScope.launch {
                    if (binding.imgElem1Back.contentDescription == "ok") {
                        binding.imgElem1.isEnabled = false
                        delay(900)
                        binding.imgElem1.visibility = View.INVISIBLE
                        dfrty()
                        binding.imgElem1Back.contentDescription = "done"
                        if (hujujukikio()) likeAFinish()
                    } else {
                        delay(2000)
                        dfrty()
                    }
                }
            }
            binding.imgElem2.setOnClickListener {
                gtgttgtgttgt()
                lifecycleScope.launch {
                    if (binding.imgElem2Back.contentDescription == "ok") {
                        binding.imgElem2.isEnabled = false
                        delay(900)
                        binding.imgElem2.visibility = View.INVISIBLE
                        gyjik()
                        binding.imgElem2Back.contentDescription = "done"
                        if (hujujukikio()) likeAFinish()

                    } else {
                        delay(2000)
                        gyjik()
                    }
                }

            }

            binding.imgElem3.setOnClickListener {
                gtgtgttgt()
                lifecycleScope.launch {
                    if (binding.imgElem3Back.contentDescription == "ok") {
                        binding.imgElem3.isEnabled = false
                        delay(900)
                        binding.imgElem3.visibility = View.INVISIBLE
                        launchAnimationIsBackElem3()
                        binding.imgElem3Back.contentDescription = "done"

                        if (hujujukikio()) likeAFinish()
                    } else {
                        delay(2000)

                        launchAnimationIsBackElem3()
                    }
                }

            }

            binding.imgElem4.setOnClickListener {
                gtghyujujji()
                lifecycleScope.launch {
                    if (binding.imgElem4Back.contentDescription == "ok") {
                        binding.imgElem4.isEnabled = false
                        delay(900)
                        binding.imgElem4.visibility = View.INVISIBLE
                        launchAnimationIsBackElem4()
                        binding.imgElem4Back.contentDescription = "done"

                        if (hujujukikio()) likeAFinish()
                    } else {
                        delay(2000)

                        launchAnimationIsBackElem4()
                    }
                }

            }

            binding.imgElem5.setOnClickListener {
                launchAnimationIsFrontElem5()
                lifecycleScope.launch {
                    if (binding.imgElem5Back.contentDescription == "ok") {
                        binding.imgElem5.isEnabled = false
                        delay(900)
                        binding.imgElem5.visibility = View.INVISIBLE
                        launchAnimationIsBackElem5()
                        binding.imgElem5Back.contentDescription = "done"

                        if (hujujukikio()) likeAFinish()
                    } else {
                        delay(2000)

                        launchAnimationIsBackElem5()
                    }
                }

            }

            binding.imgElem6.setOnClickListener {
                ddefrgthyhyy()
                lifecycleScope.launch {
                    if (binding.imgElem6Back.contentDescription == "ok") {
                        binding.imgElem6.isEnabled = false
                        delay(900)
                        binding.imgElem6.visibility = View.INVISIBLE
                        gyhhyhyy()
                        binding.imgElem6Back.contentDescription = "done"

                        if (hujujukikio()) likeAFinish()
                    } else {
                        delay(2000)
                        gyhhyhyy()
                    }
                }
            }


        } catch (e: Exception) {
            jukiikkoko()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun iniOnClickListener(view: View, funIsFront: Unit, funForBack: Unit) {
        val currentImageView = view as ImageView
        funIsFront
        lifecycleScope.launch {
            if (currentImageView.contentDescription == "ok") {
                view.isEnabled = false
                delay(1000)
                view.visibility = View.INVISIBLE
                funForBack
            } else {
                funForBack

            }
        }
        if (hujujukikio()) {
            likeAFinish()

        }
    }

    private fun likeAFinish() {
        findNavController().navigate(R.id.action_oneFragment_to_secSecFragment)
    }

    private fun isItInvisible(elemFront: ImageView) = elemFront.visibility == View.INVISIBLE

    private fun hujujukikio(): Boolean {
        var hyyhyhyhyyhy6 = 0
        for (i in frrr) {
            if (i.contentDescription == "done") {
                hyyhyhyhyyhy6++
            }
        }
        return hyyhyhyhyyhy6 == 3

    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    private fun dfrty() {
        tggyhujujuu(
            kikiik,
            frfrftgyh,
            binding.imgElem1,
            binding.imgElem1Back
        )
    }

    private fun gyjik() {
        tggyhujujuu(
            frrefrthg,
            jikolpp,
            binding.imgElem2,
            binding.imgElem2Back
        )
    }
    private fun launchAnimationIsBackElem5() {
        tggyhujujuu(
            frontAnim5,
            dedededee,
            binding.imgElem5,
            binding.imgElem5Back
        )
    }

    private fun launchAnimationIsBackElem3() {
        tggyhujujuu(
            hyhyyy,
            yhujijiki5,
            binding.imgElem3,
            binding.imgElem3Back
        )
    }

    private fun launchAnimationIsBackElem4() {
        tggyhujujuu(
            hyjikoko,
            frrrrrfrgyy,
            binding.imgElem4,
            binding.imgElem4Back
        )
    }



    private fun gyhhyhyy() {
        tggyhujujuu(
            frontAnim6,
            gtgyhuu6,
            binding.imgElem6,
            binding.imgElem6Back
        )
    }


    private fun hujuikiki() {
        hyujujiii3(
            kikiik, frfrftgyh, binding.imgElem1, binding.imgElem1Back
        )
    }

    private fun gtgttgtgttgt() {
        hyujujiii3(
            frrefrthg, jikolpp, binding.imgElem2, binding.imgElem2Back
        )
    }

    private fun gtgtgttgt() {
        hyujujiii3(
            hyhyyy, yhujijiki5, binding.imgElem3, binding.imgElem3Back
        )
    }

    private fun gtghyujujji() {
        hyujujiii3(
            hyjikoko, frrrrrfrgyy, binding.imgElem4, binding.imgElem4Back
        )
    }

    private fun launchAnimationIsFrontElem5() {
        hyujujiii3(
            frontAnim5, dedededee, binding.imgElem5, binding.imgElem5Back
        )
    }

    private fun ddefrgthyhyy() {
        hyujujiii3(
            frontAnim6, gtgyhuu6, binding.imgElem6, binding.imgElem6Back
        )
    }


    private fun hyujujiii3(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemFront)
        backAnim.setTarget(elemBack)
        frontAnim.start()
        backAnim.start()
    }

    private fun tggyhujujuu(
        frontAnim: AnimatorSet,
        backAnim: AnimatorSet,
        elemFront: ImageView,
        elemBack: ImageView
    ) {
        frontAnim.setTarget(elemBack)
        backAnim.setTarget(elemFront)
        frontAnim.start()
        backAnim.start()
    }


    override fun onDestroy() {
        ololoolo = null
        super.onDestroy()
    }

    private fun jukiikkoko() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}