package com.sileshi.android_studio_lab_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider

class DisplayFragment : Fragment() {
    private lateinit var textView : TextView
    private lateinit var viewModel : UserViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_display, container, false)
            textView = view.findViewById(R.id.display_registerText)

        viewModel = ViewModelProvider(this)[UserViewModel::class.java]


         var user =  viewModel.emailId.toString()
         textView.text = "Welcome, $user you're successfully registered "

        return view
    }

}