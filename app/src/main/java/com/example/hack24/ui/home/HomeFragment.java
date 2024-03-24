package com.example.hack24.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.hack24.CustomBaseAdaptr;
import com.example.hack24.R;

public class HomeFragment extends Fragment {

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Initialize ListView
        listView = view.findViewById(R.id.Event_Box);
        String[] eventDate = {"Hackathon\n03/22/24 7:30 PM SST301\nCharger ID required",
                "Career Fair\n03/25/24 9:00 AM UFC\nCharger ID required",
                "No Class - Storm Alert\n 3/27/24\nBe Safe!",
                "Chess Tournament\n4/4/14 12:00 PM CU202\nFree Lunch Provided",
                "Band Concert at SCH!\n4/28/24 7:00 PM SCH", "", "", "", ""};

        // Set up adapter
        CustomBaseAdaptr customBaseAdapter = new CustomBaseAdaptr(requireContext(), eventDate);
        listView.setAdapter(customBaseAdapter);

        return view;
    }
}
