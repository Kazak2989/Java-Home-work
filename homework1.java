// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Задача на сумму чисел от 1 до n.

// import java.util.Scanner;
// class homework1{
//     	public static void main (String[] args)
// 	{
// 		Scanner user_input = new Scanner(System.in, "Cp1251");
//         String n1;
//         System.out.println("Введите число  n");
//         n1 = user_input.next();
//         int n = Integer.parseInt(n1);
//         int factorial =1;
//         int sum =0;
// 		for (int i = 1; i <= n; i++) {
//             factorial = factorial * i;
//         }
// 		for (int j = 0; j <= n; j++) {
//             sum = sum + j;
//         }
//         System.out.printf("the n! of %d is %d%n", n, factorial);
//         System.out.printf("the sum of %d is %d%n", n, sum);
// 	}
// }

// Вывести все простые числа от 1 до 1000

// class homework1 {
//     public static void main(String[] args)
//     {
//         int N = 1000;
 
//         prime_N(N);
//     }
//     static void prime_N(int N)
//     {
//         int x, y, flg;
 
//         // Printing display message
//         System.out.println(
//             "Все простые числа от 1 до  " + N
//             + ":");
 
//         // Using for loop for traversing all
//         // the numbers from 1 to N
//         for (x = 1; x <= N; x++) {
 
//             // Omit 0 and 1 as they are
//             // neither prime nor composite
//             if (x == 1 || x == 0)
//                 continue;
 
//             flg = 1;
 
//             for (y = 2; y <= x / 2; ++y) {
//                 if (x % y == 0) {
//                     flg = 0;
//                     break;
//                 }
//             }
//             if (flg == 1)
//                 System.out.print(x + " ");
//         }
//     }
// }
// // Реализовать простой калькулятор
// import java.util.Scanner;

// class homework1 {
//   public static void main(String[] args) {

//     char operator;
//     Double number1, number2, result;

//     // create an object of Scanner class
//     Scanner input = new Scanner(System.in);

//     // ask users to enter operator
//     System.out.println("Choose an operator: +, -, *, or /");
//     operator = input.next().charAt(0);

//     // ask users to enter numbers
//     System.out.println("Enter first number");
//     number1 = input.nextDouble();

//     System.out.println("Enter second number");
//     number2 = input.nextDouble();

//     switch (operator) {

//       // performs addition between numbers
//       case '+':
//         result = number1 + number2;
//         System.out.println(number1 + " + " + number2 + " = " + result);
//         break;

//       // performs subtraction between numbers
//       case '-':
//         result = number1 - number2;
//         System.out.println(number1 + " - " + number2 + " = " + result);
//         break;

//       // performs multiplication between numbers
//       case '*':
//         result = number1 * number2;
//         System.out.println(number1 + " * " + number2 + " = " + result);
//         break;

//       // performs division between numbers
//       case '/':
//         result = number1 / number2;
//         System.out.println(number1 + " / " + number2 + " = " + result);
//         break;

//       default:
//         System.out.println("Invalid operator!");
//         break;
//     }

//     input.close();
//   }
// }