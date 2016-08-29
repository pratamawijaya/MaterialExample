package com.pratamawijaya.androidmaterial.presententation.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pratamawijaya.androidmaterial.R;
import com.pratamawijaya.androidmaterial.presententation.ui.BaseToolbarActivity;

public class MainViewActivity extends BaseToolbarActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  @BindView(R.id.drawer_layout) DrawerLayout drawerLayout;
  @BindView(R.id.navigation_view) NavigationView navigationView;

  private HomeFragmentOrganizer fragmentOrganizer;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    setupActionBar();
    // TODO: 8/30/16 setup header navigation view
    setupNavigationView();
    setupFragmentOrganizer();
  }

  private void setupActionBar() {
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();

    switch (id) {
      case android.R.id.home:
        drawerLayout.openDrawer(GravityCompat.START);
        break;
    }
    return true;
  }

  private void setupNavigationView() {
    if (navigationView != null) {
      navigationView.setNavigationItemSelectedListener(this);
    }
  }

  private void setupFragmentOrganizer() {
    fragmentOrganizer =
        new HomeFragmentOrganizer(getSupportFragmentManager(), R.id.container_fragment);
  }

  @Override public void onBackPressed() {
    if (!fragmentOrganizer.handleBackNavigation()) finish();
  }

  @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    return false;
  }
}
