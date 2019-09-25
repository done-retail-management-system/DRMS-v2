package com.example.drms;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import com.example.drms.ui.warehouse.WarehouseFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private AppBarConfiguration mAppBarConfiguration;
    private Button buttonStock; // this is the button fo the stock activity
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        //appBarLayout = (AppBarLayout) findViewById(R.id.stock_bar);
       // viewPager = (ViewPager) findViewById(R.id.view_pager_id);
       // ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        //adapter.AddFragment(new activity_stock(), "Current Stock");
        //adapter.AddFragment(new activity_stock(), "Current Stock");
        //adapter.AddFragment(new activity_stock(), "Current Stock");

        //viewPager.setAdapter(adapter);
        //tabLayout.setupWithViewPager(viewPager);


        //button listener for stock actvity button
        //buttonStock = findViewById(R.id.btn_stock);
        /*buttonStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_stock();
            }
        });*/


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
           // }
       // }); -->

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


       /* WarehouseFragment fragment = new WarehouseFragment();
        FragmentManager manager = getSupportFragmentManager();

        //changes the packaage name
        manager.beginTransaction().add(R.id.activity_stock1,fragment).commit();*/


    }

    //Method to open stock activity
    /*public void openActivity_stock() {
        Intent intent = new Intent( this, activity_stock.class);
        startActivity(intent);
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }



}
