package com.example.nikeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nikeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 1. lateinit으로 바인딩 객체 선언
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. 핵심 수정: 바인딩 객체를 초기화하고 뷰를 화면에 설정합니다.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // 'binding' 초기화 완료!

        // 이제 binding 객체를 안전하게 사용할 수 있습니다.
        initBottomNavigation()
    }

    private fun initBottomNavigation(){

        binding.mainBnv.itemRippleColor = null

        // 초기 화면 설정 (홈)
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        // 바텀 네비게이션 아이템 선택 리스너 설정
        binding.mainBnv.setOnItemSelectedListener{ item -> // 'binding'을 여기서 사용합니다.
            when (item.itemId) {

                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.buyFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BuyFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.wishlistFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, WishlistFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.bagFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BagFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.profileFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ProfileFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}