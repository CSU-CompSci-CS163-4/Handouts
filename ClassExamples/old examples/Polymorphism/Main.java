package Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean has_id(HasColor  obj) {
        Scanner scn =  new Scanner(obj.getColor()).useDelimiter(",");
        return scn.nextInt() < 64;
    }

    // static method, that takes in two TYPE 
    // they compares widths - if first < second -1, 0, 1
    public static int checkWidth(HasWidthHeight one, HasWidthHeight two) {
        if(one.getWidth() < two.getWidth()) return -1;
        if(one.getWidth() > two.getWidth()) return 1;
        return 0;

    }

    public static void main(String[] args) {
        List<AbstractShape> shapes = new ArrayList<>();

        AbstractShape tester = new Rectangle(10, 2);

        shapes.add(new Rectangle(12, 10));
        shapes.add(new Circle(10, "56,23,22"));
        shapes.add(new Circle(12, "122,255,255"));
        shapes.add(new Triangle(1, 10, "54,23,22"));
        shapes.add(new Triangle(10, 10, "122,23,22"));
        
        for(AbstractShape shape : shapes) {
            if(shape instanceof HasWidthHeight) {
                System.out.println(checkWidth((HasWidthHeight)tester, (HasWidthHeight)shape));
            }
            if(shape instanceof HasColor) System.out.println(has_id((HasColor)shape));
        }
        

        System.out.println(shapes);
        

    }
    
}
