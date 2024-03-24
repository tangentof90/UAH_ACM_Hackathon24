package com.example.hack24;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdaptr extends BaseAdapter {
    Context context;
    String DateEvent[];
    LayoutInflater inflater;


    public CustomBaseAdaptr(Context ctx, String[] EventDate) {
        this.context = ctx;
        this.DateEvent = EventDate;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {

        return DateEvent.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = inflater.inflate(R.layout.activity_event_box, null);
        TextView nextView = (TextView) convertView.findViewById(R.id.Date);
        nextView.setText(DateEvent[position]);
        return convertView;
    }
}
