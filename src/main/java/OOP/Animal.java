package OOP;
/**Here are some key differences between method overriding and method overloading:

 In method overriding, the method name, return type, and parameter list must be the same in the superclass and subclass, whereas in method overloading, the method name must be the same, but the parameter list must be different.

 Method overriding is used to provide a specialized implementation of a method in a subclass, while method overloading is used to provide multiple ways to call the same method with different arguments.

 In method overriding, the implementation in the subclass is selected at runtime based on the type of the object, while in method overloading, the correct method to be invoked is determined at compile-time based on the number and types of arguments.*/
public class Animal {

    public void makeSound(){
        System.out.println("Animal is making a sound");
    }


    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal animalDog=new Dog();
        Animal animalCat=new Cat();

        animal.makeSound();
        animalDog.makeSound();
        animalCat.makeSound();

    }

}
