package com.juandomingo.mypharmamemorymvc.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juandomingo.mypharmamemorymvc.R

class AboutFragment : Fragment() {

    companion object {
        fun newInstance() = AboutFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }



}