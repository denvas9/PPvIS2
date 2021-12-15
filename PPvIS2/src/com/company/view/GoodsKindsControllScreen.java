package com.company.view;

import com.company.model.*;

import javax.swing.*;
import java.awt.*;

public class GoodsKindsControllScreen implements SystemControllScreen{

    public GoodsKindsControllScreen(){

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 800, 600);
        frame.setTitle("Выбрать вид товара");

        panel.setBackground(new Color(220,201,102));

        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<String>();
        JComboBox<String> CombBox = new JComboBox<String>(cbModel);

        CombBox.setLocation(50, 90);
        CombBox.setSize(150, 30);


        Font myFont = new Font("TimesRoman", Font.BOLD, 22);
        JLabel GoodsKinds = new JLabel("Выбрать вид товара");
        GoodsKinds.setLocation(80, 30);
        GoodsKinds.setFont(myFont);
        GoodsKinds.setSize(520, 50);

        JButton ChangeButton = new JButton("К1");
        ChangeButton.setLocation(20, 30);
        ChangeButton.setSize(50, 50);



        panel.setLayout(null);
        panel.add(CombBox);
        panel.add(GoodsKinds);
        panel.add(ChangeButton);

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


    public boolean choose_goods_kind() {
        return false;
    }
}
