package OOP;
//Method overloading the same add method diff parameter type and could be diff parameter input amt. {Integer, Double,long}
//Polymorphism--Method overloading
/**The method overloading feature in Java provides several benefits, including:

 It allows us to reuse the same method name to perform different operations.
 It makes code more readable and maintainable by providing meaningful method names that reflect the operation being performed.
 It allows us to provide default values for parameters or handle different parameter types in a single method.*/
public class CalculatorMethodOverloading {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }
    public long add(long x,long y, long z){
        return x + y + z;
    }

    public static void main(String[] args) {
        CalculatorMethodOverloading calInt=new CalculatorMethodOverloading();
        CalculatorMethodOverloading calDouble= new CalculatorMethodOverloading();
        CalculatorMethodOverloading calLong=new CalculatorMethodOverloading();
        System.out.println(calInt.add(2,3));
        System.out.println( calDouble.add(2.5,5.5));
        System.out.println(calLong.add(123L,123L,123L));
    }
}
