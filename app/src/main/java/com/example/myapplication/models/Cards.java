package com.example.myapplication.models;

public class Cards {
    private String set_name;
    private String set_code;
    private int num_of_cards;
    private String tcg_date;

    public String getSet_name() {
        return set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public String getSet_code() {
        return set_code;
    }

    public void setSet_code(String set_code) {
        this.set_code = set_code;
    }

    public int getNum_of_cards() {
        return num_of_cards;
    }

    public void setNum_of_cards(int num_of_cards) {
        this.num_of_cards = num_of_cards;
    }

    public String getTcg_date() {
        return tcg_date;
    }

    public void setTcg_date(String tcg_date) {
        this.tcg_date = tcg_date;
    }


}
