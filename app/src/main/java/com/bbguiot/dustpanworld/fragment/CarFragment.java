package com.bbguiot.dustpanworld.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bbguiot.dustpanworld.R;

/**
 * @Date: 2023/2/16 17:04
 * @Name: Wang Evolve
 * @Email: w35417091@gmail.com
 **/
public class CarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car, container, false);
    }
}