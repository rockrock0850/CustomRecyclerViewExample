package com.example.adam_yeh.custom.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/**
 * @author adam_yeh
 * @date 7/17/18
 */
public abstract class BaseItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public BaseItemViewHolder (@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.click:
                Toast.makeText(v.getContext(), "Button clicked No. " + super.getAdapterPosition() + " item.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item:
                startActivity(v);
                break;

            case R.id.click_2:
                Toast.makeText(v.getContext(), "Button clicked No. " + super.getAdapterPosition() + " item.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_2:
                startActivity(v);
                break;
        }
    }

    private void startActivity (View v) {
        Intent i = new Intent(v.getContext(), Main2Activity.class);
        i.putExtra("position", "Item clicked No. " + super.getAdapterPosition() + " item.");
        v.getContext().startActivity(i);
    }

}
