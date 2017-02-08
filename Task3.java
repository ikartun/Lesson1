package by.epam.tr.lesson1;

public class Task3{

    public static void main(String[] args) {
        int number = 1359;
        System.out.println("Product numbers of " + number + " number is " + getProductNumbers(number));
    }
    
    private static int getProductNumbers(int number) {
        int result = 1;
        for (int i = 1; i <= 4; i++)
        {
            result *= number%10;
            number = number/10;
        }
        return result;
    }
}