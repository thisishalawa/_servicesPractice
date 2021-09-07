package master.services.implementation_practice.intro

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import master.services.implementation_practice.TAG
import java.util.*


class MyService : Service() {

    /*
    * localBinding Practice
    * */
    private var mRandomNumber: Int = 0
    private var mIsRandomGeneratorOn = false
    private val MIN = 0
    private val MAX = 100


    override fun onBind(p0: Intent?): IBinder? {
        Log.d(TAG, "onBind: In IBinder .. ")
        return null

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
        /*
         Running in MainThread

        *
          stop :
        * stopSelf()
        *
        */


/*

        mIsRandomGeneratorOn = true
        Thread { startRandomNumberGenerator() }.start()
        return START_STICKY
*/

        return super.onStartCommand(intent, flags, startId)

    }

    /*
    *
    *
    *  Generate random number
    * */
    private fun startRandomNumberGenerator() {
        while (mIsRandomGeneratorOn) {
            try {
                Thread.sleep(1000)
                if (mIsRandomGeneratorOn) {
                    mRandomNumber = Random().nextInt(MAX) + MIN
                    Log.d(
                        TAG,
                        "Thread id: " + Thread.currentThread().id + ", Random Number: " + mRandomNumber
                    )
                }
            } catch (e: InterruptedException) {
                Log.d(TAG, "Thread Interrupted")
            }
        }
    }

    private fun stopRandomNumberGenerator() {
        mIsRandomGeneratorOn = false
    }

    fun getRandomNumber(): Int {
        return mRandomNumber
    }
}