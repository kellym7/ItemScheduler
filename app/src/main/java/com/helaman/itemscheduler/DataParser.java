package com.helaman.itemscheduler;

import android.content.Context;
import android.util.Log;

import com.helaman.itemscheduler.model.Item;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class DataParser {

    public DataParser() {}

    private String json = null;

    private ArrayList<Item> mentors = new ArrayList<>();

    public void parse() {
        try {
            JSONObject jsObj = new JSONObject(json);
            JSONArray jsArray = jsObj.getJSONArray("data");
            for (int i = 0; i < jsArray.length(); i++) {
                JSONObject obj = jsArray.getJSONObject(i);
                Item a = new Item(obj.getString("url"),
                        obj.getString("startDate"),
                        obj.getString("endDate"),
                        obj.getString("name"),
                        obj.getString("icon"),
                        obj.getString("venue"),
                        obj.getString("objType"),
                        obj.getString("loginRequired")
                );
                mentors.add(a);
            }
        }catch (JSONException ex) {
            Log.e("JsonParser ", "Exception", ex);
        }
    }

    public ArrayList<HashMap<String, String>> getStudentList() {
        ArrayList<HashMap<String, String>> mentorList = new ArrayList<>();

        for (int i = 0; i < mentors.size(); i++) {
            Item a = mentors.get(i);
            HashMap<String, String> mentor = new HashMap<>();
            mentor.put("name", a.getName());
            mentor.put("startDate", a.getStartDate());
            mentorList.add(mentor);
        }
        return mentorList;
    }

    public void loadJSONFromAsset(Context context) {
        try {
            InputStream is = context.getAssets().open("data.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}