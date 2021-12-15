package com.company.view;

import javax.swing.*;
import java.awt.*;


public class Main_window {

    //
    //т.к. не ясно, как должно выглядеть это главное окно (явный пример интерфейса для данного окна автор системы не предоставил) и какой у него функционал (кроме того, чтобы появляться по требованию view), это конечная остановка.
    //Дальше программа не идёт, т.к. не ясно куда и как
    //Было предположение, что это и есть отсутствующее окно для авторизации/регистрации из предоставленных интерфейсов, но никаких методов/связей с соответствующими контроллерами, хоть как-то подтверждающих данное предположение, на диаграмме классов не обнаружено, а поэтому принимается, что это не так
    //

    private SystemControllScreen ControllScreensInterface; // Есть предположение, что в данной переменной должен содержатся объект класса, реализующий данный интерфейс. Но какой именно из 4-х таких классов, или они каким-то образом должны чередоваться? Не ясно.

    public void starting_window()
    {


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);



        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 200, 150);
        frame.setTitle("Главное окно");

        panel.setBackground(new Color(220,201,102));


        JLabel MainWindowLabel = new JLabel("Это главное окно. The End.");
        MainWindowLabel.setLocation(20, 20);
        MainWindowLabel.setSize(200, 50);
        MainWindowLabel.setVisible(true);

        panel.add(MainWindowLabel);


        frame.setVisible(true);
        frame.setContentPane(panel);
    }

}
