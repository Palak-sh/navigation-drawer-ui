package com.example.shoppingcart;



import static android.app.PendingIntent.getActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout mDrawerLayout;
    public Toolbar toolbar;
    Context context;
    Fragment mFragmentContainerView;
    private ActionBarDrawerToggle mDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  mDrawerLayout = findViewById(R.id.drawer_layout);
        public void setUp(int fragmentId, mDrawerLayout){
            mFragmentContainerView = getActivity().findViewById(fragmentId);
            toolbar = findViewById(R.id.toolbar);
            mDrawerLayout = mDrawerLayout;
            mDrawerToggle = new ActionBarDrawerToggle(
                    getActivity(),                    *//* host Activity *//*
                    mDrawerLayout,                    *//* DrawerLayout object *//*
                    toolbar,             *//* nav drawer image to replace 'Up' caret *//*
                    R.string.nav_open,  *//* "open drawer" description for accessibility *//*
                    R.string.nav_close  *//* "close drawer" description for accessibility *//*
            ) {
                @Override
                public void onDrawerClosed(View drawerView) {
                    super.onDrawerClosed(drawerView);
//                    if (!isAdded()) {
//                        return;
//                    }
                    getActivity().invalidateOptionsMenu(); // calls onPrepareOptionsMenu()
                }

                //Set Nevigat
                @Override
                public void onDrawerOpened(View drawerView) {
                    super.onDrawerOpened(drawerView);
                  *//*  if (!isAdded()) {
                        return;
                    }
                    if (!mUserLearnedDrawer) {
                        mUserLearnedDrawer = true;
                        SharedPreferences sp = PreferenceManager
                                .getDefaultSharedPreferences(getActivity());
                        sp.edit().putBoolean(PREF_USER_LEARNED_DRAWER, true).apply();
                    }
                    setUserView();*//*
                    getActivity().invalidateOptionsMenu();
                    // calls onPrepareOptionsMenu()

                }

            };
            mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Log.e("toggle", "clicked");
                }
            });
            mDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));


//            if (!mUserLearnedDrawer && !mFromSavedInstanceState) {
//                mDrawerLayout.openDrawer(mFragmentContainerView);
//            }

       *//*     mDrawerLayout.post(new Runnable() {
                @Override
                public void run() {
                    mDrawerToggle.syncState();
                }
            });
*//*
            mDrawerLayout.setDrawerListener(mDrawerToggle);
            mDrawerToggle.syncState();
            mDrawerLayout.closeDrawer(mFragmentContainerView);

        }








      *//*  try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }*//*


    *//*public void loadnavbar(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame,fragment);
        ft.commit();
    }*//*
    */
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder()
                        .setDrawerLayout(mDrawerLayout)
                        .build();

}
//    void setToolBar() {
//        navigationView  = (NavigationView) getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
//       navigationView.setUp(R.id.navigation_drawer, mDrawerLayout);
//    }




}