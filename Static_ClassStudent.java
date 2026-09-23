public class Static_ClassStudent {
    void add(int a, int b){
        System.out.println("Sum of integers: " + (a+b));
    }
    void add(String a, String b){
        System.out.println("Sum of Strings: " + (a+b));
    }
    void add(float a, float b){
        System.out.println("Sum of floats: " + (a+b));
    }
    void add(int i, int j, int k){
        System.out.println("Sum of three integers: " + (i+j+k));
    }
    public static void main(String args[]){
        Static_ClassStudent obj = new Static_ClassStudent();
        obj.add(10,20);
        obj.add("Hello ", "World");
        obj.add(10.5f, 20.5f);
        obj.add(5, 10, 15);
        System.out.println("This is an example of method overloading in Java.");
    }
    
}