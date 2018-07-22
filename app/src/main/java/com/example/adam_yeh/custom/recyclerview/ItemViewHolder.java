package com.example.adam_yeh.custom.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 項目種類1 - 元件左至右
 *
 * @author adam_yeh
 * @date 7/17/18
 */
public class ItemViewHolder extends BaseItemViewHolder {

    private TextView title;
    private TextView genre;
    private TextView year;
    private Button click;
    private ImageView image;

    public ItemViewHolder (@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        genre = (TextView) itemView.findViewById(R.id.genre);
        year = (TextView) itemView.findViewById(R.id.year);
        click = (Button) itemView.findViewById(R.id.click);
        image = (ImageView) itemView.findViewById(R.id.icon);
    }

    public void setBindView (RecyclerViewVO vo) {
        title.setText(vo.getTitle());
        genre.setText(vo.getGenre());
        year.setText(vo.getYear());
        image.setImageResource(vo.getImgId());
        click.setOnClickListener(this);
        super.itemView.setOnClickListener(this);
    }

}