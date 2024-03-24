package com.example.hack24.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.hack24.CustomBaseAdaptr;
import com.example.hack24.R;

public class SlideshowFragment extends Fragment {

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Initialize ListView
        listView = view.findViewById(R.id.Event_Box);
        String[] eventDate = {"Chess Tournament\n4/4/14 12:00 PM CU202\nFree Lunch Provided",};

        // Set up adapter
        CustomBaseAdaptr customBaseAdapter = new CustomBaseAdaptr(requireContext(), eventDate);
        listView.setAdapter(customBaseAdapter);

        return view;
    }
}
