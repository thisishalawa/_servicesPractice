package master.services.implementation_practice.intro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import master.services.implementation_practice.R
import master.services.implementation_practice.TAG
import master.services.implementation_practice.databinding.FragmentIntroBinding


class IntroFragment : Fragment(), View.OnClickListener {

    // binding
    private var _binding: FragmentIntroBinding? = null
    private val binding get() = _binding!!


    // services
    private var serviceIntent: Intent? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onStart() {
        super.onStart()


        // click
        binding.btnStartService.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null)
            when (p0.id) {
                R.id.btn_start_service -> {

                    /*
                    * start & stop service
                    * context?.startService(serviceIntent)
                    * */
                    initService()
                    context?.startService(serviceIntent)
                }
            }

    }

    private fun initService() {
        Log.d(
            TAG, " on start .. " +
                    "thread id : ${Thread.currentThread().id}" +
                    ""
        )
        /*        <service android:name=".intro.MyService"/>
        *          need to be declared in Manifest
        * */
        serviceIntent = Intent(context, MyService::class.java)

    }
}
