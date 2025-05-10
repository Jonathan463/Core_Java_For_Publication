public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.print("!");

        printThing(cat);

        /*
    Lambda allows us to pass the implementation of a method instead
     of passing the object that contains that implementation

     While using Lambda, when passing the method implementation,
     there are some things we leave out
     1. the method access level
     2. the method name
     3. the return type because the compiler can figure that out.
     4. add an arrow between the method parameter and the method implementation


     FROM THIS
        printThing(
                public void print() {
            System.out.println("Meow");
        });

        TO THIS
        printThing(
                () -> {
            System.out.println("Meow");
        });

     5. if the lambda contains a single statement, we can remove the curly brace
        printThing(() -> System.out.println("Meow"));

     6. we can also assign the lambda function to a variable.
        Printable lambdaPrintable = () -> System.out.println("Meow");

     7. In general, In java Lambda gives us the ability to pass method
        implementation to a variable as if the method implementation is an object

     8. If the method takes in a parameter, we need to account for it in the lambda expression.
        Printable lambdaPrintable = (x) -> System.out.println("Meow"+x);


     9. if we have a return statement for the method, then we will need to add the return statement
        on the lambda implementation which will make us have more than 1 statement, and add a semicolon
        after the closing curly brace

        Printable lambdaPrintable = (x) -> {
        System.out.println("Meow"+x);
        return return_value;
        };

        10. Lambda can only work on Functional Interface(SAM)
         */

        Printable lambdaPrintable = (x) -> System.out.println("Meow"+x);
        printThing(lambdaPrintable);

    }


    static void printThing(Printable thing){
        thing.print("!!!");
    }
}
