package com.customandroidui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import com.andreperegrina.openhours.BusinessDay
import com.andreperegrina.openhours.BusinessHour
import com.andreperegrina.openhours.OpenHours

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parent = findViewById<LinearLayout>(R.id.parent_open_hours)
        val openHours = findViewById<OpenHours>(R.id.open_hours_component)
        parent.setOnClickListener {
            openHours.toggleOpenHours()
        }

        val arrayList = ArrayList<BusinessHour>()
        for (i in 1..8) {
            arrayList.add(BusinessHour(BusinessDay.valueOf(i), 8, 0, 18, 0))
        }
        openHours.initBusinessHour(arrayList)
    }
}
