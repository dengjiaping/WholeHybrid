package com.honeywell.wholesale.ui.newreport.network;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by xiaofei on 9/20/16.
 *
 */
public class AnnualReportResponse<T> {

    @SerializedName("stat_year")
    private ArrayList<T> incomeList;

    @SerializedName("receivable")
    private String receivable;

    public ArrayList<T> getIncomeList() {
        return incomeList;
    }

    public String getReceivable() {
        return receivable;
    }
}
