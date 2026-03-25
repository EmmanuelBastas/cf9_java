package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {

        Product milk = new Product(1L, "Milk A", "Ligth Milk", 1.5, 2, true);

















        int price;

        User user = new User();
        User andreas22 = new User(1L, "Andreas", "Papadopoulos", "andrew", "12345", true);

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4, "Makis", "Kapetis");
        student2.setFirstName("Chrisostomos");

//        alice.id = 1;
//        bob.id = 2;
//        student.firstName = "George";

        alice.setId(1);                         // setter
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        bob.setId(2);
        bob.setFirstName("Bob");
        bob.setLastName("Dylan");

        student.setId(3);
        student.setFirstName("Anna");
        student.setLastName("Karenina");

        System.out.println(alice.getId());      // getter
        System.out.println(alice.getFirstName());
        System.out.println(alice.getLastName());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstName(), alice.getLastName());

        System.out.println(Student.getStudentsCount());
    }
}
