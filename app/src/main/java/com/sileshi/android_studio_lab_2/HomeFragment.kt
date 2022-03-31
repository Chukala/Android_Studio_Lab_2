package com.sileshi.android_studio_lab_2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class HomeFragment : Fragment(), View.OnClickListener {
    private var navController: NavController? = null

      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.registerBtn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
           R.id.registerBtn -> navController!!.navigate(R.id.action_homeFragment_to_registerFragment)
        }
        Log.i(".HomeFragment", "Register Button Clicked")
    }

}