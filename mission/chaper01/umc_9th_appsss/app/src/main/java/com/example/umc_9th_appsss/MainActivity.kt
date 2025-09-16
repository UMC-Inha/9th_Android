package com.example.umc_9th_appsss

import android.widget.TextView
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat // ContextCompat을 사용하기 위해 import
import com.example.umc_9th_appsss.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var selectedTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupEmotionClickListeners()
    }

    private fun setupEmotionClickListeners(){
        val emotionImages = listOf(
            binding.emoticonAngry,
            binding.emoticonExcite,
            binding.emoticonNormal,
            binding.emoticonAnxiety,
            binding.emoticonHappy
        )

        emotionImages.forEach { imageView->
            imageView.setOnClickListener {
                selectedTextView?.setTextColor(ContextCompat.getColor(this, R.color.black))
                val clickedTextView: TextView
                val newColorResId: Int
                val toastMessage: String

                when (imageView.id) {
                    R.id.emoticon_happy -> {
                        clickedTextView = binding.textHappy
                        newColorResId = R.color.happy_color
                        toastMessage = "해피데이~"
                        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
                    }
                    R.id.emoticon_excite -> {
                        clickedTextView = binding.textExcite
                        newColorResId = R.color.excite_color
                        toastMessage = "신난당~"
                        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
                    }
                    R.id.emoticon_normal -> {
                        clickedTextView = binding.textNormal
                        newColorResId = R.color.normal_color
                        toastMessage = "음 쏘쏘"
                        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
                    }
                    R.id.emoticon_anxiety -> {
                        clickedTextView = binding.textAnxiety
                        newColorResId = R.color.anxiety_color
                        toastMessage = "속땅해"
                        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
                    }
                    R.id.emoticon_angry -> {
                        clickedTextView = binding.textAngry
                        newColorResId = R.color.angry_color
                        toastMessage = "화나요"
                        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
                    }
                    else -> return@setOnClickListener
                }

                clickedTextView.setTextColor(ContextCompat.getColor(this, newColorResId))
                selectedTextView = clickedTextView
            }
        }
    }
}