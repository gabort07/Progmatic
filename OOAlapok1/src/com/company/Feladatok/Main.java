package com.company.Feladatok;

public class Main {
    public static void main(String[] args) {
//        PostIt postit1 = new PostIt("orange", "Ötlet1", "blue");
//        PostIt postir2 = new PostIt("red", "Király", "black");
//        PostIt postit3 = new PostIt("yellow", "Megcsinálni a házit", "green");
//
//        BlogPost post1 = new BlogPost("Gipsz Jakab", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
//        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
//        String text3 = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
//        BlogPost post3 = new BlogPost("William Tuurton", "One Engineer Is Trying to Get IBM to Reckon With Trump", text3, "2017.03.28");

//        Pokemon[] ashCollection = {new Pokemon("Balbassaur", "leaf", "water"), new Pokemon("Pikatchu", "electric", "water"),
//                new Pokemon("Charizard", "fire", "leaf"), new Pokemon("Squirtle", "water", "fire"),
//                new Pokemon("Kingler", "water", "fire")};
//
//        Pokemon enemy = new Pokemon("Odish", "leaf", "water");
//        System.out.println(wichToChoose(ashCollection,enemy));

//        Domino[] collection = {new Domino(5, 2), new Domino(4, 6), new Domino(1, 5),
//                new Domino(6, 7), new Domino(2, 4), new Domino(7, 1)};
//        organise(collection);
//        printArray(collection);

//Student student = new Student();
//Teacher teacher = new Teacher();
//student.question(teacher);
//teacher.teach(student);

    }

    public static String wichToChoose(Pokemon[] collectoin, Pokemon enemy) {
        String name = "";
        for (int i = 0; i < collectoin.length; i++) {
            if (collectoin[i].getType().equals(enemy.getEffectiveAgainst())) {
                name = collectoin[i].getName();
            }
        }
        return name;
    }

    public static void organise(Domino[] dominoes) {
        for (int j = 0; j < dominoes.length; j++) {
            for (int i = j+1; i < dominoes.length; i++) {
                if (dominoes[j].getRIGHTSIDE() == dominoes[i].getLEFTSIDE()) {
                    Domino temp = dominoes[j + 1];
                    dominoes[j + 1] = dominoes[i];
                    dominoes[i] = temp;
                }
            }
        }
    }

    public static void printArray(Domino[] dominoes) {
        for (Domino dominoe : dominoes) {
            System.out.println(dominoe.getLEFTSIDE() + ", " + dominoe.getRIGHTSIDE());
        }
    }
}
