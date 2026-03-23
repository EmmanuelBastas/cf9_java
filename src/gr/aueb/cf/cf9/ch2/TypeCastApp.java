package gr.aueb.cf.cf9.ch2;

public class TypeCastApp {

    public static void main(String[] args) {
        long myLong = 2_147_483_648L;
        int myInt = (int) myLong;


        System.out.println(myLong);
        System.out.println("My long is: " + myLong);
        System.out.printf("My long is: %d%n", myLong);
    }
}
