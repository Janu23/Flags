package com.blackcoders.flags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackcoders.flags.databinding.ActivityFinishBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class FinishActivity : AppCompatActivity() {
    private val binding by lazy { ActivityFinishBinding.inflate(layoutInflater) }
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        val gScore = intent.getIntExtra("gScore",0).toString()
       binding.activityFinishText.text = "Você acertou $gScore de 27 bandeiras."

        binding.activityFinishButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}