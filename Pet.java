// Pet.java
// Noah Pohl
// 3-15-20 
// IT-145 SNHU

public class Pet{
    public static void main(String[] args) {
        System.out.println("yo");

        Cat grumpyCat = new Cat("Cat", "GrumpyCat", 8, 1, 14, 50);

        Cat mochie = new Cat("Cat", "Mochie", 7, 1, 10, 30);

        // get grumpys name
        String grumpyCatName = grumpyCat.getPetName();
        // get grumpys age
        int grumpyCatAge = grumpyCat.getPetAge();
        System.out.println("Our first cute cat with us is " + grumpyCatName + " who is " + grumpyCatAge + " years old!");

        //get mochies age
        String mochieCatName = mochie.getPetName();
        int mochieCatAge = mochie.getPetAge();
        System.out.println("Our second very cute cat with us is " + mochieCatName + " who is " + mochieCatAge + " years old!");

    }
}