package com.example.mypc.layoutdemo.model;

import java.io.Serializable;

/**
 * Created by leminhquan on 24/05/2017.
 */

public class Property implements Serializable {
    String propertyName;
    String propertyValue;

    public Property(String propertyName, String propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}
