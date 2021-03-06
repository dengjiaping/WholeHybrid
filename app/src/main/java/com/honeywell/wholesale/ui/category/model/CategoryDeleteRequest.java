package com.honeywell.wholesale.ui.category.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by xiaofei on 12/26/16.
 *
 */

public class CategoryDeleteRequest {

    @SerializedName("category_id")
    private int categoryId;

    public CategoryDeleteRequest(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getJsonString() {
        return new Gson().toJson(this);
    }

    public JSONObject getJsonObject() {
        try {
            return new JSONObject(getJsonString());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
