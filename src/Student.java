import java.util.Scanner;

public class Student {
    private String id;
    private  String name;
    private String birthday;
    private String gender;
    private String phone;


    private String email;
    private String address;
    private String grade;

    Student(){};


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    Student(String id,String name, String birthday, String gender, String phone, String email, String address, String grade){

        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender= gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String age) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Thông tin học sinh { " +
                "id " + id +
        "Họ và tên:" + name +
                ", ngày sinh: " + birthday +
                " , giới tính: " + gender+
                " , số điện thoại:" +phone+
                " , Email: " + email+
                ", quê quán: " + address  +
                ", lớp " + grade+ "}"
                ;
    }


    public void display(){
        System.out.println(this);
    }
}
