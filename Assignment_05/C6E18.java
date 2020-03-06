import java.util.Scanner;

public class C6E18 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "* password contains minimum eight characters.\n" +
                "* password consists of only letters and numbers.\n" +
                "* password  contains minimum  two digits \n" +
                "Please enter a password: ");
        String s = input.nextLine();
        try {
            if (isValidPassword(s)) {
                System.out.println("Password VALID, your password is: " + s);
            } else {
                throw new Exception();
            }
        }
        catch(Exception e) {
            System.out.println("Password Invalid.");
        }
        System.out.println("Program closed.");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        int charNum = 0;
        int numNum = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumeric(ch)) numNum++;
            else if (isLetter(ch)) charNum++;
            else return false;
        }
        return (charNum >= 2 && numNum >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
