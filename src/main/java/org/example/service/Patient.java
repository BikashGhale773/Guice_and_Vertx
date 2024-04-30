package org.example.service;

import com.google.inject.Inject;

import javax.inject.Named;

public class Patient implements Doctor{

    private final String surname;
    private String name;
    private String address;
    private String email;
    private int age;

    @Inject
    public Patient(@PatientName String name,@Named("email") String email, String address, Integer age, String surname){
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.address = address;

    }
    @Override
    public void heartDisease(){
        System.out.println("From Patient class operation method with name: " + name  + " surname: " + surname + " and color: "+ age + " email: " + email + " address: " + address);
    }
}
