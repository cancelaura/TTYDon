package com.ntian.ttydon.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ntian.ttydon.R;
import com.ntian.ttydon.util.SharedPreferencesUtils;
import com.ntian.ttydon.view.StepArcView;

/**
 * Created by mjt89 on 2017/9/13 0013.
 */

public class stepMainActivity extends AppCompatActivity implements Handler.Callback, View.OnClickListener{

    private TextView tv_data;
    private StepArcView cc;
    private TextView tv_set;
    private TextView tv_isSupport;
    private Handler delayHandler;
    private SharedPreferencesUtils sp;

    private void init() {
        tv_data = (TextView) findViewById(R.id.tv_data);
        cc = (StepArcView) findViewById(R.id.cc);
        tv_set = (TextView) findViewById(R.id.tv_set);
        tv_isSupport = (TextView) findViewById(R.id.tv_isSupport);
    }

    @Override
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override
    public void onClick(View view) {

    }
}
