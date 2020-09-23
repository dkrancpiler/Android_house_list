package com.example.android.house_list.ui.houses

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.house_list.R

class CurrentListOfHouses : Fragment() {

    companion object {
        fun newInstance() = CurrentListOfHouses()
    }

    private lateinit var viewModel: CurrentListOfHousesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_list_of_houses_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CurrentListOfHousesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}