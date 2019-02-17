package com.company.Driver;

public class Driver implements IDriver {
    public String FirstName;
    public String LastName;
    public int Age;

    public Driver(String fn, String ln, int age){
        this.FirstName = fn;
        this.LastName = ln;
        this.Age = age;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public IDriver Clone() {
        return new Driver(this.FirstName, this.LastName, this.Age);
    }

    public void PresentYourself(){
        System.out.println("First Name : " + this.FirstName + "\nLast Name : " + this.LastName + "\nAge : " + this.Age);
    }
}
