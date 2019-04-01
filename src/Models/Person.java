package Models;

import java.util.Objects;

public class Person {

    private int id;
    private int age;
    private int dni;
    private String firstName;
    private String lastName;

    public Person(){}

    public Person(String firstName, String lastName, int age, int dni){
        this.id = id;
        this.age = age;
        this. dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setIdPerson(int id){
        this.id = id;
    }

    public int getIdPerson(){
        return id;
    }

    public void setAgePerson(int age){
        this.age = age;
    }

    public int getAgePerson(){
        return age;
    }

    public void setDniPerson(int dni){
        this.dni = dni;
    }

    public int getDniPerson(){
        return dni;
    }

    public void setFirstNamePerson(String firstName){
        this.firstName = firstName;
    }

    public String getFirstNamePerson(){
        return firstName;
    }

    public void setLastNamePerson(String lastName){
        this.lastName = lastName;
    }

    public String getLastNamePerson(){
        return lastName;
    }

    @Override
    public int hashCode(){
        int rta = id;
        rta = 31 * rta + age;
        rta = 31 * rta + dni;
        rta = 31 * rta + firstName.hashCode();
        rta = 31 * rta + lastName.hashCode();

        return rta;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person p = (Person) obj;

        return this.id == p.id &&
                this.age == p.age &&
                this.dni == p.dni &&
                Objects.equals(this.firstName, p.firstName) &&
                Objects.equals(this.lastName, p.lastName);
    }

    @Override
    public String toString(){
        return "Id:" + id + ", " + firstName + " " + lastName + ", Age: " + age + ", Dni:" + dni + "\n";
    }

}
