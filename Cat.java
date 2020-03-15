// Noah Pohl
// 3-11-20
// Cat.java

// inherits from the Pet class
public class Cat extends Pet {

    // Instance private Variables
    private String petType;
    private String petName;
    private int petAge;
    private int catSpace;
    private int daysStay;
    private int amountDue;

    // Constructor for Cat class
    public Cat(String petType, String petName, int petAge, int catSpace, int daysStay, int amountDue) {
        super();
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.catSpace = catSpace;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    // getters and setters for breed

    // getter for petType
    public String getPetType() {
        return petType;
    }

    // setter for petType
    public void setPetType(String petType) {
        this.petType = petType;
    }

    // getter for petName
    public String getPetName() {
        return petName;
    }

    // setter for petName
    public void setPetName(String petName) {
        this.petName = petName;
    }

    // getter for petAge
    public int getPetAge() {
        return petAge;
    }

    // setter for petAge
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    // getter for catSpace
    public int getCatSpace() {
        return catSpace;
    }

    // setter for catSpace
    public void setCatSpace(int catSpace) {
        this.catSpace = catSpace;
    }

    // getter for daysStay
    public int getDaysStay() {
        return daysStay;
    }

    // setter for daysStay
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    // getter for amountDue
    public int getAmountDue() {
        return amountDue;
    }

    // setter for amountDue
    public void setAmountDue(int amountDue) {
        this.amountDue = amountDue;
    }

    // catSpaceNbr method
    public void catSpaceNbr() {
        catSpaceNbr();
    }

    // checkin method
    public void checkIn() {
        checkIn();
    }

    // checkOut method
    public void checkOut() {
        checkOut();
    }

    // getPet method
    public void getPet() {
        getPet();
    }

    // createPet method
    public void createPet() {
        createPet();
    }

    // updatePet method
    public void updatePet() {
        updatePet();
    }

}
