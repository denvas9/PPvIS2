package com.company.view;

import com.company.model.*;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class GoodsControllScreen implements SystemControllScreen {
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


    public goods open_goods(){
        return new goods();
    }
    public boolean add_goods(goods goods){
        return false;
    }
    public boolean delete_goods(goods goods){
        return false;
    }
    public boolean edit_goods(goods goods){
        return false;
    }
    public List<goods> sort_goods(goods_kind goods_kind)
    {
        return new ArrayList<goods>();
    }

    public GoodsControllScreen()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();


        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 800, 600);
        frame.setTitle("Список товаров");

        panel.setBackground(new Color(220,201,102));


        JButton Butt1 = new JButton("К1");
        Butt1.setLocation(20, 10);
        Butt1.setSize(50, 50);

        JButton Butt2 = new JButton("К2");
        Butt2.setLocation(80, 10);
        Butt2.setSize(50, 50);

        DefaultListModel<String> Mymodel = new DefaultListModel<String>();
        JList<String> Chlist = new JList<>(Mymodel);

        Mymodel.addElement("tovar 1");
        Mymodel.addElement("tovar 2");
        Mymodel.addElement("tovar 3");
/*
        DefaultListModel<JCheckBox> model = new DefaultListModel<JCheckBox>();
        JCheckBoxList checkBoxList = new JCheckBoxList(model);

        model.addElement(new JCheckBox("tovar 1"));
        model.addElement(new JCheckBox("tovar 2"));
        model.addElement(new JCheckBox("tovar 3"));
*/

        JScrollPane sclList = new JScrollPane(Chlist);
        sclList.setLocation(150, 60);
        sclList.setSize(600, 500);

        JButton AddButton = new JButton("Добавить");
        AddButton.setLocation(20, 70);
        AddButton.setSize(100, 30);

        JButton DeleteButton = new JButton("Удалить");
        DeleteButton.setLocation(20, 110);
        DeleteButton.setSize(100, 30);

        JButton ChangeButton = new JButton("Изменить");
        ChangeButton.setLocation(20, 150);
        ChangeButton.setSize(100, 30);

        JButton SortButton = new JButton("Сортировка");
        SortButton.setLocation(15, 200);
        SortButton.setSize(110, 30);

        Font myFont = new Font("TimesRoman", Font.BOLD, 22);
        JLabel GoodsContr = new JLabel("Управление товарами");
        GoodsContr.setLocation(320, 5);
        GoodsContr.setFont(myFont);
        GoodsContr.setSize(520, 50);

        panel.add(sclList);

        panel.add(Butt1);
        panel.add(Butt2);
        panel.add(AddButton);
        panel.add(DeleteButton);
        panel.add(ChangeButton);
        panel.add(SortButton);

        panel.add(GoodsContr);

        frame.setVisible(true);
        frame.setContentPane(panel);
    }


}
