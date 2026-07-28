class Robot {

    String name;
    String purpose;

    Robot(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    void introduce() {
        System.out.println("Hello!");
        System.out.println("My name is " + name);
        System.out.println("My purpose is " + purpose);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Robo", "Helping Students");
        Robot robot2 = new Robot("Titan", "Cleaning Homes");

        robot1.introduce();
        robot1.work();

        System.out.println();

        robot2.introduce();
        robot2.work();
    }
}
