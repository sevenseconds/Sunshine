package com.example.android.sunshine.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.sunshine.R;


public class MainFragment extends Fragment {

    private ListView forecastListView;
    private ArrayAdapter<String> forecastAdapter;

    private String[] weekForecast = {
            "Today - Sunny - 88 / 63",
            "Tomorrow - Foggy - 70 / 46",
            "Weds - Cloudy - 72 / 63",
            "Thurs - Rainy - 64 / 51",
            "Fri - Foggy - 70 / 46",
            "Sat - Sunny - 76 / 68"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        forecastListView = (ListView) rootView.findViewById(R.id.listview_forecast);
        forecastAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
        forecastListView.setAdapter(forecastAdapter);
        return rootView;
    }
}
