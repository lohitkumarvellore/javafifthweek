import java.util.Scanner;
public class Increment {
    static int age;
    public Increment(){
        IncrementAge();
    }
    public static void IncrementAge(){
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        new Increment();
    }

}
