package com.example.kiemtralist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView listview;
    ArrayList<sodienthoai> list;
    sodienthoaiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listview=findViewById(R.id.listview);
        list=new ArrayList<>();
        list.add(new sodienthoai("Dương Vương",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Hoài",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Tiến",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Minh",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Hùng",R.drawable.utelogo));
        list.add(new sodienthoai("Dương San",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Mộc",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Đình",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Nghệ",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Tào Lao",R.drawable.utelogo));
        list.add(new sodienthoai("Dương Bậy Bạ",R.drawable.utelogo));
        adapter=new sodienthoaiAdapter( this,R.layout.list_item,list);
        listview.setAdapter(adapter);
        registerForContextMenu(listview);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(list.this,list.get(position).getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.delete:
                list.remove(info.position);
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
//        return super.onContextItemSelected(item);

    }

}