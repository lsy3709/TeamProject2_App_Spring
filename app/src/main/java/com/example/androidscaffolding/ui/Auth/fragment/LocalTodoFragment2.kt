package com.example.androidscaffolding.ui.Auth.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidscaffolding.R
import com.example.androidscaffolding.databinding.FragmentLocalTodo2Binding

import com.example.androidscaffolding.ui.Auth.adapter.recycleradapter

class LocalTodoFragment2 : Fragment() {
    lateinit var binding: FragmentLocalTodo2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLocalTodo2Binding.inflate(layoutInflater, container, false)
        val datas= mutableListOf<String>()

        binding.taskrecycler.adapter= recycleradapter(datas)


//        binding.newTaskBtn.setOnClickListener {
//            BottomSheet().show(childFragmentManager,"newTask")
//        }
        binding.loginBtn.setOnClickListener {
            val login2Fragment = Login2Fragment()
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.tabContent,login2Fragment)?.commit()

        }

        return binding.root

    }


}