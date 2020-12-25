import java.util.Scanner;

public class Login {

    public static String readInPassWord() {
        String passWord = null;
        System.out.println("Enter Password!");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            passWord = sc.nextLine();
            break;
        }
        return passWord;

    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("You Fucked up: " + e);
        }
    }

    public static Boolean checkPassWord(String passWord) {
        return (passWord.equals("password1234"));
    }

    public static void main(String[] args) {
        final int PASS_TEST = 0;
        int count = 0;

        while (true) {

            count += 1;

            // Get password from user and returns String passWord
            String passWord = readInPassWord();

            // checkPassword takes in passWord from user, compare with default value
            // and returns true or false

            Boolean check = checkPassWord(passWord);

            if (check) {
                System.out.println("Well look at you. You may enter");
                break;
            } else if (count < 3) {
                System.out.println("Wrong password, try again");
            }

            if (count == PASS_TEST) {
                System.out.println("You fucked up. Now you wait for " + 5 + " seconds. I have spoken!");
                wait(5);

                count = 0;
            }

        }

    }

}
