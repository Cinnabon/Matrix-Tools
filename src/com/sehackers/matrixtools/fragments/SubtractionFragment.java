package com.sehackers.matrixtools.fragments;

import com.sehackers.matrixtools.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SubtractionFragment extends Fragment {
	
	public SubtractionFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_subtraction, container, false);
         
        return rootView;
    }
}