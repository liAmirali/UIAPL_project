package main;

public class Person {
    String name;
    String lastname;
    String birthdayYear;
    String city;
    String job;
    boolean gender;
    int salary;

    public Person(String name, String lastname, String birthdayYear, String city, String job, boolean gender, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
        this.city = city;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public boolean isGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }
}
