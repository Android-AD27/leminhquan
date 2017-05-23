package com.example.mypc.layoutdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.adapter.ArticleAdapter;
import com.example.mypc.layoutdemo.adapter.BrandAdapter;
import com.example.mypc.layoutdemo.model.Article;
import com.example.mypc.layoutdemo.model.Brand;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListByBrands extends AppCompatActivity {
    List<Article> lstArticleByBrand = new ArrayList<Article>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_by_brands);

        Intent intent = getIntent();
        Integer brandId = Integer.valueOf(intent.getStringExtra(BrandList.LIST_BY_BRAND));

        TextView brandName = (TextView) findViewById(R.id.brand_name);
        brandName.setText(Brand.getBrandNameById(brandId));

        RecyclerView rcvArtices = (RecyclerView)findViewById(R.id.rcvArticlesByBrand);
        ArticleAdapter adtArticles = new ArticleAdapter(lstArticleByBrand);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        rcvArtices.setLayoutManager(mLayoutManager);
        rcvArtices.setAdapter(adtArticles);

        prepareData();

    }

    private void prepareData() {
        Article article = new Article(1, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);

        article = new Article(1, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(2, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(3, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(4, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(5, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(6, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(7, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
        article = new Article(8, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date());
        lstArticleByBrand.add(article);
    }
}
