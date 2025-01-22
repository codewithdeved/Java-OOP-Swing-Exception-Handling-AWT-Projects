class Card {
    public void greeting() {
        System.out.println("This is a generic card.");
    }
}

class Holiday extends Card {
    public void greeting() {
        System.out.println("Season's Greetings.");
    }
}

class Birthday extends Card {
    public void greeting() {
        System.out.println("Happy Birthday!");
    }
}

class Eid extends Card {
    public void greeting() {
        System.out.println("Happy blissful Eid.");
    }
}

public class CardAndGreeting {
    public static void main(String[] args) {
        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        Card holidayCard = new Holiday();
        Card birthdayCard = new Birthday();
        Card eidCard = new Eid();

        holidayCard.greeting();
        birthdayCard.greeting();
        eidCard.greeting();  
    }
}