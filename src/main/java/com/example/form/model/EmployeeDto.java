package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDto {

    @JsonProperty(value = "emp_id")
    private long id;
    @JsonProperty(value = "emp_name")
    private String name;
    @JsonIgnore
    private String address;

    public EmployeeDto() {
    }

    public EmployeeDto(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
