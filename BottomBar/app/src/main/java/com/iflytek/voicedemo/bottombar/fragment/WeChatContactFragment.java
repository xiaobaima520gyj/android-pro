package com.iflytek.voicedemo.bottombar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iflytek.voicedemo.bottombar.R;
import com.wakehao.bar.BottomNavigationBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeChatContactFragment extends Fragment {


    public WeChatContactFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_we_chatc_contact, container, false);

        return view;
    }

}
