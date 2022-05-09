package com.helaman.itemscheduler;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataParser parser = new DataParser();
        parser.loadJSONFromAsset(this);
        parser.parse();

        ListView listview = findViewById(R.id.students);
        ArrayList<HashMap<String, String>> userList = parser.getStudentList();

        ListAdapter simpleAdapter = new SimpleAdapter(MainActivity.this, userList, R.layout.list, new String[]{"name", "startDate"}, new int[]{R.id.MentorName, R.id.startDate});
        listview.setAdapter(simpleAdapter);
    }
}
