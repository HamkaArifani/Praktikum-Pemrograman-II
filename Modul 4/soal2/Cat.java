package soal2;

public class Cat extends Pet{
    private String furColor;
    public Cat(String petName, String petSpecies, String furColor) {
        super(petName, petSpecies);
        this.furColor = furColor;
    }
    public String getFurColor() {
        return furColor;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Memiliki warna bulu: "+ furColor + "\n");
    }
}
