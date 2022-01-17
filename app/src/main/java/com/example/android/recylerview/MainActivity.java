package com.example.android.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {




    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelClass> userList ;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();
        initRecyclerView();




    }

    private void initData() {

        userList= new ArrayList<>();
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));
        userList.add(new modelClass(R.drawable.landscape,"Balpreet1","How are you ","10:32"));











    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
}