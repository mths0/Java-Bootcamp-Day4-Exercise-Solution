import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Exercise (Loop)

        //! Note: Am using {} to isolate each question because of naming conflict

        Scanner scanner = new Scanner(System.in);

//        1.Write a program that prints the numbers from 1 to 100 such that:
//                  If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//                  If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//                  If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.


        {
            System.out.println("\nQuestion 1");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
        }


//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT
        {
            System.out.println("\nQuestion 2");
            System.out.print("Enter a string to Reverse: ");
            String sentence = scanner.nextLine();

            for (int i = sentence.length() - 1; i >= 0; i--) {
                System.out.print(sentence.charAt(i));
            }
        }


//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.
        {
            System.out.println("\n\nQuestion 3");
            System.out.print("Enter a number to find a factorial: ");
            int userNumber = scanner.nextInt();
            int result = 1;

            for (int i = userNumber; i >= 1; i--) {
                result *= i;
            }
            System.out.println("factorial of " + userNumber + " = " + result);
        }


//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)
        {
            System.out.println("\nQuestion 4");
            System.out.print("Enter the base number: ");
            int base = scanner.nextInt();

            System.out.print("Enter the power number: ");
            int power = scanner.nextInt();
            int result = base;

            for (int i = power; i > 1; i--) {
                result *= base;
            }
            System.out.println(base + " ** " + power + " = " + result);
        }

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.
        {
            System.out.println("\nQuestion 5");

            int userNumber = -2;
            int sumOfOddNumbers = 0;
            int sumOfEvenNumbers = 0;

            while (userNumber != -1) {
                System.out.print("Please enter a number or -1 to end: ");
                userNumber = scanner.nextInt();
                if (userNumber > 0) {
                    if (userNumber % 2 == 0) {
                        sumOfEvenNumbers += userNumber;
                    } else if (userNumber % 2 != 0) {
                        sumOfOddNumbers += userNumber;
                    }
                }
            }
            System.out.println("Total of even number = " + sumOfEvenNumbers);
            System.out.println("Total of odd number = " + sumOfOddNumbers);

        }
//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.
        {
            System.out.println("\nQuestion 6");

            System.out.print("Enter a positive to check if it is a prime number: ");
            int userInput = scanner.nextInt();
            boolean isPrime = true;
            if (userInput > 1) {
                for (int i = 2; i < userInput; i++) {
                    if (userInput % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(userInput + " is a Prime number.");
                } else {
                    System.out.println(userInput + " is not a Prime number.");
                }
            } else if (userInput == 1) { // 1 is not a prime number Reference:https://www.mathnasium.com/math-terms/prime-number
                System.out.println(userInput + " is not a Prime number.");
            } else {
                System.out.println("Invalid input, input must be positive. ");
            }
        }


//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//              Week 1
//              Day1
//              Day2
//              Day3
//              Day4
//              Day5
//              Day6
//              Day7
//              Week 2
//              Day1
//              Day2
//              ...
        {
            System.out.println("\nQuestion 7");
            for (int week = 1; week <= 4; week++) {
                System.out.println("Week " + week);

                for (int day = 1; day <= 7; day++) {
                    System.out.println("Day " + day);
                }
            }
        }

        scanner.nextLine();
//        8.Write a program thats check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.
        {
            System.out.println("\nQuestion 8");
            System.out.print("Enter a word to check if it is a palindrome: ");
            String word = scanner.nextLine();

            boolean isPalindrome = true;
            int leftCharIndex = 0;
            for (int rightCharIndex = word.length() - 1; rightCharIndex >= 0; rightCharIndex--) {
                if (word.charAt(leftCharIndex) != word.charAt(rightCharIndex)) {
                    isPalindrome = false;
                    break;
                }
                leftCharIndex++;
            }

            if (isPalindrome) {
                System.out.println(word + " is Palindrome word");
            } else {
                System.out.println(word + " is not Palindrome word");
            }
        }

    }
}