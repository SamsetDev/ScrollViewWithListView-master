package com.samset.listview_in_scrollview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.samset.listview_in_scrollview.R;

import java.util.List;

/**
 * Created by weesync on 22/03/16.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<String> listdata;
    public ListViewAdapter(Context ctx, List<String> list)
    {
      this.context=ctx;
        this.listdata=list;
    }

    @Override
    public int getCount() {
        return listdata.size();
    }

    @Override
    public Object getItem(int position) {
        return listdata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        MyHolder myHolder=new MyHolder();
        if (convertView==null)
        {
           convertView =layoutInflater.inflate(R.layout.item, parent, false);
            myHolder.item= (TextView) convertView.findViewById(R.id.item);
            convertView.setTag(myHolder);
        }else
        {
        myHolder= (MyHolder) convertView.getTag();
        }
        myHolder.item.setText(listdata.get(position));


        return convertView;
    }
    public class MyHolder
    {
        TextView item;
    }
}
