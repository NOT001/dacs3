package com.example.dacs3.adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.dacs3.R;
import com.example.dacs3.object.truyentranh;

import java.util.ArrayList;
import java.util.List;

public class truyentranhadapter extends ArrayAdapter<truyentranh> {
    private Context ct;
    private ArrayList<truyentranh> arr;
    public truyentranhadapter( Context context, int resource,  List<truyentranh> objects) {
        super(context, resource, objects);
        this.ct= context;
        this.arr= new ArrayList<>(objects);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_truyen, null);
        }
        if (arr.size() > 0) {
            truyentranh truyentranh = this.arr.get(position);
            TextView tententruyen = convertView.findViewById(R.id.txttentruyen);
            TextView tentenchap = convertView.findViewById(R.id.txtchap);
            ImageView imgtruyen = convertView.findViewById(R.id.imgtruyen);

            tententruyen.setText(truyentranh.getTentruyen());
            tentenchap.setText(truyentranh.getTenchap());
            Glide.with(this.ct)
                    .load(truyentranh.getLinkanh())
                    .into(imgtruyen);
        }
        return convertView;
    }
}
