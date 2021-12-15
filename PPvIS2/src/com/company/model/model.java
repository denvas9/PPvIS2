package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class model {
    private List<goods_kind> goods_kinds;
    private List<users> all_users;

    public model(){
        initialize();
    }

    public void initialize(){
        goods_kinds = new ArrayList<>();
        all_users = new ArrayList<>();;

    }
}
