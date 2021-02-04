package com.example.tiga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kotlinx.android.synthetic.main.fragment_counter.*

class CounterFragment : Fragment() {

    private val counterViewModel: CounterViewModel by activityViewModels()

    private var counterResult = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    //without view model
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val activity = activity as CobaFragmen
//         btnPlus.setOnClickListener{
//             counterResult+=1
//             activity.controlledData(counterResult)
//         }
//        btnMinus.setOnClickListener{
//            counterResult-=1
//            activity.controlledData(counterResult)
//        }
//    }

    //using view model
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnPlus.setOnClickListener {
            counterViewModel.increment()
        }
        btnMinus.setOnClickListener {
            counterViewModel.decrement()
        }
    }


}