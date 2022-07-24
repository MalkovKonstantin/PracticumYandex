package _04_WhyClassesAreNeeded;

public class Praktikum2 {
    public static void main(String[] args) {
        Hamster bite = new Hamster();
        System.out.println("Вес хомяка до пробежки: " + bite.weight);
        bite.runInWheel();
        System.out.println("Вес хомяка после пробежки: " + bite.weight);
    }
}
