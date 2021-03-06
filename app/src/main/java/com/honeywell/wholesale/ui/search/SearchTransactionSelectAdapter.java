package com.honeywell.wholesale.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.honeywell.wholesale.R;
import com.honeywell.wholesale.ui.base.BaseTextView;

import java.util.ArrayList;

/**
 * Created by xiaofei on 9/9/16.
 *
 */
public class SearchTransactionSelectAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> arrayList;

    public SearchTransactionSelectAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_search_selection_list, parent, false);
        }

        BaseTextView selectionTextView = (BaseTextView) convertView.findViewById(R.id.search_select_item_textView);
        selectionTextView.setText(arrayList.get(position));
        return convertView;
    }
}
