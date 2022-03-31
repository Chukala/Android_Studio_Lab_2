package com.sileshi.android_studio_lab_2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation

class RegisterFragment : Fragment(), View.OnClickListener {
    private lateinit var viewModel : UserViewModel

    private lateinit var email: EditText
    private lateinit var password : EditText


    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view =  inflater.inflate(R.layout.fragment_register, container, false)
            email = view.findViewById(R.id.etRegisterEmailAddress)
            password = view.findViewById(R.id.etRegTextPassword)

            viewModel = ViewModelProvider(this)[UserViewModel::class.java]


            viewModel.emailId = email.text.toString()
            viewModel.password = password.text.toString()

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button?>(R.id.registerBtn2).setOnClickListener(this)

    }

override fun onClick(v: View?) {
    when(v!!.id){
      R.id.registerBtn2 -> {
          navController!!.navigate(R.id.action_registerFragment_to_displayFragment)
      }
    }
}
}