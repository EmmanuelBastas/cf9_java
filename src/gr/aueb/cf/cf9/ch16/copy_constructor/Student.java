package gr.aueb.cf.cf9.ch16.copy_constructor;

public class Student {
    private String name;
    private City city;

    public Student() {

    }

    public Student(Student student) {
        this.name = student.name;
        this.city = new City(student.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return new City(this.city);
    }

    public void setCity(City city) {
        this.city = new City(city);
    }
}
