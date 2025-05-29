import java.util.Scanner;

class arithmeticoperator{
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in); 
        int a=21;
        int b=10;
        System.out.println("Enter the value of a:");
        a=s1.nextInt();
        System.out.println("Enter the value of b: ");
        b=s1.nextInt();
        System.out.println("Addition= "+(a+b));
        System.out.println("Substraction= "+(a-b));
        System.out.println("Division= "+(a/b));
        System.out.println("Multiplication= "+(a*b));
        System.out.println("Modulo= "+(a%b));

    }

}