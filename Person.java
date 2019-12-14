package com.company;

public class Person
{
    @Override
    public String toString() {
        return "Person{" +
                "Age=" + Age +
                ", Familly='" + Familly + '\'' +
                ", education='" + education + '\'' +
                ", study='" + study + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    private int Age ;
    private String Familly;
    private String education;
    private String study;
    private String Name;

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }



    public String getFamilly() {
        return Familly;
    }

    public void setFamilly(String familly) {
        Familly = familly;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setName(String name) {
        Name = name;
    }
}
