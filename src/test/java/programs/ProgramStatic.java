package programs;

public class ProgramStatic {
    ProgramStatic(){
        System.out.println("constructor");
    }
    static{
        System.out.println("static method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        ProgramStatic obj = new ProgramStatic();
    }
}
