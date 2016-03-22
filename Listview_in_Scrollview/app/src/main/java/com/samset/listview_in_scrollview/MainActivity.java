package com.samset.listview_in_scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;

import com.samset.listview_in_scrollview.adapter.ListViewAdapter;
import com.samset.listview_in_scrollview.utils.Constant;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list;
    private ListViewAdapter listAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= Constant.getList();
        listView = (ListView) findViewById(R.id.listView);
        listAdapter=new ListViewAdapter(this,list);
        listView.setAdapter(listAdapter);
        Constant.expandListViewSize(listView);

    }
}
