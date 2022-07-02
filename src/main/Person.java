package main;

import main.exceptions.CityDoesNotExistsException;
import main.exceptions.NotEnoughBudgetException;

public class Person {
    public static final String PILOT = "Pilot";
    public static final String BUS_DRIVER = "Bus Driver";
    public static final String SAILOR = "Sailor";
    public static final String TRAIN_DRIVER = "Train Driver";

    private final String name;
    private final String lastname;
    private final int birthdayYear;
    private final String cityName;
    private final String job;
    private final boolean gender;
    private final int salary;
    private boolean isEmployed;

    public Person(String name, String lastname, int birthdayYear, String cityName, String job, boolean gender, int salary) {
        this.name = name;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
        this.cityName = cityName;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
        this.isEmployed = false;
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

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", cityName='" + cityName + '\'' +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public static boolean hirePerson(Person person, String cityName) throws CityDoesNotExistsException, NotEnoughBudgetException {
        City city = Country.getCityByName(cityName);

        if (person.getSalary() > city.getBudget())
            throw new NotEnoughBudgetException("Can't hire this person.");

        city.setBudget(city.getBudget() - person.getSalary());
        person.setEmployed(true);
        return true;
    }
}
