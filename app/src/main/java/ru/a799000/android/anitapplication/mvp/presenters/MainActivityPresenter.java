package ru.a799000.android.anitapplication.mvp.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.Date;

import ru.a799000.android.anitapplication.mvp.views.MainActivityView;


@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView>{

    public void onClickTvMessage() {
        getViewState().showMessage("click: " + new Date());
        getViewState().showListFragment();
    }
}
