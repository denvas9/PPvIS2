package com.company;

import com.company.view.*;

public class Main {
    public static void main(String[] args) {
        initializer initer = new initializer();
        initer.initialize();

        // Далее создание окон, чтобы проверить, что они работают (т.к. дальше главного окна при нормальной работе пройти не получится)
        UserControllScreen uc = new UserControllScreen();
        GoodsKindsControllScreen gk = new GoodsKindsControllScreen();
        GoodsListControllScreen gl = new GoodsListControllScreen();
        GoodsControllScreen gc = new GoodsControllScreen();
    }
}
