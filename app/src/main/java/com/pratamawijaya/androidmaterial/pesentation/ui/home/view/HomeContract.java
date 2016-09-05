package com.pratamawijaya.androidmaterial.pesentation.ui.home.view;

/**
 * Created by pratama on 8/30/16.
 */
public class HomeContract {
  public interface View {
    void showLoading();

    void hideLoading();
  }

  public interface Presenter {
    void getListSpecies();
  }
}
