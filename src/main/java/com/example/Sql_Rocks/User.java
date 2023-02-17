package com.example.Sql_Rocks;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // So, that hibernate can identify whose attributes to pick table creation
@Table(name = "user_info") // This is for giving Table name == class name

public class User
{
   @Id  // it is written on attributes which to become private

   @Column(unique = true)
    private int id;

   @Column(unique = true)
   private String  email;
    private String name;
    private int age;

    private String mobileNumber;

    @Column(name ="country_name")
    private String Country;

    // Default Constructor.
    User()
    {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public User(int id, String name, int age, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber=mobileNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
