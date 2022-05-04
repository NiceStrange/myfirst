package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButtonToggleGroup
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comps_material_button)
        val toggleGroup:MaterialButtonToggleGroup= findViewById<MaterialButtonToggleGroup>(R.id.toggle_group)
        toggleGroup.addOnButtonCheckedListener(object :MaterialButtonToggleGroup.OnButtonCheckedListener{
            override fun onButtonChecked(
                group: MaterialButtonToggleGroup?,
                checkedId: Int,
                isChecked: Boolean
            ) {
                Log.e("MainActivity",isChecked.toString())
            }

        })
    }

}

