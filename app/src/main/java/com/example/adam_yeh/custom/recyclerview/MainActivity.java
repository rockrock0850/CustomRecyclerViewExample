package com.example.adam_yeh.custom.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import static com.example.adam_yeh.custom.recyclerview.AssetsUtil.getJSONFromAsset;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = this.getClass().getSimpleName();

    private RecyclerViewAdapter adapter;
    private EditText dataType;
    private Button change;
    private Button addItem;
    private RecyclerView recyclerView;
    private List<RecyclerViewVO> dataList;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataType = (EditText) super.findViewById(R.id.data_type);
        change = (Button) super.findViewById(R.id.change);
        addItem = (Button) super.findViewById(R.id.add_item);
        dataList = AssetsUtil.getJSONFromAsset(super.getAssets());
        adapter = new RecyclerViewAdapter(dataList);

        addItem.setOnClickListener(this);
        change.setOnClickListener(this);

        manager = new LinearLayoutManager(this);

        recyclerView = (RecyclerView) super.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.change:
                changeViewData(dataType);
                break;

            case R.id.add_item:
                addSingleItem();
                break;
        }

        hideKeyboard(this);
    }

    //
    private void addSingleItem () {
        RecyclerViewVO vo = new RecyclerViewVO();
        vo.setViewType(RandomItemUtil.getViewType());
        vo.setImgId(RandomItemUtil.getImag());
        vo.setTitle(RandomItemUtil.getName());
        vo.setGenre("Generate");
        vo.setYear(RandomItemUtil.getYear());
        dataList.add(vo);
        adapter.notifyDataSetChanged();
        manager.scrollToPosition(dataList.size() - 1);
    }

    //
    private void changeViewData (EditText editText) {
        dataList = AssetsUtil.getJSONFromAsset(editText.getText().toString(), super.getAssets());

        if (dataList.isEmpty()) {
            Toast.makeText(this, "File not found.", Toast.LENGTH_SHORT).show();
            editText.setText("");

            return;
        }

        adapter.changeViewData(dataList);
        recyclerView.swapAdapter(adapter, true);
        editText.setText("");
    }

    //
    private void hideKeyboard (Activity activity) {
        View view = activity.getCurrentFocus();
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
