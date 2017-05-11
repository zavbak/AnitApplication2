package ru.a799000.android.anitapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.a799000.android.anitapplication.R;
import ru.a799000.android.anitapplication.mvp.presenters.MainActivityPresenter;
import ru.a799000.android.anitapplication.mvp.views.MainActivityView;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    @InjectPresenter
    MainActivityPresenter mMainActivityPresenter;

    ControllerScreen mControllerScreen;

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mControllerScreen = new ControllerScreen(getFragmentManager());
    }

    @OnClick(R.id.tvMessage)
    void onClickTvMessage(){
        mMainActivityPresenter.onClickTvMessage();
    }

    @Override
    public void showMessage(String s) {
        tvMessage.setText(s);
    }

    @Override
    public void showListFragment() {
        mControllerScreen.startListScreen();
    }
}
