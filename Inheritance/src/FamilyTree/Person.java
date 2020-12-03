package FamilyTree;

public class Person {
    static int ID = 0;
    private String name;
    private Person mother;
    private Person father;

    public Person(String name){
        this.name = name;
        ID ++;
    }

    public Person(String name, String motherName, String fatherName) {
        ID ++;
        this.name = name;
        this.mother = new Mother(motherName);
        this.father = new Father(fatherName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

}
