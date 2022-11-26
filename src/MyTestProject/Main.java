package MyTestProject;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("TicTacToe"); // создаем главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//добавляем кнопку "Х", закрывающую окно
        window.setSize(400,400);//задаем размер окна
        window.setLayout(new BorderLayout());//манагер компоновки, BorderLayout может располагать новые компоненты относительно сторон света (North(верх), West(слева), East(справа), South(низ)), Center (центр)). По умолчанию он располагает компоненты по центру
        window.setLocationRelativeTo(null);//метод, позволяет сделать окно в центре экрана (с джава версии 1.4 и выше) при запуске, иначе появится вверхнем правом углу
        window.setVisible(true);// вкл видимость экрана
        TicTacToe game=new TicTacToe();//создаем объект
        window.add(game);//добавляем наш круг в диалоговое окно


    }
}
