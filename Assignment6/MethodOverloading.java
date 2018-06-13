public class MethodOverloading {
    public void print() {
        System.out.println("Function with null arguments called");
    }
    public void print(int arg) {
        System.out.println("Function with int type argument called");
    }
    public void print(float arg) {
        System.out.println("Function with float type argument called");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.print();
        mo.print(1);
        mo.print(4.5f);
    }
}