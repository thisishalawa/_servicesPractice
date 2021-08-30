package master.services.implementation_practice.intro

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import master.services.implementation_practice.TAG

class MyService : Service() {

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        Log.d(
            TAG, " MyService - onDestroy .. " +
                    "thread id : ${Thread.currentThread().id}" +
                    ""
        )
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(
            TAG, " MyService - onStartCommand .. " +
                    "thread id : ${Thread.currentThread().id}"
        )
        // stopSelf()
        return super.onStartCommand(intent, flags, startId)
    }
}