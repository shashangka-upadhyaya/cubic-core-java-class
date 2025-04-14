package Assignment;
import java.util.*;


public class JavaAssignmentsContinue {

    public static void main(String[] args) {


        // ... previous code (questions 1-20)
        Scanner sc = new Scanner(System.in);

        // 21. Day of the week
        System.out.print("Enter number (1-7): ");
        int day = sc.nextInt();
        String[] days = {"Invalid", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(day >= 1 && day <= 7 ? days[day] : "Invalid input");

        // 22. Multiplication table
        System.out.print("Enter number for table: ");
        int t = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(t + " x " + i + " = " + (t * i));

        // 23. Sum of 1 to n
        System.out.print("Enter n: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);

        // 24. Factorial
        System.out.print("Enter number for factorial: ");
        int fact = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= fact; i++) res *= i;
        System.out.println("Factorial: " + res);

        // 25. Highest score
        System.out.print("Enter number of students: ");
        int stuCount = sc.nextInt();
        sc.nextLine();
        String topName = "";
        int topScore = -1;
        for (int i = 0; i < stuCount; i++) {
            System.out.print("Enter name: ");
            String sName = sc.nextLine();
            System.out.print("Enter score: ");
            int sScore = sc.nextInt();
            sc.nextLine();
            if (sScore > topScore) {
                topScore = sScore;
                topName = sName;
            }
        }
        System.out.println("Topper: " + topName + ", Score: " + topScore);

        // 26. Reverse number
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt(), rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + rev);

        // 27. Sum and product of digits
        System.out.print("Enter number: ");
        int dig = sc.nextInt(), digitSum = 0, digitProduct = 1;
        int tempDig = dig;
        while (tempDig != 0) {
            int d = tempDig % 10;
            digitSum += d;
            digitProduct *= d;
            tempDig /= 10;
        }
        System.out.println("Sum: " + digitSum + ", Product: " + digitProduct);

        // 28-30. Prime-related functions
        System.out.print("Enter number to check prime: ");
        int primeNum = sc.nextInt();
        System.out.println(isPrime(primeNum) ? "Prime" : "Not Prime");

        System.out.print("Enter n for first n primes: ");
        int nPrime = sc.nextInt(), count = 0, p = 2;
        while (count < nPrime) {
            if (isPrime(p)) {
                System.out.print(p + " ");
                count++;
            }
            p++;
        }
        System.out.println();

        System.out.print("Enter start and end for primes: ");
        int ps = sc.nextInt(), pe = sc.nextInt();
        for (int i = ps; i <= pe; i++)
            if (isPrime(i)) System.out.print(i + " ");
        System.out.println();

        // 31. Fibonacci
        System.out.print("Enter terms: ");
        int fib = sc.nextInt(), a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < fib; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        // 32. Pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }

        // 33. Sum of array
        int[] arr = new int[5];
        int arraySum = 0;
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            arraySum += arr[i];
        }
        System.out.println("Sum: " + arraySum);

        // 34. Ascending order
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // 35. Reverse array
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        // 36. Second largest
        System.out.println("Second Largest: " + arr[arr.length - 2]);

        // 37. Duplicate elements
        Set<Integer> set = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int i : arr) {
            if (!set.add(i)) System.out.print(i + " ");
        }
        System.out.println();

        // 38. Palindrome string
        sc.nextLine();
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String revStr = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(revStr) ? "Palindrome" : "Not Palindrome");

        // 39. Short name
        System.out.print("Enter full name: ");
        String[] full = sc.nextLine().split(" ");
        for (int i = 0; i < full.length - 1; i++)
            System.out.print(full[i].charAt(0) + ". ");
        System.out.println(full[full.length - 1]);

        // 40. Reverse string
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Reversed: " + new StringBuilder(s).reverse());

        // 41. Duplicate letter in word
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        Set<Character> dset = new HashSet<>();
        Set<Character> repeated = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (!dset.add(ch)) repeated.add(ch);
        }
        System.out.println("Duplicate letters: " + repeated);

        // 42. Duplicate words in string
        System.out.print("Enter sentence: ");
        String[] words = sc.nextLine().split(" ");
        Set<String> wordSet = new HashSet<>();
        System.out.print("Duplicates: ");
        for (String w : words) {
            if (!wordSet.add(w)) System.out.print(w + " ");
        }
        System.out.println();

        // 43. Exception handling
        try {
            int[] arr2 = new int[3];
            arr2[5] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }
        try {
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        // 44. File storage & search skipped due to console limitation
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}