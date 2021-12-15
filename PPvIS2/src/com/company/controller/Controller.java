package com.company.controller;

import com.company.model.*;
public class Controller {
    private Authorization authorization;
    private Management management; //Ситуация аналогична той, что в классе Main_window. Но здесь хоть можно предположить, что эти 4 private метода для создания чего-то там всё-таки как-то с этим связаны..

    public Controller() {
        initialize();
    }
    public void initialize(){
        authorization= new Authorization();
    }

    private void create_user_authorization(){
    }
    private void create_record_controll(){
    }
    private void create_user_controll(){
    }
    private void create_service_master_controll(){
    }
}
