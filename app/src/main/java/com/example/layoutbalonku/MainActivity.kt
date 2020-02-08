package com.example.layoutbalonku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ToggleButton
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom : LinearLayout = findViewById(R.id.bottomSheet)
        val button : ToggleButton = findViewById(R.id.toggleButton)
        val door : TextView = findViewById(R.id.door)

        button.setOnCheckedChangeListener(object  : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                val buttombehavior  = BottomSheetBehavior.from(bottom)

                if(isChecked){
                    buttombehavior.state = BottomSheetBehavior.STATE_EXPANDED
                }else{
                    buttombehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                }
            }
        })

        door.setOnClickListener {
            lotte.visibility = View.VISIBLE
            lotte.playAnimation()

            if (!lotte.isAnimating){
                lotte.visibility = View.GONE
            }
        }
    }
}
