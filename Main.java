package HomeWorkLessonOneTaskTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        // Блок для случая, когда надо считать площадь треугольников по неизвестным заранее входным данным
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("** Please enter the value of triangle sides :");
        //System.out.println("The side a is equal: ");
        //double x = Double.parseDouble(bufferedReader.readLine());
        //System.out.println("The side b is equal: ");
        //double y = Double.parseDouble(bufferedReader.readLine());
        //System.out.println("The side c is equal: ");
        //double z = Double.parseDouble(bufferedReader.readLine());
        //Triangle triangle = new Triangle(x, y, z);
        
        Triangle triangle = new Triangle(5, 6, 7);
        Triangle triangle = new Triangle(11, 2, 8);
        Triangle triangle = new Triangle(56, 112, 56);
        

        if (triangle.square(x, y, z) > 0) {
            System.out.println("The Square of this triangle is: " + triangle.square(x, y, z));
        } else {
            System.out.println("These triangle's side have not correct values!");
        }
    }
}
