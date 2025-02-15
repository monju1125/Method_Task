/*
Student Name : Md Monjurul Karim
Assignment 3
Part 1: Problem Statement
For this assignment, don't worry about passing parameters to methods. We are just focusing on the basics for now
1. Create a method called rectangleArea(). Have it print the result of 5 x 10
2. Create another method called triangleArea(). Have it print the result of (3 x 6) / 2.
3. Create a third method called printAreaResults(). Inside of this method, invoke the previous two methods.
4. In your main() method, invoke printAreaResults().
*/
public class Assignment3_Part1 {
    public static void main(String[] args) {
       printAreaResults();
    }
    public static void rectangleArea() {
        float rectangle_area = 5 * 10;
        System.out.println("\nArea of rectangle is " + rectangle_area);
    }
    public static void triangleArea() {
        float triangle_area = (3 * 6) / 2;
        System.out.println("\nArea of triangle is " + triangle_area);
    }
    public static void printAreaResults() {
        rectangleArea();
        triangleArea();
    }
}
