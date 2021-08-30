package master.services.implementation_practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import master.services.implementation_practice.databinding.ActivityMainBinding

val TAG = "_services_debug"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}

/*
      Services Implementation
      Perform long running task in background
      Don't use ui
*
      one of the four major component of android
      activity broadcastReceiver contentProvider

*
*
*
* */