package com.example.mypc.layoutdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.adapter.PropAdapter;
import com.example.mypc.layoutdemo.model.Article;
import com.example.mypc.layoutdemo.model.Property;

import java.util.ArrayList;
import java.util.List;

public class ArticleDetail extends AppCompatActivity {
    List<Property> properties = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        Article selectedArticle = (Article) getIntent().getSerializableExtra(ListByBrands.SELECTED_ARTICLE);

        RecyclerView rcvProp = (RecyclerView) findViewById(R.id.rcvProps);
        PropAdapter adtProp = new PropAdapter(selectedArticle.getProperties());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        rcvProp.setLayoutManager(mLayoutManager);
        rcvProp.setAdapter(adtProp);

        String sellerName = selectedArticle.getSeller().getName();
        String sellerPhone = selectedArticle.getSeller().getPhone_number();
        String sellerAddress = selectedArticle.getSeller().getAddress();

        ((TextView)findViewById(R.id.seller_name)).setText(sellerName);
        ((TextView)findViewById(R.id.seller_address)).setText(sellerAddress);
        ((TextView)findViewById(R.id.seller_phone_number)).setText(sellerPhone);

    }
}
