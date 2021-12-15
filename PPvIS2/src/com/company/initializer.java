package com.company;

import com.company.model.*;
import com.company.view.*;
import com.company.controller.*;

public class initializer {
    private model Model;
    private view user_interface;
    private Controller controller;

    initializer(){
        Model = new model();
        user_interface = new view();
        controller = new Controller();
    }

    public void initialize(){
        Model.initialize();
        user_interface.initialize();
        controller.initialize();
    }
}
