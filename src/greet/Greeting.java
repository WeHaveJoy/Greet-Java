package greet;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Greeting {
    /*
    greet = username + language to greet in
    greeted = all greeted users + time each has been greeted
    counter = list of unique users
    clear = deletes greetings + user info. clear + name deletes counter for the user
    exit = exits app
    */
    Boolean exit = true;
    List language = new ArrayList<String>();
    List users = new ArrayList<String>();
    String userLanguage;
    Scanner s = new Scanner(System.in);

    public static void main(String args[]) {}

    void greet(String name, String lan) {
        switch (lan) {
            case "IsiXhosa":
                System.out.println("Mholo, " + name);
                break;
            case "IsiZulu":
                System.out.println("Sawubona, " + name);
                break;
            case "Sesotho":
                System.out.println("Dumela, " + name);
            default:
                System.out.println("Hello, " + name);
        }
    }

    int greeted(String userName) {
        int i = 0;
        int counter = 0;

        while (i < users.size()) {
            if (users.get(i) == userName) {
                counter += 1;
                i += 1;
            } else {
                i += 1;
            }
        }

        return counter;
    }

    int counter() {
        int count = 1;

        for (int i = 1; i < users.size(); i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (users.get(i) == users.get(j))
                    break;

            if (i == j)
                count++;
        }
        return count;
    }

    boolean exit() {
        return exit = false;
    }
}

