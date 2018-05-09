package org.brohede.marcus.fragmentsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacobsvensson on 2018-05-02.
 */

public class AdapterMountain extends ArrayAdapter {
    private Context context;
    private List<MountainData> mtnList = new ArrayList<>();

    public AdapterMountain(Context c, ArrayList<MountainData> list){
        super(c, 0, list);
        context = c;
        mtnList = list;
    }

    @Override
    public @NonNull View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;

        if(listItem == null){
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item_textview, parent, false);
        }

        MountainData currentMountain = mtnList.get(position);

        TextView name = listItem.findViewById(R.id.textView);
        name.setText(currentMountain.getName());

        TextView location = listItem.findViewById(R.id.textView2);
        location.setText(currentMountain.getLocation());

        TextView height = listItem.findViewById(R.id.textView3);
        height.setText(currentMountain.getHeight());

        return listItem;
    }







}
