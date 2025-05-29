import java.util.Scanner;
class studentdata2{
    public static void main(String[] args){
        int age;
        double height;
        char grade;
        boolean ispass;
        String name;
        Scanner s1= new Scanner(System.in); 
        System.out.println("Enter your name:");
        name=s1.nextLine();
        System.out.println("Enter your age: ");
        age=s1.nextInt();
        System.out.println("Enter your height :");
        height=s1.nextDouble();
        System.out.println("Enter your grade in character: ");
        grade=s1.next().charAt(0);
        System.out.println("Are you passed?(true or false)");
        ispass=s1.nextBoolean();
         System.out.println("Student details are:");

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My height is "+height);
        System.out.println("My grade is "+grade);
        System.out.println("Passed "+ispass);

    }
}