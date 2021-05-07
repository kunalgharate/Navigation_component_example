package com.reach52.jetpack_navigationcomponent.fragy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.reach52.jetpack_navigationcomponent.R
import com.reach52.jetpack_navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_login, container, false)



        navController = Navigation.findNavController(requireActivity(),
            R.id.my_nav_host_fragment
        )
       /* binding.button.setOnClickListener {
            navController.navigate(R.id.)
        }*/
        return binding.root
    }


}