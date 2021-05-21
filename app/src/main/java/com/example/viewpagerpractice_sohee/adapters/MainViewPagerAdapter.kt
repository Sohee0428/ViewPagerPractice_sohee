package com.example.viewpagerpractice_sohee.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_sohee.fragmens.GreetingsFragment
import com.example.viewpagerpractice_sohee.fragmens.MyInfoFragment
import com.example.viewpagerpractice_sohee.fragmens.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

//        자바 조건문
//        if(position == 0) {
//            return "이름"
//        }
//        else if (position == 1){
//            return "내 정보"
//        }
//        else {
//            return " 인사말"
//        }


//        코틀린 조건문
        return when (position){
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }
    }

    override fun getItem(position: Int): Fragment {

//        자바 조건문
//        if (position == 0) {
//            return NameFragment()
//        } else if (position == 1) {
//            return MyInfoFragment()
//        } else {
//            return GreetingsFragment()
//        }


//        코틀린 조건문
        return when (position){
            0 -> NameFragment()
            1 -> MyInfoFragment()
            else -> GreetingsFragment()
        }

    }

    override fun getCount(): Int {

        return 3

    }
}