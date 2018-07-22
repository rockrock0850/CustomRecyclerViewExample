package com.example.adam_yeh.custom.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author adam_yeh
 * @date 7/16/18
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int VIEW_TYPE_1 = 1;
    private final int VIEW_TYPE_2 = 2;
    private final int VIEW_TYPE_3 = 3;

    private List<RecyclerViewVO> list;

    public RecyclerViewAdapter (List<RecyclerViewVO> list) {
        this.list = linkData(list);
    }

    public void changeViewData (List<RecyclerViewVO> list) {
        this.list = linkData(list);
    }

    @Override
    public int getItemViewType (int position) {
        int viewType = -1;

        switch (list.get(position).getViewType()) {
            case VIEW_TYPE_1:
                viewType = VIEW_TYPE_1;
                break;

            case VIEW_TYPE_2:
                viewType = VIEW_TYPE_2;
                break;

            case VIEW_TYPE_3:
                viewType = VIEW_TYPE_3;
                break;
        }

        return viewType;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = null;
        RecyclerView.ViewHolder holder = null;

        switch (viewType) {
            case VIEW_TYPE_1:
                itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
                holder = new ItemViewHolder(itemView);

                break;

            case VIEW_TYPE_2:
                itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_2, viewGroup, false);
                holder = new ItemViewHolder2(itemView);

                break;

            case VIEW_TYPE_3:
                itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_3, viewGroup, false);
                holder = new ItemViewHolder3(itemView);

                break;
        }

        return holder;
    }

    @Override
    public void onBindViewHolder (@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        RecyclerViewVO vo = list.get(position);

        switch (vo.getViewType()) {
            case VIEW_TYPE_1:
                ItemViewHolder holder = (ItemViewHolder) viewHolder;
                holder.setBindView(vo);

                break;

            case VIEW_TYPE_2:
                ItemViewHolder2 holder2 = (ItemViewHolder2) viewHolder;
                holder2.setBindView(vo);

                break;

            case VIEW_TYPE_3:
                ItemViewHolder3 holder3 = (ItemViewHolder3) viewHolder;
                holder3.setBindView(vo);

                break;
        }
    }

    @Override
    public int getItemCount () {
        return list.size();
    }

    // 將VO內的名稱欄位資料轉成識別符
    private List<RecyclerViewVO> linkData (List<RecyclerViewVO> dataList) {
        for (RecyclerViewVO vo : dataList) {
            vo.setImgId(vo.getImgName());
            vo.setColor(vo.getColorName());
        }

        return dataList;
    }

}
