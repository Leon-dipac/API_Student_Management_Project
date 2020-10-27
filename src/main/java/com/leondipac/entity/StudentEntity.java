/*
        Now let’s create our Model class or JPA Entity in the application.
        The model class will use to hold the data , these classes are used
        to structure the data in the form of JPA Entity class.

        Below is the StudentEntity.java file under com/techblogstation/model , which has following fields :

        id : Corresponding column in mysql is ‘id’ . This is primary key with auto increment value.
        firstName : Corresponding column in mysql is ‘first_name’ . It is a non null field.
        lastName : Corresponding column in mysql is ‘last_name’ .
        branch : Corresponding column in mysql is ‘branch’ .
        emailId : Corresponding column in mysql is ’email_id’ . It is a non null field.
        */

package com.leondipac.entity;


import javax.persistence.*;

@Entity
@Table(name = "student_database_1")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "branch")
    private String branch;
    @Column(name = "last_name")
    private String lastName;
    @Column(name ="email_id", nullable = false, length = 100)
    private String emailId;


    @Override
    public String toString () {
        //return "StudentEntity [id = " + id ", firstName = " +firstName+ ", branch = "+ branch + ",lastName = " + lastName + ", emailId = " + emailId + "] ";
        return "StudentEntity{" +
                "id='" + id + '\'' + ", firstName='" + firstName + '\'' +",branch='" + branch + '\'' +"," +
                "lastName='" + lastName + '\'' +",emailId='" + emailId + '\'' +
                '}';
    }

    // Getters and Setters methods for the above fields :
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
