package ru.job4j.profession;

public class Engineer extends Profession {
    private String engineerSkills;

    public Engineer(String name, String surname, String education,
                    int birthday, String engineerSkills) {
        super(name, surname, education, birthday);
        this.engineerSkills = engineerSkills;
    }

    public String getEngineerSkills() {
        return engineerSkills;
    }
}
