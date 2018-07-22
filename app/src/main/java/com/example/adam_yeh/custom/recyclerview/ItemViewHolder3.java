package com.example.adam_yeh.custom.recyclerview;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 項目種類3 - Radio button 變色
 *
 * @author adam_yeh
 * @date 7/17/18
 */
public class ItemViewHolder3 extends BaseItemViewHolder implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup group;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private RadioButton radio5;
    private RadioButton radio6;

    public ItemViewHolder3 (@NonNull View itemView) {
        super(itemView);
        group = itemView.findViewById(R.id.radio_group);
        radio1 = itemView.findViewById(R.id.radio_1);
        radio2 = itemView.findViewById(R.id.radio_2);
        radio3 = itemView.findViewById(R.id.radio_3);
        radio4 = itemView.findViewById(R.id.radio_4);
        radio5 = itemView.findViewById(R.id.radio_5);
        radio6 = itemView.findViewById(R.id.radio_6);
    }

    @Override
    public void onCheckedChanged (RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.radio_1:
                super.itemView.setBackgroundColor(Color.RED);
                break;

            case R.id.radio_2:
                super.itemView.setBackgroundColor(Color.BLUE);
                break;

            case R.id.radio_3:
                super.itemView.setBackgroundColor(Color.CYAN);
                break;

            case R.id.radio_4:
                super.itemView.setBackgroundColor(Color.DKGRAY);
                break;

            case R.id.radio_5:
                super.itemView.setBackgroundColor(Color.GREEN);
                break;

            case R.id.radio_6:
                super.itemView.setBackgroundColor(Color.LTGRAY);
                break;
        }
    }

    @Override
    public void onClick (View v) {
        super.onClick(v);
    }

    public void setBindView (RecyclerViewVO vo) {
        group.setOnCheckedChangeListener(this);
        super.itemView.setOnClickListener(this);
        super.itemView.setBackgroundColor(vo.getColor());
    }

}