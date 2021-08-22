package ru.job4j.profession;

public class Builder extends Engineer {
    private String qualification;
    private String location;

    public Builder(String name, String surname, String education, int birthday, String engineerSkills, String qualification, String location) {
        super(name, surname, education, birthday, engineerSkills);
        this.qualification = qualification;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getQualification() {
        return qualification;
    }
}
