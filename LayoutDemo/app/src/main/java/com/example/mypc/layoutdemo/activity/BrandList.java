package com.example.mypc.layoutdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.adapter.BrandAdapter;
import com.example.mypc.layoutdemo.model.Brand;

import org.w3c.dom.Text;

public class BrandList extends AppCompatActivity {
    public static final String LIST_BY_BRAND = "list_by_brand";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_list);

        RecyclerView rcvBrands = (RecyclerView)findViewById(R.id.rcvBrands);
        BrandAdapter adtBrand = new BrandAdapter(Brand.dummyData());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        rcvBrands.setLayoutManager(mLayoutManager);
        rcvBrands.setItemAnimator(new DefaultItemAnimator());
        rcvBrands.setAdapter(adtBrand);
    }

    public void toListByBrand(View view){
        Intent intent = new Intent(this, ListByBrands.class);
        TextView tvBrandId = (TextView)findViewById(R.id.brand_id);
        intent.putExtra(LIST_BY_BRAND, tvBrandId.getText());
        startActivity(intent);
    }
}
