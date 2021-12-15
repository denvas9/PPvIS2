package com.company.view;


public class view {
    private Main_window UI;
    public view(){
        UI=new Main_window();
    }
    public void initialize(){
        showMainWindow();
    }
    public void showMainWindow(){
        UI.starting_window();
    }
}
