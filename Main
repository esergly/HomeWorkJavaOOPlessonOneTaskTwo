package HomeWorkLessonOneTaskTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("** Please enter the value of triangle sides :");
        System.out.println("The side a is equal: ");
        double x = Double.parseDouble(bufferedReader.readLine());
        System.out.println("The side b is equal: ");
        double y = Double.parseDouble(bufferedReader.readLine());
        System.out.println("The side c is equal: ");
        double z = Double.parseDouble(bufferedReader.readLine());

        Triangle triangle = new Triangle(x, y, z);

        if (triangle.Square(x, y, z) > 0) {
            System.out.println("The Square of this triangle is: " + triangle.Square(x, y, z));
        } else {
            System.out.println("These triangle's side have not correct values!");
        }
    }
}
