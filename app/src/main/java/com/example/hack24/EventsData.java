package com.example.hack24;
import java.util.ArrayList;

public class EventsData {
    ArrayList<String> Title = new ArrayList<String>(10);
   // Title.add("Hackathon");
    ArrayList<String> Date = new ArrayList<String>(10);
    ArrayList<String> Time = new ArrayList<String>(10);
    ArrayList<String> Location = new ArrayList<String>(10);
    ArrayList<String> Category = new ArrayList<String>(10);

    EventsData(String title, String date, String time, String location, String category) {
        this.Title.add(title);
        this.Date.add(date);
        this.Time.add(time);
        this.Location.add(location);
        this.Category.add(category);
    }

    public int getLength() {
        return Title.size();
    }
}
