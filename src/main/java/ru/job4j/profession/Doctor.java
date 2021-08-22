package ru.job4j.profession;

public class Doctor extends Profession {
    private String specialization;
    private String work;
    private Patient patient;

    public Doctor(String name, String surname, String education, int birthday, String specialization, String work, Patient patient) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
        this.work = work;
        this.patient = patient;
    }


    public String getSpecialization() {
        return specialization;
    }

    public Patient getPatient() {
        return patient;
    }

}
