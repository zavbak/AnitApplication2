package ru.a799000.android.anitapplication.mvp.presenters;

import ru.a799000.android.anitapplication.mvp.views.ListView;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.Date;

@InjectViewState
public class ListPresenter extends MvpPresenter<ListView> {
    public void onClickTvMessage() {
        getViewState().showMessage("click frag: " +new Date());
    }
}
