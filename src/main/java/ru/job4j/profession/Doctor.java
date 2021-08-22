package ru.job4j.profession;

public class Doctor extends Profession {
    private String specialization;
    private String work;
    private Patient patient;


    public String getSpecialization() {
        return specialization;
    }

    public Patient getPatient() {
        return patient;
    }

}
