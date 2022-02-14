package com.example.android_tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android_tabs.Fragments.CallsFragment;
import com.example.android_tabs.Fragments.ChatFragment;
import com.example.android_tabs.Fragments.StatusFragment;

public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new ChatFragment();
            case 1: return new StatusFragment();
            case 2: return new CallsFragment();

            default: return new ChatFragment();

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return "CHATS";
        } else if (position == 1) {
            return "STATUS";
        } //else if (position == 2) {
            return "CALLS";
        //}


    }

    @Override
    public int getCount() {
        return 3;
    }
}

