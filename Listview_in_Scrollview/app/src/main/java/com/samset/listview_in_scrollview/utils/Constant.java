package com.samset.listview_in_scrollview.utils;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weesync on 22/03/16.
 */
public class Constant {

    public static List<String> getList()
    {

        String a = "USA";
        String b = "Canada";
        String c = "Afgahnistan";
        String d = "India";
        String f = "Denmark";
        String e = "Belgium";
        String h = "Hungary";
        String i = "Russia";


        List<String> data=new ArrayList<>();
        data.add("USA");
        data.add("India");
        data.add("Canada");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Hungary");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");
        data.add("India");
        data.add("Belgium");
        data.add("India");
        data.add("India");
        data.add("India");
        data.add("Russia");
        data.add("India");
        data.add("India");
        data.add("Afgahnistan");
        data.add("India");
        data.add("Denmark");
        data.add("India");
        data.add("Shri Lanka");
        data.add("India");
        data.add("Pakistan");

        return data;

    }

    public static void expandListViewSize(ListView listview) {
        ListAdapter adapter = listview.getAdapter();
        if (adapter == null) { return; }

        int totalHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            View item = adapter.getView(i, null, listview);
            item.measure(0, 0);
            totalHeight += item.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listview.getLayoutParams();
        params.height = totalHeight + (listview.getDividerHeight() * (adapter.getCount() - 1));
        listview.setLayoutParams(params);
        Log.e("height of listItem:", String.valueOf(totalHeight));
    }
}
