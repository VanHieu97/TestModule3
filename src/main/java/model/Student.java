package model;

import java.util.Date;

public class Student {
    int id;
    String name;
    String email;
    String DateOfBirth;
    String address;
    String phoneNumber;
    String ClassRoom;

    public Student(String name, String email, String dateOfBirth, String address, String phoneNumber, String classRoom) {
        this.name = name;
        this.email = email;
        DateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        ClassRoom = classRoom;
    }

    public Student(int id, String name, String email, String dateOfBirth, String address, String phoneNumber, String classRoom) {
        this.id = id;
        this.name = name;
        this.email = email;
        DateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        ClassRoom = classRoom;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(String classRoom) {
        ClassRoom = classRoom;
    }
}
