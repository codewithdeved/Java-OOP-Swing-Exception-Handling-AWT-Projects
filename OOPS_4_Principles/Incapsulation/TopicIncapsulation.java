package Incapsulation;

class privateInt {

    private int num1;

    int num2;
    void digits(int i) {
        this.num2 = i;
    }
    int getInt() {
        return num2;
    }

}

public class TopicIncapsulation {

    public static void main(String[] args) {
    
        privateInt getIntMethod = new privateInt();
    
        getIntMethod.digits(20000);
    
        System.out.println(getIntMethod.getInt());
    
    }
    
}