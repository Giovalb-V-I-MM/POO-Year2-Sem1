import org.w3c.dom.css.Rect;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int movX = 5;
        int movY = 5;

        double area;
        double perimeter;

        Rectangle box0 = new Rectangle(x, y, width, height);
        System.out.println(box0);
        box0.setLocation(movX, movY);

        Rectangle box1 = new Rectangle(15, movY, width, height);
        Rectangle box2 = new Rectangle(25, movY, width, height);
        Rectangle box3 = new Rectangle(35, movY, width, height);

        int widthFinal = (int) (box0.getWidth() + (int) box1.getWidth() + (int) box2.getWidth() + (int) box3.getWidth());
        Rectangle boxFinal = new Rectangle(movX, movY, widthFinal, height);
        area = widthFinal*height;
        perimeter = (height*2)+(widthFinal*2);

        System.out.println(boxFinal);
        System.out.println (area);
        System.out.println (perimeter);

    }
}