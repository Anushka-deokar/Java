//Example of 
public class defaultc
{
    int age;
    String color;

    void eat()
    {
        System.out.println("i am eating");
    }

    void run()
    {
        System.out.println("i am running");
    }

    public static void main(String[] args) {
        defaultc d=new defaultc();
        d.age=20;
        d.color="white";
        System.out.println(d.age);
        System.out.println(d.color);
        d.eat();
        d.run();
    }
}