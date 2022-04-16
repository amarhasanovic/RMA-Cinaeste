package com.example.cineaste.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast
import java.lang.NullPointerException

private const val TAG = "ConnectionBroadcastReciever"
class ConnectionBroadcastReciever : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        try {
            if (isOnline(context))
                Toast.makeText(context, "Connected", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(context, "Disconnected", Toast.LENGTH_LONG).show()
        }catch (e: NullPointerException){
            e.printStackTrace()
        }
    }

    private fun isOnline(context: Context) : Boolean {
        return try{
            val cm = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
            val netInfo = cm.activeNetworkInfo
            netInfo != null && netInfo.isConnected
        } catch (e: NullPointerException){
            e.printStackTrace()
            false
        }
    }
}