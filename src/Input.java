import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a sentence :");
        String userInput = scanner.nextLine();
        System.out.println("Your sentence is ' " + userInput + "'.");
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        System.out.println("Your sentence is ' " + userInput + "'.");
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max + " :");
        int input = scanner.nextInt();
        if (input < min) {
            System.out.println("Your number needs to be higher.");
            getInt(min, max);
        } else if (input > max) {
            System.out.println("Your number needs to be lower.");
            getInt(min, max);
        } else {
            System.out.println("Your number is " + input);
        }
        return input;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int num;
        try {
            String input = scanner.nextLine();
            num = Integer.parseInt(input);
        } catch (RuntimeException re) {
            System.err.println("You must enter an integer.");
            return getInt(min, max, prompt);
        }
        if (num < min) {
            System.out.println("Your number needs to be higher.");
            getInt(min, max);
        } else if (num > max) {
            System.out.println("Your number needs to be lower.");
            getInt(min, max);
        } else {
            System.out.println("Your number is " + num);
        }
        return num;
    }


    public int getInt() {
        System.out.println("Enter a number : ");
        int input = scanner.nextInt();
        System.out.println("Your number is " + input);
        return input;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int input = scanner.nextInt();
        System.out.println("Your number is " + input);
        return input;
    }

    public double getDouble(double min, double max) {

        System.out.println("Enter a double between " + min + " and " + max + " :");
        double input = scanner.nextDouble();
        if (input < min) {
            System.out.println("Your number needs to be higher.");
            getDouble(min, max);
        } else if (input > max) {
            System.out.println("Your number needs to be lower.");
            getDouble(min, max);
        } else {
            System.out.println("Your number is " + input);
        }
        return input;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double input = scanner.nextDouble();
        if (input < min) {
            System.out.println("Your number needs to be higher.");
            getDouble(min, max);
        } else if (input > max) {
            System.out.println("Your number needs to be lower.");
            getDouble(min, max);
        } else {
            System.out.println("Your number is " + input);
        }
        return input;
    }

    public double getDouble() {
        System.out.println("Enter a double :");
        double input = scanner.nextDouble();
        System.out.println("Your number is " + input);
        return input;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input = scanner.nextDouble();
        System.out.println("Your number is " + input);
        return input;
    }
}
