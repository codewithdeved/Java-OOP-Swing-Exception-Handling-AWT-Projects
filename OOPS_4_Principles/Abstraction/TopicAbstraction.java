package Abstraction;

abstract class TopicIncapsulationParentClass {
    abstract void topicIncapsulationMethod();
}

class TopicIncapsulationSubClass extends TopicIncapsulationParentClass {
    void topicIncapsulationMethod() {
        System.out.println("This is a topic on encapsulation.");
    }
}

public class TopicAbstraction {

    public static void main (String[] args) {

        TopicIncapsulationSubClass topicIncapsulationSubClass = new TopicIncapsulationSubClass();
        topicIncapsulationSubClass.topicIncapsulationMethod();

    }
    
}