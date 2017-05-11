package ru.a799000.android.anitapplication.ui;


import android.app.Fragment;
import android.app.FragmentManager;

import ru.a799000.android.anitapplication.R;


public class ControllerScreen {

    FragmentManager mFragmentManager;

    public ControllerScreen(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
    }

    public void startListScreen(){
        Fragment fragment = ListFragment.newInstance();

        mFragmentManager.beginTransaction()
                .replace(R.id.main_activity_frame_layout, fragment)
                //.addToBackStack("myStack")
                .commit();
    }
}
