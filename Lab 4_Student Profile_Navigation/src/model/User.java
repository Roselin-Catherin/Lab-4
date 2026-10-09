package model;

import java.io.File;
import java.util.Date;

public class User {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;
    private String continent;
    private String experience;
    private String photo;
    private Date date;

    // === Constructor ===
    public User(String firstName, String lastName, String gender, int age,
                String phone, String email, String continent, String experience, String photo, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.continent = continent;
        this.experience = experience;
        this.photo = photo;
        this.date = date;
    }

    // === Getters & Setters ===
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContinent() { return continent; }
    public void setContinent(String continent) { this.continent = continent; }

    public String getHobbies() { return experience; }
    public void setHobbies(String hobbies) { this.experience = hobbies; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    
    public Date getdate() {   return date; }
    public void setdate(Date dob) {  this.date = dob; }

    // === toString (excludes photo) ===
    @Override
public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy");
        String dobStr = (date != null) ? sdf.format(date) : "N/A";
        return "First Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nGender: " + gender +
               "\nAge: " + age +
               "\nDate of Birth: " + dobStr +
               "\nPhone: " + phone +
               "\nEmail: " + email +
               "\nContinent: " + continent +
               "\nExperience: " + experience;
    }

}
