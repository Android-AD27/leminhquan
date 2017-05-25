package com.example.mypc.layoutdemo.activity;

import android.content.Intent;
import android.content.res.Resources;
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
        Resources contextRes = this.getApplicationContext().getResources();
        List<Property> properties = new ArrayList<>();
        Property prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "Động cơ dầu");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "RFD - Dẫn động cầu sau");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "Số tay");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop8), "205/65R15");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop9), "7 L/100km");
        properties.add(prop);

        Seller seller = new Seller("1", "Toyota Hung Vuong", "0945-99-99-99", "26 Kinh Duong Vuong, P.13, Q.6, Tp.HCM");
        Seller seller2 = new Seller("2", "Toyota My Dinh", "0945-88-88-88", "15 Phạm Hùng, Mỹ Đình 2, Cầu Giấy, Hà Nội");
        Seller seller3 = new Seller("3", "Nissan Thang Long", "0945-77-77-77", "Tòa Nhà Haprosimex, Km 12, Đường 32, Phường Phúc Diễn, Hà Nội");


        Article article = new Article(1, R.drawable.acura, 1, "735m", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "2800cc");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "Số tự động");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "9 L/100km");
        properties.add(prop);
        article = new Article(2, R.drawable.acura, 1, "735 triệu", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "2488cc");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "Động cơ dầu");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "4WD - Dẫn động 4 bánh");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "Số tự động");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop8), "205/65R15");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop9), " 15 inches");
        properties.add(prop);
        article = new Article(3, R.drawable.baic, 1, "800 triệu", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "Động cơ dầu");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2198cc");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "Số tay");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "4WD - Dẫn động 4 bánh");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop8), "7 L/100km");
        properties.add(prop);
        article = new Article(4, R.drawable.asia, 1, "900 triệu", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "Động cơ dầu");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "Truoc dia, sau tang trong");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "4WD - Dẫn động 4 bánh");
        properties.add(prop);
        article = new Article(5, R.drawable.chery, 1, "920 triệu", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "XANG VVT-i");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        article = new Article(6, R.drawable.cadillac, 1, "1,2 tỉ", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "XANG VVT-i");
        properties.add(prop);
        article = new Article(7, R.drawable.bentley, 1, "1,5 tỉ", "title1", 1, 1, 1, new Date(), properties, seller);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "XANG VVT-i");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "Truoc dia, sau tang trong");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "He thong treo truoc doc, sau phu thuoc");
        properties.add(prop);
        article = new Article(8, R.drawable.aston_martin, 1, "2,3 tỉ", "title1", 1, 1, 1, new Date(), properties, seller2);
        lstArticleByBrand.add(article);

        properties = new ArrayList<>();
        prop = new Property(contextRes.getString(R.string.prop1), "4580x1770x1750");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop2), "1550");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop3), "XANG VVT-i");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop4), "2000");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop5), "55");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop6), "Truoc dia, sau tang trong");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop7), "He thong treo truoc doc, sau phu thuoc");
        properties.add(prop);
        prop = new Property(contextRes.getString(R.string.prop8), "205/65R15");
        properties.add(prop);
        article = new Article(9, R.drawable.bmw, 1, "Liên h", "title1", 1, 1, 1, new Date(), properties, seller3);
        lstArticleByBrand.add(article);
    }
}
