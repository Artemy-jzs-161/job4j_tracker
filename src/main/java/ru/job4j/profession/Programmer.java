package ru.job4j.profession;

public class Programmer extends Engineer {
    private String language;
    private String level;

    public Programmer(String name, String surname, String education, int birthday, String engineerSkills, String language, String level) {
        super(name, surname, education, birthday, engineerSkills);
        this.language = language;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }
}
