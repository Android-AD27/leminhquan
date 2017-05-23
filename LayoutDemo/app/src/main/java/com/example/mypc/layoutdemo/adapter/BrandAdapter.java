package com.example.mypc.layoutdemo.adapter;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.model.Brand;

import java.util.List;

/**
 * Created by leminhquan on 23/05/2017.
 */

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.HolderView> {
    List<Brand> list;

    public BrandAdapter(List<Brand> list) {
        this.list = list;
    }

    @Override
    public HolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand, parent, false);
        HolderView holderView = new HolderView(itemView);
        return holderView;
    }

    @Override
    public void onBindViewHolder(HolderView holder, int position) {
        Brand brand = list.get(position);
        holder.tvBrandId.setText(Integer.toString(brand.getBrandId()));
        holder.tvBrandName.setText(brand.getBrandName());
        holder.tvBrandCount.setText(Integer.toString(brand.getLstArticle().size()) + " tin rao");
        holder.imgThumb.setImageResource(brand.getBrandImgThumb());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class HolderView extends RecyclerView.ViewHolder {
        TextView tvBrandId;
        ImageView imgThumb;
        TextView tvBrandName;
        TextView tvBrandCount;

        public HolderView(View itemView) {
            super(itemView);
            tvBrandId = (TextView) itemView.findViewById(R.id.brand_id);
            imgThumb = (ImageView) itemView.findViewById(R.id.car_thumbnail);
            tvBrandName = (TextView) itemView.findViewById(R.id.car_brand);
            tvBrandCount = (TextView) itemView.findViewById(R.id.news_count);
        }

    }
}
