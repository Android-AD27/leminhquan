package com.example.mypc.layoutdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mypc.layoutdemo.R;
import com.example.mypc.layoutdemo.business.ArticleBussiness;
import com.example.mypc.layoutdemo.model.Article;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by leminhquan on 23/05/2017.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.HolderView> {
    public interface ArticleClickListener{
        void onClick(Article itemArticle );
    }
    ArticleClickListener listener;
    List<Article> listArticle;

    public ArticleAdapter(List<Article> listArticle, ArticleClickListener listener) {
        this.listArticle = listArticle;
        this.listener = listener;
    }

    @Override
    public HolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article, parent, false);
        HolderView holderView = new HolderView(itemView, parent.getContext());
        return holderView;
    }

    @Override
    public void onBindViewHolder(HolderView holder, int position) {
        ArticleBussiness buArticle = new ArticleBussiness(holder.mContext);
        final Article itemArticle = listArticle.get(position);

        // Bind data into item
        holder.articleId.setText(Integer.toString(itemArticle.getArticleId()));
        holder.articleThumbnail.setImageResource(itemArticle.getArticleThumb());
        holder.articleTitle.setText(itemArticle.getTitle());
        holder.articlePrice.setText(itemArticle.getPrice());
        holder.articleRegisterDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(itemArticle.getRegisterDate()));
//        holder.statusTagImg.setImageResource(R.drawable.acura);
        holder.statusTagText.setText(buArticle.getStatusText(itemArticle.getStatusTag()));

//        holder.madeInTagImg.setImageResource(itemArticle.getMadeInTag());
        holder.madeInTagText.setText(buArticle.getMadeInTagText(itemArticle.getMadeInTag()));

//        holder.locationTagImg.setImageResource(itemArticle.getLocationTag());
        holder.locationTagText.setText(buArticle.getLocationTagText(itemArticle.getLocationTag()));
        holder.vArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener!=null){
                    listener.onClick(itemArticle);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listArticle.size();
    }

    static class HolderView extends RecyclerView.ViewHolder {
        View vArticle;
        Context mContext;
        TextView articleId;
        ImageView articleThumbnail;
        TextView articlePrice;
        TextView articleRegisterDate;
        TextView articleTitle;
        ImageView statusTagImg;
        TextView statusTagText;
        ImageView madeInTagImg;
        TextView madeInTagText;
        ImageView locationTagImg;
        TextView locationTagText;


        public HolderView(View itemView, Context mContext) {
            super(itemView);
            this.mContext = mContext;
            vArticle = itemView.findViewById(R.id.ln_article);
            articleId = (TextView) itemView.findViewById(R.id.article_id);
            articleThumbnail = (ImageView) itemView.findViewById(R.id.article_thumbnail);
            articlePrice = (TextView) itemView.findViewById(R.id.article_price);
            articleRegisterDate = (TextView) itemView.findViewById(R.id.article_register_date);
            articleTitle = (TextView) itemView.findViewById(R.id.article_title);
            statusTagImg = (ImageView) itemView.findViewById(R.id.status_tag_img);
            statusTagText = (TextView) itemView.findViewById(R.id.status_tag_text);
            madeInTagImg = (ImageView) itemView.findViewById(R.id.made_in_tag_img);
            madeInTagText = (TextView) itemView.findViewById(R.id.made_in_tag_text);
            locationTagImg = (ImageView) itemView.findViewById(R.id.location_tag_img);
            locationTagText = (TextView) itemView.findViewById(R.id.location_tag_text);
        }
    }
}
