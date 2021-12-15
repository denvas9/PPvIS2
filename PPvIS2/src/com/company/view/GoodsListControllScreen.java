package com.company.view;

import com.company.model.*;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.*;
import java.awt.*;

public class GoodsListControllScreen implements SystemControllScreen{

    public GoodsListControllScreen(){

        // внутренний класс, который был нужен для того, чтобы список мог содержать checkbox'ы (т.к. что-то похожее есть в примере данного окна от автора)
        class CheckboxListCellRenderer extends JCheckBox implements ListCellRenderer {

            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                setComponentOrientation(list.getComponentOrientation());
                setFont(list.getFont());
                setBackground(list.getBackground());
                setForeground(list.getForeground());

                setSelected(isSelected);
                setEnabled(list.isEnabled());

                setText(value == null ? "" : value.toString());

                return this;
            }
        }

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();


        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 800, 600);
        frame.setTitle("Список товаров");

        panel.setBackground(new Color(220,201,102));


        DefaultListModel<String> Mymodel = new DefaultListModel<String>();
        JList<String> Chlist = new JList<>(Mymodel);
        Chlist.setCellRenderer(new CheckboxListCellRenderer());

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
        sclList.setLocation(50, 50);
        sclList.setSize(700, 400);

        panel.add(sclList);


        JButton OrderButton = new JButton("Заказать");
        OrderButton.setLocation(650, 470);
        OrderButton.setSize(100, 30);

        panel.add(OrderButton);

        Font myFont = new Font("TimesRoman", Font.BOLD, 22);
        JLabel GoodsList = new JLabel("Список товаров");
        GoodsList.setLocation(320, 10);
        GoodsList.setFont(myFont);
        GoodsList.setSize(520, 50);

        panel.add(GoodsList);

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


    public boolean choose_goods() {
        return false;
    }
}
