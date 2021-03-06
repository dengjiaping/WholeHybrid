package com.honeywell.wholesale.ui.transaction.preorders.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.honeywell.wholesale.R;
import com.honeywell.wholesale.framework.model.Customer;
import com.honeywell.wholesale.ui.base.BaseTextView;
import com.honeywell.wholesale.ui.friend.customer.CustomerAdapter;

import java.util.ArrayList;

/**
 * Created by xiaofei on 11/30/16.
 *
 */

public class CustomerListAdapter extends BaseAdapter{
    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SECTION = 1;

    private ArrayList<Object> arrayList;

    private Context context;

    public CustomerListAdapter(Context context, ArrayList<Object> arrayList) {
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
    public int getItemViewType(int position) {
        return (arrayList.get(position) instanceof String)? TYPE_SECTION : TYPE_ITEM;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (arrayList.get(position) instanceof String){
            if (convertView == null){
                holder = new ViewHolder();
                convertView = LayoutInflater.from(context).inflate(R.layout.item_customer_list_section, parent, false);
                holder.customerSection = (BaseTextView)convertView.findViewById(R.id.list_section);
                convertView.setTag(holder);
            }else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.customerSection = (BaseTextView)convertView.findViewById(R.id.list_section);
            String section = (String) arrayList.get(position);
            holder.customerSection.setText(section);
        }

        if (arrayList.get(position) instanceof Customer){
            if (convertView == null){
                holder = new ViewHolder();
                convertView = LayoutInflater.from(context).inflate(R.layout.item_customer_list_view, parent, false);
                holder.customerName = (BaseTextView)convertView.findViewById(R.id.customer_name_textView);
                holder.customerContact = (BaseTextView)convertView.findViewById(R.id.customer_contact_name_textView);
                holder.customerTele = (BaseTextView)convertView.findViewById(R.id.customer_tele_textView);
                convertView.setTag(holder);
            }else {
                holder = (ViewHolder) convertView.getTag();
            }

            Customer customer = (Customer)arrayList.get(position);

            holder.customerName.setText(customer.getCustomerName());
            holder.customerContact.setText(customer.getContactName() + ",");
            holder.customerTele.setText(customer.getContactPhone());

        }
        return convertView;
    }

    private static class ViewHolder {
        BaseTextView customerName;
        BaseTextView customerContact;
        BaseTextView customerTele;
        BaseTextView customerSection;
    }

}
