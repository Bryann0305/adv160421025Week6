package com.ubaya.adv160421025week6.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ubaya.adv160421025week6.model.Handphone

class ListViewModel(application: Application): AndroidViewModel(application) {
    val HandphoneLD = MutableLiveData<ArrayList<Handphone>>()
    val HandphoneLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()

    val TAG = "volleyTag"
    private var queue: RequestQueue? = null

    fun refresh() {
        HandphoneLoadErrorLD.value = false
        loadingLD.value = true

        //ooaisjd;aOAHF;LAKDSF;ALKSHDLFKASH;VLKAS;DLKVJA;SLDKFJ;ALKSDJLFKSD
        queue = Volley.newRequestQueue(getApplication())
        val url = "http://10.0.2.2/handphone.json"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            {
                val sType = object : TypeToken<List<Handphone>>() { }.type
                val result = Gson().fromJson<List<Handphone>>(it, sType)
                HandphoneLD.value = result as ArrayList<Handphone>?
                loadingLD.value = false

                Log.d("show_volley", it)
            },
            {
                Log.e("show_volley", it.toString())
                HandphoneLoadErrorLD.value = false
                loadingLD.value = false
            })
        stringRequest.tag = TAG
        queue?.add(stringRequest)

    }

    override fun onCleared() {
        super.onCleared()
        queue?.cancelAll(TAG)
    }
}