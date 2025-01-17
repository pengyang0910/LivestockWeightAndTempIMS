package com.example.livestockweightandtempims.ui.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.livestockweightandtempims.databinding.FragmentVideoBinding;

public class VideoFragment extends Fragment {

    private FragmentVideoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VideoViewModel videoViewModel =
                new ViewModelProvider(this).get(VideoViewModel.class);

        binding = FragmentVideoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView_1 = binding.tvVideo1;
        videoViewModel.getText().observe(getViewLifecycleOwner(), textView_1::setText);
        final TextView textView_2 = binding.tvVideo2;
        videoViewModel.getText().observe(getViewLifecycleOwner(), textView_2::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}