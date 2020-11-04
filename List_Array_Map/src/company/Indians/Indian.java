package company.Indians;

import java.util.HashSet;
import java.util.List;

public class Indian {
     private String name;
     private String clan;
     private String gender;
     private int age;
     private HashSet<String> tools;

    public Indian(String name, String clan, String gender, int age, HashSet<String> tools) {
        this.name = name;
        this.clan = clan;
        this.gender = gender;
        this.age = age;
        this.tools = tools;
    }

    public Indian(String fekete_sólyom, int i, String apache) {
    }

    public String getName() {
        return name;
    }

    public String getClan() {
        return clan;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public HashSet<String> getTools() {
        return tools;
    }

    public int countTools() {
        return this.getTools().size();
    }

    @Override
    public String toString() {
        return "Indian{" +
                "name='" + name + '\'' +
                ", clan='" + clan + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                '}';
    }
}
