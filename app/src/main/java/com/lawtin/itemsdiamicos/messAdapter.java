package com.lawtin.itemsdiamicos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class messAdapter extends BaseAdapter {

    private ArrayList<RowItemMes> siglerRow;

    private LayoutInflater thisInflater;

    public messAdapter(Context context, ArrayList<RowItemMes> eRow){

        this.siglerRow=eRow;
        thisInflater=(LayoutInflater.from(context));

    }



    @Override
    public int getCount() {

        return siglerRow.size();
    }

    @Override
    public Object getItem(int position) {
        return siglerRow.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            convertView=thisInflater.inflate(R.layout.mes_list_item,parent,false);

            TextView txtTituloMes=(TextView) convertView.findViewById(R.id.mesTitulo);

            RowItemMes currentItemMes=(RowItemMes) getItem(position);

            txtTituloMes.setText(currentItemMes.getTituloMes());


        }
        return convertView;
    }
}
