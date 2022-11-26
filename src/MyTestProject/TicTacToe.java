package MyTestProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent {

    public static final int FIELD_EMPTY = 0;//пустое поле
    public static final int FIELD_X = 10;//поле с крестиком
    public static final int FIELD_O = 999;//поле с ноликом
    int[][] field;
    boolean turn;

    public TicTacToe() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);//добавили плучение событий от мыши
        field = new int[3][3]; //создаем объект при создании массива
        initGame();
    }

    public void initGame() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                field[i][j] = FIELD_EMPTY;
            }
        }
        turn = true;
    }


    protected void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == mouseEvent.BUTTON1) {// проверка нажатия левой кнопкой мыши
            int x = mouseEvent.getX();//присваиваем координаты х клика
            int y = mouseEvent.getY();//присваиваем координаты y клика
            //переводим координаты в индексы ячейки в массиве
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            //проверяем что выбранная ячейка пуста
            if (field[i][j] == FIELD_EMPTY) {
                //проверяем чей сейчас ход, если Х ставим крестик, если 0 - нолик
                field[i][j] = turn ? FIELD_X : FIELD_O;
                turn = !turn;//меняем очередность хода
                repaint();// перерисовка компонента, это вызовет метод printComponent() и рисует крестик/нолик там, где его не было раньше
                int result = checkState();
                if(result!=0){
                    if(result==FIELD_O*3){
                        JOptionPane.showMessageDialog(this,"Нолики выиграли!","Победа!!!",JOptionPane.INFORMATION_MESSAGE);
                    }else if(result==FIELD_X*3){
                        JOptionPane.showMessageDialog(this,"Крестики выиграли!","Победа!!!",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,"Хорошее сражение!","Ничья!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    initGame();
                    repaint();
                }
            }
        }
    }


    protected void paintComponent(Graphics graphics) { //оверрайдим метод
        super.paintComponent(graphics);
        //очищаем поле
        graphics.clearRect(0, 0, getWidth(), getHeight());
        //рисуем сетку
        drawGrid(graphics);
        //рисуем крестики нолики
        drawXO(graphics);

    }


    void drawX(int i, int j, Graphics graphics) {
        graphics.setColor(Color.BLUE);
        int cellWidth = getWidth() / 3;
        int cellHeight = getHeight() / 3;
        int x = cellWidth * i;
        int y = cellHeight * j;
        //линия от верхнего левого угла в правый нижний
        graphics.drawLine(x, y, x + cellWidth, y + cellHeight);
        //нижний левый правый верхний
        graphics.drawLine(x, y + cellHeight, x + cellWidth, y);
    }


    void drawO(int i, int j, Graphics graphics) {
        graphics.setColor(Color.RED);
        int cellWidth = getWidth() / 3;
        int cellHeight = getHeight() / 3;
        int x = cellWidth * i;
        int y = cellHeight * j;
        //линия от верхнего левого угла в правый нижний
        graphics.drawOval(x + 5 * cellWidth / 100, y, cellWidth * 9 / 10, cellHeight);
    }


    public void drawGrid(Graphics graphics) {
        int width = getWidth();//метод дает ширину поля
        int height = getHeight();// высота поля
        int cellWidth = width / 3;//ширина одной ячейки
        int cellHeight = height / 3;// высота одной ячейки
        graphics.setColor(Color.BLACK);
        for (int i = 1; i < 3; i++) {
            graphics.drawLine(0, cellHeight * i, width, cellHeight * i);
            graphics.drawLine(cellWidth * i, 0, cellWidth * i, height);
        }

    }


    void drawXO(Graphics graphics) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (field[i][j] == FIELD_X) {
                    drawX(i, j, graphics);
                } else if (field[i][j] == FIELD_O) {
                    drawO(i, j, graphics);
                }
            }
        }

    }

    void drawWinLine(Graphics graphics,int i,int j){
        graphics.setColor(Color.GREEN);
        int cellWidth = getWidth() / 3;
        int cellHeight = getHeight() / 3;
        int x = getWidth() * i;
        int y = getHeight() * j;
        //линия от верхнего левого угла в правый нижний
        graphics.drawLine(x, y, x + getWidth(), y + getHeight());
        //нижний левый правый верхний
        graphics.drawLine(x, y + getHeight(), x + getWidth(), y);

    }

    void dW(Graphics graphics){
        int diagon = 0;
        int diagon2 = 0;
        for (int i = 0; i < 3; i++) {
            diagon += field[i][i];
            diagon2 += field[i][2 - i];
            if(diagon==FIELD_O*3||diagon==FIELD_X*3){
                drawWinLine(graphics,i,i);
            }
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == FIELD_X) {
                    drawWinLine(graphics,i,j);
                } else if (field[i][j] == FIELD_O) {
                    drawO(i, j, graphics);
                }
            }
        }
    }

    int checkState() {
        int diag = 0;
        int diag2 = 0;
        for (int i = 0; i < 3; i++) {
            //сумма значений по диагонали от левого верхнего угла
            diag += field[i][i];
            //сумма значений по диагонали от правого верхнего угла
            diag2 += field[i][2 - i];
        }
        //Если по диагонали стоят одни крестики или одни нолики выходим из метода
        if (diag == FIELD_O * 3 || diag == FIELD_X * 3) {
            return diag;
        }else
        //то же для второй диагонали
        if (diag2 == FIELD_O * 3 || diag2 == FIELD_X * 3) {
            return diag2;
        }
        int check_i, check_j;
        boolean empty = false;
        //проходим по всем рядам
        for (int i = 0; i < 3; i++) {
            check_i = 0;
            check_j = 0;
            for (int j = 0; j < 3; j++) {
                //суммируем знаки в текущем ряду
                if (field[i][j] == 0) {
                    empty = true;
                }
                check_i += field[i][j];
                check_j += field[j][i];
            }
            //если выигрыш крестика или нолика, выходим
            if (check_i == FIELD_O * 3 || check_i == FIELD_X * 3) {

                return check_i;
            }
            if (check_j == FIELD_O * 3 || check_j == FIELD_X * 3) {
                return check_j;
            }
        }
        if (empty) return 0; else return -1;

    }

}
