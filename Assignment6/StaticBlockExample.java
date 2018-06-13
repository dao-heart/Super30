 /******************************************
 Static blocks are used to initialise
 a static variable based on some
 computation. These blocks are executed only
 once when the class is loaded the first time.
 *********************************************/

public class StaticBlockExample {
    static int var1=4;
    static int var2=5;
    static int var3;
    static {
        var3 = var1*var2;
    }

    public static void main(String[] args) {
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
    }

}