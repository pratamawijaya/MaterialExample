package com.pratamawijaya.androidmaterial.pesentation.ui.home.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;

/**
 * Created by pratama on 8/30/16.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

  @Override public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return null;
  }

  @Override public void onBindViewHolder(HomeHolder holder, int position) {

  }

  @Override public int getItemCount() {
    return 0;
  }

  public class HomeHolder extends RecyclerView.ViewHolder {

    public HomeHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }
}
