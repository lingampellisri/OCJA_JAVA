package java_Lambda;

public class day1 {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Welcome to The New World");
        greeting.greet();

        Addition add=(int a,int b)->a+b;
       System.out.println( add.add(2,3));
    }
}
