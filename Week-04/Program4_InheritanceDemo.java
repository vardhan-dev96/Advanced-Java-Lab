class Animal
{
    String name = "Animal";

    void eat()
    {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog
{
    void play()
    {
        System.out.println("Puppy plays");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat meows");
    }
}

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        System.out.println("Name: " + d.name);
        d.eat();
        d.bark();

        System.out.println();
        System.out.println("Multilevel Inheritance:");
        Puppy p = new Puppy();
        System.out.println("Name: " + p.name);
        p.eat();
        p.bark();
        p.play();

        System.out.println();
        System.out.println("Hierarchical Inheritance:");
        Cat c = new Cat();
        System.out.println("Name: " + c.name);
        c.eat();
        c.meow();
    }
}
