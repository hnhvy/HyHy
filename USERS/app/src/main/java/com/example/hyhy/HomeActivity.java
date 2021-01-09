package com.example.hyhy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.hyhy.Fragments.GoOutFragment;
import com.example.hyhy.Fragments.GoldFragment;
import com.example.hyhy.Fragments.OrdersFragment;
import com.example.hyhy.Fragments.VideoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //////changing the color of status text color/////////////////////////////////
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        ///////////////////////////////////////////////////////////////////////////////
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigation);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigation =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId())
                    {
                        case R.id.orders:
                           selectedFragment = new OrdersFragment();
                            break;

                        case R.id.goout:
                            selectedFragment = new GoOutFragment();
                            break;

                        case R.id.gold:
                            selectedFragment = new GoldFragment();
                            break;

                        case R.id.video:
                            selectedFragment = new VideoFragment();
                            break;
                    }
                    /////////////replacing by default fragment on home activity////////////////
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,selectedFragment).commit();

                    return true;
                }
            };
}