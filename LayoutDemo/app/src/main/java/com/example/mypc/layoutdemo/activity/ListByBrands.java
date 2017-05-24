package com.example.mypc.layoutdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.adapter.ArticleAdapter;
import com.example.mypc.layoutdemo.model.Article;
import com.example.mypc.layoutdemo.model.Brand;
import com.example.mypc.layoutdemo.model.Property;
import com.example.mypc.layoutdemo.model.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListByBrands extends AppCompatActivity implements  ArticleAdapter.ArticleClickListener{
    List<Article> lstArticleByBrand = new ArrayList<Article>();
    public static String SELECTED_ARTICLE = "selected_article";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_by_brands);

        Intent intent = getIntent();
        Integer brandId = Integer.valueOf(intent.getStringExtra(BrandList.LIST_BY_BRAND));

        TextView brandName = (TextView) findViewById(R.id.brand_name);
        brandName.setText(Brand.getBrandNameById(brandId));

        RecyclerView rcvArtices = (RecyclerView)findViewById(R.id.rcvArticlesByBrand);
        ArticleAdapter adtArticles = new ArticleAdapter(lstArticleByBrand, this);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        rcvArtices.setLayoutManager(mLayoutManager);
        rcvArtices.setAdapter(adtArticles);

        prepareData();

    }

    @Override
    public void onClick(Article article) {
        Intent itArticleDetail = new Intent(this, ArticleDetail.class);
        itArticleDetail.putExtra(SELECTED_ARTICLE, article);
        startActivity(itArticleDetail);
    }

    private void prepareData() {
        List<Property> properties = new ArrayList<>();
        Property prop = new Property("Dai x rong x cao (mm)", "4580x1770x1750");
        properties.add(prop);
        prop = new Property("Dai x rong x cao (mm)", "4580x1770x1750");
        properties.add(prop);
        prop = new Property("Trong luong khong tai (kg)", "1550");
        properties.add(prop);
        prop = new Property("Dong co", "XANG VVT-i");
        properties.add(prop);
        prop = new Property("Dung tich dong co", "2000");
        properties.add(prop);
        prop = new Property("Dung tich nhien lieu", "55");
        properties.add(prop);
        prop = new Property("Phanh", "Truoc dia, sau tang trong");
        properties.add(prop);
        prop = new Property("Bo giam xoc", "He thong treo truoc doc, sau phu thuoc");
        properties.add(prop);
        prop = new Property("Lop xe", "205/65R15");
        properties.add(prop);
        prop = new Property("Vanh mam xe", "duc 15 inches");
        properties.add(prop);

        Seller seller = new Seller("1", "Toyota Hung Vuong", "0945-99-99-99", "26 Kinh Duong Vuong, P.13, Q.6, Tp.HCM");
        Seller seller2 = new Seller("2", "Toyota My Dinh", "0945-88-88-88", "15 Phạm Hùng, Mỹ Đình 2, Cầu Giấy, Hà Nội");
        Seller seller3 = new Seller("3", "Nissan Thang Long", "0945-77-77-77", "Tòa Nhà Haprosimex, Km 12, Đường 32, Phường Phúc Diễn, Hà Nội");


        Article article = new Article(1, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);

        article = new Article(1, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);
        article = new Article(2, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);
        article = new Article(3, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);
        article = new Article(4, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);
        article = new Article(5, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);
        article = new Article(6, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);
        article = new Article(7, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);
        article = new Article(8, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);
    }
}
