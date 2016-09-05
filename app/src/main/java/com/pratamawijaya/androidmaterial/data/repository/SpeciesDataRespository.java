package com.pratamawijaya.androidmaterial.data.repository;

import com.pratamawijaya.androidmaterial.domain.model.Species;
import com.pratamawijaya.androidmaterial.domain.repository.SpeciesRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratama on 8/30/16.
 */
public class SpeciesDataRespository implements SpeciesRepository {

    @Override
    public Species species(int id) {
        return null;
    }

    @Override
    public List<Species> speciesList() {
        List<Species> data = new ArrayList<>();
        data.add(new Species(1, "Aves", ""));
        data.add(new Species(2, "Aves 1", ""));
        data.add(new Species(3, "Aves 2", ""));
        data.add(new Species(4, "Aves 3", ""));
        return data;
    }
}
