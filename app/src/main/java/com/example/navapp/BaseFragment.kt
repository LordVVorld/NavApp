package com.example.navapp

import androidx.fragment.app.Fragment

abstract class BaseFragment(layoutResId: Int): Fragment(layoutResId) {
    abstract fun onClick()
}