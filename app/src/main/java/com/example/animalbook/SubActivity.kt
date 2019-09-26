package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        catButton.setOnClickListener {
            val fragment = catFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.contrainer, fragment)
                .addToBackStack(null)
                .commit()
        }
        dogButton.setOnClickListener {
            val fragment = dogFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.contrainer, fragment)
                .addToBackStack(null)
                .commit()
        }
        monkyButton.setOnClickListener {
            val fragment = monkyFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.contrainer, fragment)
                .addToBackStack(null)
                .commit()
        }
        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}
