package programs;

public class Program1 {

    final int x= 5;
    Program1(){
        System.out.println("Hello");
        System.out.println(x);

    }
    static void a1(){
        System.out.println("static method");
    }
    public void b1(){
        System.out.println("public method");
    }
    public static void main(String[] args) {
        Program1 obj = new Program1();

        a1();
        obj.b1();
    }
}
