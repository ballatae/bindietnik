import java.util.Scanner; //* To get an input
import java.util.Random; // * To get a random number,string, etc.
import java.swing.JOptionPane; // * To get a message like a box

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        // ! Print
        javax.swing.JOptionPane.showMessageDialog(null, "");
        System.out.println("");

        // ! Input
        String name;
        System.out.print("Enter the name: ");
        name = scan.nextLine();

        // ! Change data types
        int x = 4324234;
        String y = "231";
        double doublestr = 22.01;

        String str1 = Integer.toString(doublestr);
        System.out.println(str1);

        int a = Integer.parseInt(y);
        System.out.println(a);

        double height = Double.parseDouble(y);

        // ! calculation

        // ? + for adding a + b
        // ? - for sub a - b
        // ? * for mult a * b ?
        // ?for div a / b
        // ? % for modulus (remainder) a % b

        // ! if else
        if ("condition") {
            System.out.print("");
        } else if ("Condition 2") {
            System.out.println("");
        } else {
            System.out.println("");
        }

        // ! boolean
        // ? == is equal to
        // ? != isn't equal to
        // ? > is greater than
        // ? < is smaller than
        // ? >= grater or equal
        // ? <= smaller or equal
        // ? & and
        // ? || or
        // ? ! not

        // ! Switch

        switch ("variable that we want to compare") {
            case "value":
                System.out.println("");
                break;
            case "value2":
                System.out.println("");
                break;
            case "value3":
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }

        // ! Select random
        double selectedrandom = 5 + (Math.random() * 30); // ? from 5 and cont till the 30th number.
        System.out.println(selectedrandom);

        // ! Selectin a random int only
        int randomInteger = random.nextInt(100); // ? from 0 to 100
        System.out.println(randomInteger);
        int notZero = random.nextInt(12) + 1;// ? from 1 to 12

        // ! Find the lenght
        System.out.println("Enter: ");
        String textlength = scan.nextLine();

        int length;

        length = textlenght.length();
        System.out.println(length);

        // * find the power of a number '''Math.pow(a, 2)'''

        // !loops

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        } // ? will be printed five time
          // * we use for only if we know how many repetitions we need
        int i = 0;
        int sum = 0;
        while (i <= 13) {
            sum += i;
            i++;
            // ? this will add till the sum is equal or less than 13
            // * a while loop is used in case we don't know how many repetitions we need
        }
        System.out.println(sum);
        int doSum = 0;
        int adder = 1;
        do {
            doSum += adder;
            adder++;
        } while (adder < 100);
    }

    // ! Methods

    // get the array elements from the user
    public static int[] getArrayDatas(String message, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the value of the numbers in array: ");
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    // ? display all the elements of the array
    public static String displayAllElements(int[] numbers) {
        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            result = result + " " + String.valueOf(numbers[i]);
        }
        return result;
    }

    public static void printTowerElements(int[] oddTower1) {
        for (int i = 0; i < oddTower1.length; i++) {
            if (oddTower1[i] != 0) {
                System.out.print(oddTower1[i] + " ");
            }
        }
    }

    // ? calculate the sum of the array
    public static int sumNumbers(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    // ?find the largest number
    public static int maxNumber(int[] numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = Math.max(result, numbers[i]);
        }
        return result;
    }

    // ? find the smallest number
    public static int findMin(int[] numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = Math.min(result, numbers[i]);
        }
        return result;
    }

    // ?sort the numbers ascending
    public static void sortAscending(int[] numbers) {
        // create a int that will sort a larger number so it will put it the last
        int savedNr;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    savedNr = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = savedNr;
                }
            }
        }
    }

    // swap the positions
    public static void swapPosition(int[] numbers, int selectedFirst, int selectedScnd) {
        String result = "";

        numbers[selectedFirst - 1] = numbers[selectedFirst - 1] - numbers[selectedScnd - 1];
        numbers[selectedScnd - 1] = numbers[selectedFirst - 1] + numbers[selectedScnd - 1];
        // getabs - gives us the absolute value of the int that was before the calc
        numbers[selectedFirst - 1] = getAbsoluteValue(numbers[selectedFirst - 1] - numbers[selectedScnd - 1]);

        for (int i = 0; i < numbers.length; i++) {
            result = result + " " + String.valueOf(numbers[i]);
        }
    }

    // get the absolute value of the number selected
    public static int getAbsoluteValue(int selectedFirst) {
        return Math.abs(selectedFirst);
    }

    // function to put the new numbers in the array
    public static int[] newValueInArray(int[] oddTower1, int rand_int1) {
        for (int i = 0; i < oddTower1.length; i++) {
            if (oddTower1[i] == 0) {
                oddTower1[i] = rand_int1;
                break;
            }
        }
        return oddTower1;
    }

    // generate a random number method
    public static int randomNumber() {
        return random.nextInt(12) + 1;
    }
}
