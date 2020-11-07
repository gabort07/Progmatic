package company.Comparatorok;

import java.util.*;

public class User {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String hairColor;
    private String eyeColor;
    private HashMap<String, HashSet<Swipes>> swipesMap;

    public User(int id, String name, String gender, int age, String hairColor, String eyeColor) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.swipesMap = new HashMap<>();
    }

    public void makeSwipeMap(HashSet<Swipes> set){
        for(Swipes actual : set) {
            swipesMap.putIfAbsent(actual.getType(), new HashSet<>());
            swipesMap.get(actual.getType()).add(actual);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
