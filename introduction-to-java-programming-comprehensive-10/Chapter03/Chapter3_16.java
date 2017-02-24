//        (Random point) Write a program that displays a random coordinate in a rectangle.
//        The rectangle is centered at (0, 0) with width 100 and height 200.

public class Main {

    public static void main(String[] args) {

        int randomX = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
        int randomY = -100 + (int) (Math.random() * ((100 - (-100)) + 1));

        System.out.println("A random coordinate in a rectangle is (" + randomX + "," + randomY +").");

    }
}
