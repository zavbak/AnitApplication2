package ru.a799000.android.anitapplication.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.a799000.android.anitapplication.R;
import ru.a799000.android.anitapplication.mvp.views.ListView;
import ru.a799000.android.anitapplication.mvp.presenters.ListPresenter;

import com.arellomobile.mvp.MvpFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class ListFragment extends MvpFragment implements ListView {
    public static final String TAG = "ListFragment";
    @InjectPresenter
    ListPresenter mListPresenter;

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    public static ListFragment newInstance() {
        ListFragment fragment = new ListFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ButterKnife.bind(this,view);

        return view;
    }


    @OnClick(R.id.tvMessage)
    void onClickTvMessage(){
        mListPresenter.onClickTvMessage();
    }

    @Override
    public void showMessage(String s) {
        tvMessage.setText(s);
    }

    @Override
    public void onViewCreated(final View view, final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
