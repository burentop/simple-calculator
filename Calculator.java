import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me two numbers and I will perform some simple math on them.");
    System.out.println("Enter the first number: ");
    Integer numberOne = Integer.parseInt(myConsole.readLine());
    System.out.println("And now the second: ");
    Integer numberTwo = Integer.parseInt(myConsole.readLine());

    Integer numbersAdded = numberOne + numberTwo;
    Integer numbersSubtracted = numberOne - numberTwo;
    Integer numbersMultiplied = numberOne * numberTwo;
    Integer numbersDivided = numberOne / numberTwo;

    String stringNumberOne = Integer.toString(numberOne);
    String stringNumberTwo = Integer.toString(numberTwo);
    String stringAdded = Integer.toString(numbersAdded);
    String stringSubtracted = Integer.toString(numbersSubtracted);
    String stringMultiplied = Integer.toString(numbersMultiplied);
    String stringDivided = Integer.toString(numbersDivided);

    System.out.println(stringNumberOne + " + " + stringNumberTwo + " = " + stringAdded);
    System.out.println(stringNumberOne + " - " + stringNumberTwo + " = " + stringSubtracted);
    System.out.println(stringNumberOne + " * " + stringNumberTwo + " = " + stringMultiplied);
    System.out.println(stringNumberOne + " / " + stringNumberTwo + " = " + stringDivided);
  }
}
