package com.example.mypc.layoutdemo.model;

import com.example.mypc.layoutdemo.R;

import java.util.ArrayList;

/**
 * Created by leminhquan on 23/05/2017.
 */

public class Brand {
    String brandName;
    int brandImgThumb;
    ArrayList<Article> lstArticle;
    int brandId;

    public Brand(int brandId, String brandName, int brandImgThumb, ArrayList<Article> lstArticle) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandImgThumb = brandImgThumb;
        this.lstArticle = lstArticle;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getBrandImgThumb() {
        return brandImgThumb;
    }

    public void setBrandImgThumb(int brandImgThumb) {
        this.brandImgThumb = brandImgThumb;
    }

    public ArrayList<Article> getLstArticle() {
        return lstArticle;
    }

    public void setLstArticle(ArrayList<Article> lstArticle) {
        this.lstArticle = lstArticle;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public static ArrayList<Brand> dummyData(){
        ArrayList<Brand> lstBrands = new ArrayList<Brand>();
        lstBrands.add(new Brand(1, "Acura", R.drawable.acura, new ArrayList<Article>()));
        lstBrands.add(new Brand(2, "Alpha Romeo", R.drawable.alfa_romeo, new ArrayList<Article>()));
        lstBrands.add(new Brand(3, "Asia", R.drawable.asia, new ArrayList<Article>()));
        lstBrands.add(new Brand(4, "Aston Martin", R.drawable.aston_martin, new ArrayList<Article>()));
        lstBrands.add(new Brand(5, "Audi", R.drawable.audi, new ArrayList<Article>()));
        lstBrands.add(new Brand(6, "Baic", R.drawable.baic, new ArrayList<Article>()));
        lstBrands.add(new Brand(7, "Bentley", R.drawable.bentley, new ArrayList<Article>()));
        lstBrands.add(new Brand(8, "BMW", R.drawable.bmw, new ArrayList<Article>()));
        lstBrands.add(new Brand(9, "Buick", R.drawable.buick, new ArrayList<Article>()));
        lstBrands.add(new Brand(10, "BYD", R.drawable.byd, new ArrayList<Article>()));
        lstBrands.add(new Brand(11, "Cadillac", R.drawable.cadillac, new ArrayList<Article>()));
        lstBrands.add(new Brand(12, "Changan", R.drawable.changan, new ArrayList<Article>()));
        lstBrands.add(new Brand(13, "Cherry", R.drawable.chery, new ArrayList<Article>()));
        lstBrands.add(new Brand(14, "Chevrolet", R.drawable.chevrolet, new ArrayList<Article>()));
        return lstBrands;
    }

    public static String getBrandNameById(int brandId){
        String brandName;
        switch (brandId) {
            case 1:
                brandName = "Acura";
                break;
            case 2:
                brandName = "Alpha Romeo";
                break;
            case 3:
                brandName = "Asia";
                break;
            case 4:
                brandName = "Aston Martin";
                break;
            case 5:
                brandName = "Audi";
                break;
            case 6:
                brandName = "Baic";
                break;
            case 7:
                brandName = "Bentley";
                break;
            case 8:
                brandName = "BMW";
                break;
            case 9:
                brandName = "Buick";
                break;
            case 10:
                brandName = "BYD";
                break;
            case 11:
                brandName = "Cadillac";
                break;
            case 12:
                brandName = "Changan";
                break;
            case 13:
                brandName = "Cherry";
                break;
            case 14:
                brandName = "Chevrolet";
                break;
            default:
                brandName = "All";
                break;
        }

        return brandName;
    }
}
