import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        System.out.println("Hello world!");
        int Max = Math.max(c,Math.max(a,b));
        System.out.println(Max);
    }
}

// As we know in our enterprise application we have lots of classes and on that we have lots of objects so if we do this
// we are in lots of trouble...
// and if you're creating new instances like this then we end up with a lots of trouble.
// So basically dependencies means removing new operator in the classes...

//because if one system is down and that class is dependent on other, and we create a new object inside the usable class
//then it purely dependent on that if that class object gets data afterwords we do something
//but if we want to test my code I don't want to wait...
//so that's why we use dependency injection.
// AND To inject is like use by spring framework.
// and the cool thing about these dependency injection frameworks is that they take care of managing all the object
//and allow us to inject the objects were ever necessarily,
// so it is high level stuff that goes into these dependency injection frameworks
// that if you write it yourself it will be a lots of time-consuming. and very difficult to manage.
// using spring boot you basically inject and service


// dependency injection help to testing your program easier.

// let's take an example where I have a class which has need of many classes object.
// so if we don't use dependency injection on that case you will see if you make object of main class and run this class
// all instantiation will automatically make.
// so to avoid this...
// and if one service is down this make whole enterprise down.

