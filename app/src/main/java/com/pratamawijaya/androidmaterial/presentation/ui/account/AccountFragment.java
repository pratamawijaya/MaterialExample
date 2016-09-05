package com.pratamawijaya.androidmaterial.presentation.ui.account;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pratamawijaya.androidmaterial.R;

public class AccountFragment extends Fragment {

  public static AccountFragment newInstance() {
    Bundle args = new Bundle();
    AccountFragment fragment = new AccountFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_account, container, false);
  }
}
