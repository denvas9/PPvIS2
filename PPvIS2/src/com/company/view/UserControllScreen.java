package com.company.view;

import com.company.model.*;

import javax.swing.*;
import java.awt.*;

public class UserControllScreen implements SystemControllScreen{

    public UserControllScreen(){
        JFrame frame = new JFrame();


        JPanel panel = new JPanel();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 800, 600);
        frame.setTitle("Управление пользователями");

        panel.setBackground(new Color(220,201,102));

        JButton Butt2 = new JButton("К2");
        Butt2.setLocation(10, 10);
        Butt2.setSize(50, 50);

        Font myFont = new Font("TimesRoman", Font.BOLD, 22);

        JLabel ChangeLabel2 = new JLabel("Управление пользователями");
        ChangeLabel2.setLocation(70, 10);
        ChangeLabel2.setFont(myFont);
        ChangeLabel2.setSize(320, 50);

        JButton Butt1 = new JButton("К1");
        Butt1.setLocation(400, 10);
        Butt1.setSize(50, 50);

        JLabel ChangeLabel1 = new JLabel("Изменить");
        ChangeLabel1.setLocation(460, 10);
        ChangeLabel1.setFont(myFont);
        ChangeLabel1.setSize(320, 50);

        Object [] [] data = {{"user 1"},{"user 2"},{"user 3"},{"user 4"}};
        Object [] headers = {"пользователи"};

        JButton SearchButt = new JButton("поиск");
        SearchButt.setLocation(20, 80);
        SearchButt.setSize(100, 30);

        JTable table = new JTable(data, headers);
        table.setRowHeight(20);
        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(false);
        JScrollPane pane = new JScrollPane(table);

        pane.setLocation(130, 70);
        pane.setSize(600, 450);

        panel.add(Butt1);
        panel.add(Butt2);
        panel.setLayout(null);
        panel.add(pane);
        panel.add(ChangeLabel2);
        panel.add(ChangeLabel1);
        panel.add(SearchButt);

        frame.setVisible(true);
        frame.setContentPane(panel);

    }


    @Override
    public boolean add_info() {
        return false;
    }

    @Override
    public void open_info() {

    }

    @Override
    public boolean edit_info() {
        return false;
    }

    @Override
    public boolean delete_info() {
        return false;
    }

    public users open_users(){
        return new users();
    }
    public user edit_user(){
        return new user();
    }
}
