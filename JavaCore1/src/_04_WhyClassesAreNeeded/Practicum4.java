package _04_WhyClassesAreNeeded;

public class Practicum4 {

    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        bite.eat(35);
        for (int i = 0; i < 3; i++) {
            bite.runInWheel();
        }

        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.weight = 250;
        ninja.runInWheel();
        if (ninja.weight < 265) {
            ninja.eat(45);
        }

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        kuzya.weight = 450;
        kuzya.weight = 325;
        kuzya.eat(20);

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.weight = 320;

        System.out.println("bite "+bite.weight);
        System.out.println("ninja "+ninja.weight);
        System.out.println("kuzya "+kuzya.weight);
        System.out.println("paskal "+paskal.weight);
    }

}
