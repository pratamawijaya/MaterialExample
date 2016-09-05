package com.pratamawijaya.androidmaterial.presentation.ui.home.view;

/**
 * Created by pratama on 8/30/16.
 */
public class HomeContract {
  public interface View {
    void showLoading();

    void hideLoading();

    void showError();
  }

  public interface Presenter {
    void getListSpecies();
  }
}
