package com.example.mypc.layoutdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.model.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leminhquan on 24/05/2017.
 */

public class PropAdapter extends RecyclerView.Adapter<PropAdapter.ViewHolder> {
    List<Property> lstProps = new ArrayList<>();

    public PropAdapter(List<Property> lstProps) {
        this.lstProps = lstProps;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemProp = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prop, parent, false);
        ViewHolder vhProp = new ViewHolder(itemProp);
        return vhProp;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Property prop = lstProps.get(position);
        holder.propName.setText(prop.getPropertyName());
        holder.propValue.setText(prop.getPropertyValue());
        if(position%2 == 0){
            holder.itemView.setBackground(holder.itemView.getContext().getResources().getDrawable(R.drawable.striped_background, null));
        }
    }

    @Override
    public int getItemCount() {
        return lstProps.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView propName;
        TextView propValue;
        View itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            propName = (TextView)itemView.findViewById(R.id.prop_name);
            propValue = (TextView)itemView.findViewById(R.id.prop_value);
        }
    }
}
