package soal2;

public class Dog extends Pet{
    private String furColor;
    private String petAbillity;
    public Dog(String petName, String petSpecies, String furColor, String petAbillity){
        super(petName, petSpecies);
        this.furColor = furColor;
        this.petAbillity = petAbillity;
    }
    public String getFurColor() {
        return furColor;
    }
    public String getPetAbillity(){
        return petAbillity;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Memiliki warna bulu: " + furColor);
        System.out.println("Memiliki kemampuan: " + petAbillity);
    }
}
