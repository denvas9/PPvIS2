package com.company.model;

public class goods {
    private String admin_data;
    private String goods_data;
    private String client_data;
    private String goods_type;
    private boolean goods_availability;

    public String getClient_data() {
        return this.client_data;
    }

    public String getGoods_data() {
        return this.goods_data;
    }

    public goods GetGoods()
    {
        return new goods();
    }

    public boolean getGoods_availability() {
        return this.goods_availability;
    }


    public void initialize()
    {

    }

}
