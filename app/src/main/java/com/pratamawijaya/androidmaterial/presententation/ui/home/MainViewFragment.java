package com.pratamawijaya.androidmaterial.presententation.ui.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pratamawijaya.androidmaterial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainViewFragment extends Fragment {

  public MainViewFragment() {
    // Required empty public constructor
  }

  public static MainViewFragment newInstance() {
     Bundle args = new Bundle();
     MainViewFragment fragment = new MainViewFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_main_view, container, false);
  }
}
