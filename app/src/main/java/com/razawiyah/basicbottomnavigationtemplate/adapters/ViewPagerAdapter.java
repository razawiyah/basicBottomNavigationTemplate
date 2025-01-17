package com.razawiyah.basicbottomnavigationtemplate.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.razawiyah.basicbottomnavigationtemplate.fragments.DownloadFragment;
import com.razawiyah.basicbottomnavigationtemplate.fragments.HomeFragment;
import com.razawiyah.basicbottomnavigationtemplate.fragments.SupportFragment;


public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new SupportFragment();
            case 2: return new DownloadFragment();
            default: return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
