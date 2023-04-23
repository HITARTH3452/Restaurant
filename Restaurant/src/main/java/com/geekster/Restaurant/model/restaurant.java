package com.geekster.Restaurant.model;

public class restaurant {

    private static String id;
    private String name;
    private String address;
    private String number;
    private String speciality;
    private String totalstaff;

    public restaurant(String id,String name, String address, String number, String speciality, String totalstaff) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalstaff = totalstaff;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setTotalstaff(String totalstaff) {
        this.totalstaff = totalstaff;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getTotalstaff() {
        return totalstaff;
    }

    public String isRestroId() {
        return id;
    }

    public void setRestroSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
