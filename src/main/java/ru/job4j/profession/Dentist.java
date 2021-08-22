package ru.job4j.profession;

public class Dentist extends Doctor {
    private String license;

    public Dentist(String name, String surname, String education, int birthday, String specialization, String work, Patient patient, String license) {
        super(name, surname, education, birthday, specialization, work, patient);
        this.license = license;
    }


    public String getLicense() {
        return license;
    }
}
