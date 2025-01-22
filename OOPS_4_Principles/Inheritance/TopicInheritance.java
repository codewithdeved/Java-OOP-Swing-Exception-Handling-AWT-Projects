package Inheritance;

class Ball {
    String color;
}

class Football extends Ball {
    
}

public class TopicInheritance {
    public static void main(String args[]) {

        Football football = new Football();

        football.color = "White";

        System.out.println(football.color);

    }

}