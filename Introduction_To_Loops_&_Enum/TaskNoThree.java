package DoWhileLoopAndEnum;

public class TaskNoThree {

    enum Days {
        Mon, Tue, Wed, Thurs, Fri, Sat, Sun
    }

    public static void main(String[] args) {

        Days day = Days.Mon;

        switch (day) {

            case Mon:
                System.out.println("Monday");
                break;

            case Tue:
                System.out.println("Tuesday");
                break;

            case Wed:
                System.out.println("Wednesday");
                break;

            case Thurs:
                System.out.println("Thursday");
                break;

            case Fri:
                System.out.println("Friday");
                break;

            case Sat:
                System.out.println("Saturday");
                break;

            case Sun:
                System.out.println("Sunday");
                break;

            default:
                break;
        }

    }

}