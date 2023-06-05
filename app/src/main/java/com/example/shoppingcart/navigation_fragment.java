package com.example.shoppingcart;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link navigation_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class navigation_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Context context;
    private ActionBarDrawerToggle mDrawerToggle;
    NavigationView navigationView;

    public navigation_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment navigation_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static navigation_fragment newInstance(String param1, String param2) {
        navigation_fragment fragment = new navigation_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.nav_home){
                    Intent intent = new Intent(context,MainActivity.class);
                    startActivity(intent);
                }
                else if(id == R.id.nav_pickup){

                }
                else if(id == R.id.nav_shipping){

                }
                else if(id == R.id.nav_all){

                }
                else if(id == R.id.nav_cancel){

                }
                else if(id == R.id.nav_pending){

                }
                else{

                }
                return false;
            }
        });
        return inflater.inflate(R.layout.fragment_navigation_fragment, container, false);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected((android.view.MenuItem) item)) {
            return true;
        }
        return super.onOptionsItemSelected((android.view.MenuItem) item);
    }
}