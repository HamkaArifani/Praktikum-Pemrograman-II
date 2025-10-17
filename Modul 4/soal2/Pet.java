package soal2;

public class Pet {
    private String petName;
    private String petSpecies;

    public Pet (String petName, String petSpecies) {
        this.petName = petName;
        this.petSpecies = petSpecies;
    }
    public String getPetName() {
        return petName;
    }
    public String getPetSpecies(){
        return petSpecies;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + petName);
        System.out.println("Dengan ras: " + petSpecies);
    }
}
