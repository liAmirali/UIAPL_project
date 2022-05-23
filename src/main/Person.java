package main;

public class Person {
    private final String name;
    private final String lastname;
    private final int birthdayYear;
    private final String city;
    private final String job;
    private final boolean gender;
    private final int salary;

    public Person(String name, String lastname, int birthdayYear, String city, String job, boolean gender, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
        this.city = city;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthdayYear() {
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
