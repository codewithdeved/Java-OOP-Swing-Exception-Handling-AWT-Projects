interface Y { void mull(); }

interface X extends Y {
    void add();
    void sub();
}

class A implements X {
    public void add() { System.out.println("Addition in A"); }
    public void sub() { System.out.println("Subtraction in A"); }
    public void mull() { System.out.println("Multiplication in A"); }
}

public class InterfacesHierarchicalDiagram {

    public static void main(String[] args) {

        System.out.println("Name: Tayyab Ali. RollNo: 2024S-BSET-003.\n");

        A a = new A();

        a.add();
        a.sub();
        a.mull();
        
    }
}