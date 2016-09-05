package com.pratamawijaya.androidmaterial.presentation.ui.home.presenter;

import com.pratamawijaya.androidmaterial.data.repository.SpeciesDataRespository;
import com.pratamawijaya.androidmaterial.presentation.ui.home.view.HomeContract;

/**
 * Created by pratama on 8/30/16.
 */
public class HomePresenter implements HomeContract.Presenter {

    private SpeciesDataRespository speciesDataRespository;

    public HomePresenter(SpeciesDataRespository speciesDataRespository) {
        this.speciesDataRespository = speciesDataRespository;
    }

    @Override
    public void getListSpecies() {

    }
}
