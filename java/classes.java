class Pen {
    String color;
    String type;

    public void writing() {
        System.out.println("Pen is writing");
    }

    public void displayColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Animals extends Pen{
    
}

public class classes {
    public static void main(String args[]) {
        Animals a1 = new Animals();
        a1.color = "red";
        a1.displayColor();

        bank.account account1 = new bank.account();
        account1.name = "Daddy";
        account1.displayName();
    }
}
