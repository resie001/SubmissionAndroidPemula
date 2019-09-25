package org.d3ifcool.submission;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridProvinceAdapter extends RecyclerView.Adapter<GridProvinceAdapter.GridViewHolder>{

    private ArrayList<Province> listProvince;
//    private Context context;

    public GridProvinceAdapter(ArrayList<Province> listProvince) {
        this.listProvince = listProvince;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_province, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, final int position) {
        final Province province = listProvince.get(position);
        Context context;

        Glide.with(holder.itemView.getContext())
                .load(province.getPhoto())
                .apply(new RequestOptions().override(500,500))
                .into(holder.imgPhoto);

        holder.tvName.setText(province.getName());
        holder.tvCapital.setText(province.getCapital());
        holder.btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ProvinceDetailActivity.class);
                intent.putExtra(ProvinceDetailActivity.PROVINCE,province.getName());
                intent.putExtra(ProvinceDetailActivity.CAPITAL,province.getCapital());
                intent.putExtra(ProvinceDetailActivity.DATE_PROVINCE,province.getDateProvince());
                intent.putExtra(ProvinceDetailActivity.DESCRIPTION,province.getDescription());
                intent.putExtra("Image",province.getPhoto());
                view.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listProvince.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPhoto;
        TextView tvName;
        TextView tvCapital;
        Button btnRead;

        GridViewHolder(@NonNull View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_photo);
            tvName = view.findViewById(R.id.tv_province_name);
            tvCapital = view.findViewById(R.id.tv_capital_name);
            btnRead = view.findViewById(R.id.btn_read);

//            btnRead.setOnClickListener(this);


        }

//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent(view.getContext(),ProvinceDetailActivity.class);
//            view.getContext().startActivity(intent);
//        }
    }

}
