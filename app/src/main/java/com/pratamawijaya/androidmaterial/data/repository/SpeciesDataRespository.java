package com.pratamawijaya.androidmaterial.data.repository;

import com.pratamawijaya.androidmaterial.domain.model.Species;
import com.pratamawijaya.androidmaterial.domain.repository.SpeciesRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratama on 8/30/16.
 */
public class SpeciesDataRespository implements SpeciesRepository {

  @Override public Species species(int id) {
    return null;
  }

  @Override public List<Species> speciesList() {
    List<Species> data = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
      data.add(new Species(i, "Hewan " + i, "http://loremflickr.com/320/240/dog"));
    }
    return data;
  }
}
