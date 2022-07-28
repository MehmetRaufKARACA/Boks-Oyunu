public class Main{

    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("Ali", 17, 100, 92,87,50);
        Fighter f2 = new Fighter("Mike", 20, 100,100,74,50);

        Macth macth = new Macth(f1, f2, 85, 100);

        macth.start();

    }
}