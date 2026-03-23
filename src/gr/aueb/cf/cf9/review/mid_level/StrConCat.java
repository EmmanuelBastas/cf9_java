package gr.aueb.cf.cf9.review.mid_level;

public class StrConCat {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 40;
        String message = concStr(name, age);
        System.out.println(message);
    }

    public static String concStr(String name, int age) {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}
