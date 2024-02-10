package com.example.demo.domian;

import jakarta.persistence.*;

@Entity
@Table(
        name = "register"
)
public class Register {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int user_no;
    @Column(
            name = "id",
            nullable = false
    )
    private String id;

    @Column(
            name = "name",
            nullable = false,
            length = 20
    )
    private String name;
    @Column(
            name = "age",
            nullable = false
    )
    private int age;

    @Column(
            name = "address",
            nullable = false,
            length = 100
    )
    private String address;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}