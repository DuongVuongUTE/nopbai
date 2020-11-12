package com.example.kiemtralist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class sodienthoaiAdapter  extends BaseAdapter {

    Context context;
    int layout;
    List<sodienthoai> Arraylist;

    public sodienthoaiAdapter(Context context, int layout, List<sodienthoai> arraylist) {
        this.context = context;
        this.layout = layout;
        Arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return Arraylist.size();
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
        ViewHolder viewHolder;
        if (convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout,null);
            viewHolder = new ViewHolder();

            viewHolder.img = convertView.findViewById(R.id.img);
            viewHolder.text=(TextView)convertView.findViewById(R.id.text);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.text.setText(Arraylist.get(position).getText());
        viewHolder.img.setImageResource(Arraylist.get(position).getImg());
        return convertView;
    }
    public class ViewHolder{
        TextView text;
        ImageView img;
    }
}
