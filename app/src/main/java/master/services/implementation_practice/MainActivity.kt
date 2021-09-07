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

* */


/*
*                        service Behavior


                      Auto_Restart           Intent
 start-sticky           Yes                Null Intent
 start-NotSticky         No                WithIntent When started
 start-Redeliver-Intent  Yes                Intent


*
* start-sticky :
* services are being explicitly managed
* no need to remember state
* long running music Playing service
* */

/*
* start-not-sticky :
* services are not being explicitly managed
* selfStopped
* Alarm service or server data poling
*
* */

/*
* start-redeliver-intent :
* services are not being explicitly managed
* restart from previous state
* file download
*
* */


/*
   Bound Services :

 - Local Binding   ( IBinder )
 - Remote Binding   ( Messenger - AIDL )
*
*
 Note *
 Most of Apps should not use AIDL to create bound service

* */