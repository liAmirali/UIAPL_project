package main;

public class Person {
    private final String name;
    private final String lastname;
    private final int birthdayYear;
    private final String cityName;
    private final String job;
    private final boolean gender;
    private final int salary;

    public Person(String name, String lastname, int birthdayYear, String city, String job, boolean gender, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
        this.cityName = city;
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

    public String getCityName() {
        return cityName;
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

    @Override
    public String toString() {
        return "Name: " + name +
                ", Last Name: " + lastname +
                ", Birthday Year: " + birthdayYear +
                ", City: " + cityName +
                ", Job: " + job +
                ", Gender: " + gender +
                ", Salary:" + salary;
    }
}
