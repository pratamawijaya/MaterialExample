package com.pratamawijaya.androidmaterial.presentation.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pratamawijaya.androidmaterial.R;
import com.pratamawijaya.androidmaterial.presentation.ui.home.view.HomeContract;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeViewFragment extends Fragment implements HomeContract.View {

  @BindView(R.id.content_view) SwipeRefreshLayout contentView;
  @BindView(R.id.recycler_view) RecyclerView recyclerView;
  @BindView(R.id.loading_view) ProgressBar loadingView;
  @BindView(R.id.error_view) TextView errorView;

  public HomeViewFragment() {
    // Required empty public constructor
  }

  public static HomeViewFragment newInstance() {
    Bundle args = new Bundle();
    HomeViewFragment fragment = new HomeViewFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    ButterKnife.bind(this, view);

    setupRecyclerView();

    // TODO: 9/5/16 load some data
    showError();
  }

  private void setupRecyclerView() {
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_main_view, container, false);
  }

  @Override public void showLoading() {
    loadingView.setVisibility(View.VISIBLE);
    contentView.setVisibility(View.GONE);
  }

  @Override public void hideLoading() {
    loadingView.setVisibility(View.GONE);
    contentView.setVisibility(View.VISIBLE);
  }

  @Override public void showError() {
    contentView.setVisibility(View.GONE);
    errorView.setVisibility(View.VISIBLE);
  }
}
