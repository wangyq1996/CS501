import java.util.Scanner;

public class C6E23 {


    public static void main(String[] args) {
        try {
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Do you want to play ? (please enter Y or N)");
                String play = input.nextLine();
                if (play.equals("Y")) {
                    System.out.println("Enter a string with only letters in one line and hit Enter: ");
                    String s = input.nextLine();
                    if(!isAlpha(s)) throw new IllegalArgumentException("input String is wrong format");
                    System.out.println("Enter a query character in one line and hit Enter: ");
                    String search = input.next();
                    char ch = search.charAt(0);
                    if(search.length() != 1) throw new IllegalArgumentException("input String is wrong format");
                    if(!isLetter(ch)) throw new IllegalArgumentException("query Character is wrong format");
                    int res = count(s, ch);
                    System.out.println("The number of occurrences of \'" + ch + "\' in \"" + s + "\" is " + res);
                } else  {
                    System.out.print("Game is finished");
                    break;
                }

            }
        } catch (Exception e){
            System.out.println(e);

        }


    }

    public static int count(String str, char a) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) count++;
        }

        return count;
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

}
