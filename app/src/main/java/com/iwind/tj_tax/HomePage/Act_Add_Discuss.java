package com.iwind.tj_tax.HomePage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.easemob.easeui.ui.EaseBaseActivity;
import com.easemob.easeui.widget.EaseTitleBar;
import com.iwind.Constant.ConstantString;
import com.iwind.tj_tax.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/**
 * 新增讨论
 * 作者：HuGuoJun
 * 2016/6/8 14:37
 * 邮箱：www.guojunkuaile@qq.com
 */
public class Act_Add_Discuss extends EaseBaseActivity {

    @ViewInject(R.id.title_bar)
    EaseTitleBar title_bar;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_act__add_discuss_second_step);
        ViewUtils.inject(this);
        InitView();
        InitData();
        setOnClickListener();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_industry:
                startActivity(new Intent(context, Act_Select_Choice.class).putExtra(ConstantString.TYPE, "1"));
                break;
            case R.id.rl_type:
                startActivity(new Intent(context, Act_Select_Choice.class).putExtra(ConstantString.TYPE, "2"));
                break;
        }

    }

    @Override
    public void InitView() {
        title_bar.setLeftImageResource(R.drawable.ease_mm_title_back);
        title_bar.setRightText(getResources().getString(R.string.brown));
        title_bar.setTitle(getResources().getString(R.string.add_discuss));
    }

    @Override
    public void InitData() {

    }

    @Override
    public void setOnClickListener() {
        title_bar.setLeftLayoutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        title_bar.setRightLayoutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
