
package Assignment;
import java.util.*;


public class JavaAssignments {
    public static void main(String[] args) {

        // 2. Display Greetings in three lines
        System.out.println("Hello!");
        System.out.println("Good Morning!");
        System.out.println("Welcome!");

        // 3. Display Introduction
        System.out.println("Name: Shashangka Upadhyaya");
        System.out.println("From: Nepal");
        System.out.println("Studying: MS in Computer Science");

        Scanner sc = new Scanner(System.in);

        // 4. Sum and average of two numbers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Average: " + ((a + b) / 2.0));

        // 5. Simple Interest
        System.out.print("Enter P, T, R: ");
        double P = sc.nextDouble(), T = sc.nextDouble(), R = sc.nextDouble();
        System.out.println("Simple Interest: " + (P * T * R / 100));

        // 6. Area calculations
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * r * r));

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble(), br = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (l * br));

        System.out.print("Enter base and height: ");
        double base = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * h));

        // 7. Perimeter calculations
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * r));
        System.out.println("Perimeter of Rectangle: " + (2 * (l + br)));
        System.out.print("Enter 3 sides of triangle: ");
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
        System.out.println("Perimeter of Triangle: " + (s1 + s2 + s3));

        // 8. Volume of cylinder
        System.out.print("Enter radius and length of cylinder: ");
        double rc = sc.nextDouble(), len = sc.nextDouble();
        System.out.println("Volume: " + (Math.PI * rc * rc * len));

        // 9. Fahrenheit <-> Celsius
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + ((f - 32) * 5 / 9));

        System.out.print("Enter Celsius: ");
        double cel = sc.nextDouble();
        System.out.println("Fahrenheit: " + ((cel * 9 / 5) + 32));

        // 10. Pounds to Kg
        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kg: " + (pounds * 0.454));

        // 11a. Swap using temp
        int x = 10, y = 20, temp;
        temp = x; x = y; y = temp;
        System.out.println("Swap using temp: x=" + x + ", y=" + y);

        // 11b. Swap without temp
        x = 10; y = 20;
        x = x + y; y = x - y; x = x - y;
        System.out.println("Swap without temp: x=" + x + ", y=" + y);

        // 12. Accept name, age, nationality
        System.out.print("Enter Name, Age, Nationality: ");
        sc.nextLine(); // flush
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String nationality = sc.nextLine();
        System.out.printf("Name: %s\nAge: %d\nNationality: %s\n", name, age, nationality);

        // 13. Print if negative
        System.out.print("Enter a number: ");
        int neg = sc.nextInt();
        if (neg < 0) System.out.println("Negative: " + neg);

        // 14. Compare two numbers
        System.out.print("Enter two integers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 == num2) System.out.println("Equal");
        else if (num1 > num2) System.out.println("Greater");
        else System.out.println("Lesser");

        // 15. ASCII to character
        System.out.print("Enter ASCII (0-128): ");
        int ascii = sc.nextInt();
        System.out.println("Character: " + (char)ascii);

        // 16. Even or Odd
        System.out.print("Enter number: ");
        int eo = sc.nextInt();
        System.out.println((eo % 2 == 0) ? "Even" : "Odd");

        // 17. Leap year
        System.out.print("Enter year: ");
        int yr = sc.nextInt();
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        // 18. Largest of 3
        System.out.print("Enter 3 numbers: ");
        int l1 = sc.nextInt(), l2 = sc.nextInt(), l3 = sc.nextInt();
        int max = Math.max(l1, Math.max(l2, l3));
        System.out.println("Largest: " + max);

        // 19. Triangle type
        if (s1 == s2 && s2 == s3)
            System.out.println("Equilateral Triangle");
        else if (s1 == s2 || s2 == s3 || s1 == s3)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");

        // 20. 4-function calculator
        System.out.print("Enter two numbers and operator (+,-,*,/): ");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println("Result: " + (n1 + n2)); break;
            case '-': System.out.println("Result: " + (n1 - n2)); break;
            case '*': System.out.println("Result: " + (n1 * n2)); break;
            case '/':
                if (n2 != 0)
                    System.out.println("Result: " + (n1 / n2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operator");
        }

        // More questions (21 to 44) will be continued in next part due to space...
    }
}
