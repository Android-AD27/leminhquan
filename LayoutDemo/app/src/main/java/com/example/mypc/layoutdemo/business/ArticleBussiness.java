package com.example.mypc.layoutdemo.business;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.example.mypc.layoutdemo.R;

/**
 * Created by leminhquan on 23/05/2017.
 */

public class ArticleBussiness {
    Context mContext;

    public ArticleBussiness(Context mContext) {
        this.mContext = mContext;
    }

    public String getStatusText(int statusTag) {
        String status;
        switch (statusTag) {
            case 0:
                status = mContext.getResources().getString(R.string.old);
                break;
            case 1:
                status = mContext.getResources().getString(R.string.new_str);
                break;
            default:
                status = mContext.getResources().getString(R.string.old);
                break;
        }

        return status;
    }

    public String getMadeInTagText(int madeinTag) {
        String madein;
        switch (madeinTag) {
            case 0:
                madein = mContext.getResources().getString(R.string.domestic);
                break;
            case 1:
                madein = mContext.getResources().getString(R.string.international);
                break;
            default:
                madein = mContext.getResources().getString(R.string.domestic);
                break;
        }

        return madein;
    }

    public String getLocationTagText(int locationTag) {
        String location;
        switch (locationTag) {
            case 0:
                location = "HN";
                break;
            case 1:
                location = "Tp. HCM";
                break;
            default:
                location = "Toan quoc";
                break;
        }
        return location;
    }
}
