import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = getAge();
        System.out.print("Your age is " + age);
    }

    public static int getAge(){
        System.out.print("Enter you age: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}