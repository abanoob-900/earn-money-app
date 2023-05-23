package com.bob.earnmoney;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bob.earnmoney.databinding.FragmentRankingBinding;
import com.bob.earnmoney.databinding.FragmentRulesBinding;

public class RankingFragment extends Fragment {

    private FragmentRankingBinding binding;

    public RankingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRankingBinding.inflate(getLayoutInflater());


        return binding.getRoot();
    }
}