public class Cat implements Printable{
    public String name;
    public int age;

    public Cat(){}

    @Override
    public void print(String x) {
        System.out.println("Meow"+x);
    }
}
