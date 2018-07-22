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
 * 項目種類2 - 元件右至左
 *
 * @author adam_yeh
 * @date 7/17/18
 */
public class ItemViewHolder2 extends BaseItemViewHolder {

    private TextView title;
    private TextView genre;
    private TextView year;
    private Button click;
    private ImageView image;

    public ItemViewHolder2 (@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_2);
        genre = (TextView) itemView.findViewById(R.id.genre_2);
        year = (TextView) itemView.findViewById(R.id.year_2);
        click = (Button) itemView.findViewById(R.id.click_2);
        image = (ImageView) itemView.findViewById(R.id.icon_2);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.click_2:
                Toast.makeText(v.getContext(), "Button clicked No. " + super.getAdapterPosition() + " item.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_2:
                Intent i = new Intent(v.getContext(), Main2Activity.class);
                i.putExtra("position", "Item clicked No. " + super.getAdapterPosition() + " item.");
                v.getContext().startActivity(i);

                break;
        }
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