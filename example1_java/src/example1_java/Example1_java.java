package example1_java;
import java.util.*;

public class Example1_java {

    public static void main(String[] args) {
        Circle circ = new Circle();
        float rad, x, y;
        String color;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Write the radius: ");
        rad = s.nextFloat();
        System.out.print("Write position in X: ");
        x = s.nextFloat();
        System.out.print("Write position in Y: ");
        y = s.nextFloat();
        System.out.print("Write position in color: ");
        color = s.next();
        
        circ.init(rad, x, y, color);
        circ.showCircle();
    }
    
}