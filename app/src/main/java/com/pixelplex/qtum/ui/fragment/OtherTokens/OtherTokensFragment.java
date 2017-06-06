package com.pixelplex.qtum.ui.fragment.OtherTokens;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pixelplex.qtum.R;
import com.pixelplex.qtum.ui.fragment.BaseFragment.BaseFragment;
import com.pixelplex.qtum.ui.fragment.BaseFragment.BaseFragmentPresenterImpl;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by kirillvolkov on 01.06.17.
 */

public class OtherTokensFragment extends BaseFragment implements OtherTokensView {

    public final int LAYOUT = R.layout.fragment_other_tokens;

    public static OtherTokensFragment newInstance() {
        Bundle args = new Bundle();
        OtherTokensFragment fragment = new OtherTokensFragment();
        fragment.setArguments(args);
        return fragment;
    }

    OtherTokensPresenterImpl presenter;

    @BindView(R.id.recycler_view)
    RecyclerView tokensList;

    @OnClick(R.id.bt_share)
    public void onShareClick() {
        //TODO SHARE
    }

    @Override
    protected void createPresenter() {
        presenter = new OtherTokensPresenterImpl(this);
    }

    @Override
    protected BaseFragmentPresenterImpl getPresenter() {
        return presenter;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }

    @Override
    public void initializeViews() {
        super.initializeViews();
        tokensList.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}