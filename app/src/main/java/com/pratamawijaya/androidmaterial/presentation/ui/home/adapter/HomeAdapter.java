package com.pratamawijaya.androidmaterial.presentation.ui.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pratamawijaya.androidmaterial.R;
import com.pratamawijaya.androidmaterial.domain.model.Species;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by pratama on 8/30/16.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

  private Context context;
  private List<Species> species;

  public HomeAdapter(Context context, List<Species> species) {
    this.context = context;
    this.species = species;
  }

  @Override public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new HomeHolder(
        LayoutInflater.from(context).inflate(R.layout.item_layout_species, parent, false));
  }

  @Override public void onBindViewHolder(HomeHolder holder, int position) {
    if (species != null && species.size() > 0) {
      holder.bindItem(species.get(position));
    }
  }

  @Override public int getItemCount() {
    return species.size();
  }

  public class HomeHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txt_name) TextView name;
    @BindView(R.id.img_thumbnail) ImageView imageViewThumb;

    public HomeHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }

    public void bindItem(Species species) {
      name.setText(species.name);
      Picasso.with(context).load(species.img).into(imageViewThumb);
    }
  }
}
