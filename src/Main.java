import java.util.Scanner;
public class Main {

    public static String input = "";
    public static String [] parameters;
    public static String output1 = "";
    public static String output2 = "";
    public static String output3 = "";
    public static String number1;
    public static String number2;
    public static String number3;
    //public static String number4;
    //public static String number5;


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        input = scanner.nextLine();
        parameters = input.split("");

        if (parameters.length == 1) {
            number1 = parameters[0];
            convertNumber1();
        } else if (parameters.length == 2) {
            number2 = parameters[0];
            number1 = parameters[1];
            convertNumber2();
            convertNumber1();
        } else if (parameters.length == 3) {
            number3 = parameters[0];
            number2 = parameters[1];
            number1 = parameters[2];
            convertNumber3();
            convertNumber2();
            convertNumber1();
        }
    }

    public static void convertNumber1() {
        switch (number1) {
            case "1" -> output1 = "I";
            case "2" -> output1 = "II";
            case "3" -> output1 = "III";
            case "4" -> output1 = "IV";
            case "5" -> output1 = "V";
            case "6" -> output1 = "VI";
            case "7" -> output1 = "VII";
            case "8" -> output1 = "VIII";
            case "9" -> output1 = "IX";
            default -> output1 = " ";
        }
        outputNumber();
    }

    public static void convertNumber2 () {
        switch (number2) {
            case "1" -> output2 = "X";
            case "2" -> output2 = "XX";
            case "3" -> output2 = "XXX";
            case "4" -> output2 = "IL";
            case "5" -> output2 = "L";
            case "6" -> output2 = "LI";
            case "7" -> output2 = "LII";
            case "8" -> output2 = "LIII";
            case "9" -> output2 = "XC";
            default -> output2 = " ";
        }
        convertNumber1();
    }

    public static void convertNumber3 () {
        switch (number3) {
            case "1" -> output3 = "C";
            case "2" -> output3 = "CC";
            case "3" -> output3 = "CCC";
            case "4" -> output3 = "CD";
            case "5" -> output3 = "D";
            case "6" -> output3 = "DC";
            case "7" -> output3 = "DCC";
            case "8" -> output3 = "DCCC";
            case "9" -> output3 = "CM";
            default -> output3 = " ";
        }
        convertNumber2();
    }

    public static void outputNumber() {
        System.out.println(output3 + output2 + output1);
        //parameters = new String[0];
        output1 = "";
        output2 = "";
        output3 = "";
        menu();
    }
}