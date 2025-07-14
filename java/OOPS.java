abstract class Organisms implements Living {

  void breathes() {
    System.out.println("breathe");
  }

  abstract void eats();
}

interface Living {
    void moves();
}

class Animal {

  int age;
  String name;
  Animal billa;
  private int weight;

  //setter
  void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  //getter
  int getWeight() {
    return this.weight;
  }

  //non-parameterized Constructor
  Animal() {
    System.out.println("Constuctor called");
  }

  //parameterized Constructor
  Animal(int age) {
    this.age = age;
    System.out.println(age);
  }

  Animal(int age, String name) {
    this.age = age;
    this.name = name;
    System.out.println(age);
    System.out.println(name);
  }

  //Copy Constructor
  Animal(Animal obj) {
    this.age = obj.age;
    this.name = obj.name;
    System.out.println(age);
    System.out.println(name);
  }

  //methods(functions)
  void eat() {
    System.out.println("Eating");
  }

  void sleep() {
    System.out.println("Sleeping");
  }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Chewing");
    }
}

class Student {
    static int result(int phy, int chem, int math) {
        return (phy + chem + math) / 3;
    }
}

public class OOPS {

  public static void main(String[] args) {
    // Animal Ramesh = new Animal(10, "billa");
    // Ramesh.age = 69;
    // System.out.println(Ramesh.age);
    // Ramesh.name = "Billa";
    // System.out.println(Ramesh.name);
    // Ramesh.setWeight(100);
    // System.out.println(Ramesh.getWeight());

    // Animal Copy = new Animal(Ramesh);

    // Dog pug = new Dog();
    // pug.eat();
    // Ramesh.eat();

    // Animal a = new Animal();
    // System.out.println();
    // Animal b = new Animal();
    // a.billa = b;
    // System.out.println(a.billa);

    
    System.out.println(Student.result(99, 98, 97));
  }
}
