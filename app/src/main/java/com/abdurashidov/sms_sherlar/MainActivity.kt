package com.abdurashidov.sms_sherlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurashidov.sms_sherlar.utils.LikesList
import com.abdurashidov.sms_sherlar.utils.SherlarList
import com.abdurashidov.todoapp.Cache.MySharedPreference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SherlarList.loadData()
        MySharedPreference.init(this)
        LikesList.list = MySharedPreference.obektString

    }
}