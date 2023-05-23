package com.bob.earnmoney;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.bob.earnmoney.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navController = Navigation.findNavController(this, R.id.host_home_fragment_activity_nav);

        Navigation.findNavController(this, R.id.host_home_fragment_activity_nav).navigate(R.id.gamesFragment);

        NavigationUI.setupWithNavController(binding.navHomeViewBottom, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
        @Override
        public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {

            switch (navDestination.getId()) {

                case R.id.gamesFragment:
//                    binding.navHomeViewBottom.setVisibility(View.VISIBLE);
                    break;

                default:
//                    binding.navHomeViewBottom.setVisibility(View.GONE);
                    break;
            }
        }
    });
    }

    @Override
    public void onBackPressed() {

        switch (navController.getCurrentDestination().getId()) {

            case R.id.gamesFragment:
                super.finish();
                break;

            default:
                super.onBackPressed();
        }
    }
}