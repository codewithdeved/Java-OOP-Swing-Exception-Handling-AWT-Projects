interface Passion {

    String thinking = "Having a brain storming session before creation an animation is a piece of attitude that animation wants to adopt.";

    void coding();

}

class Speciality implements Passion  {

    String animation = "Do's Imagination Animation.";
    
    public void coding() {
    
        System.out.println("Do Code, Apply Encode, Perform Decode.");
    
    }

}

class Developer extends Speciality {

    String developerName;

    String attitude = thinking;

    public void coding() {

        System.out.println();

        System.out.println("On a recent interview all about Authentication was to:");
        
        System.out.println();
        
        super.coding();

        System.out.println();

        System.out.println(developerName + " " + animation);

        System.out.println();

        System.out.println(attitude);

    }

}

public class DeveloperPassion {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.developerName = "Deved";

        developer.coding();

        System.out.println();

    }

}