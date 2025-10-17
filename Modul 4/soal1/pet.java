package soal1;

public class pet {
    private String petName;
    private String petSpecies;

    public pet (String petName, String petSpecies) {
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
        System.out.println("Nama hewan peliharaan: " + petName);
        System.out.println("Dengan ras: " + petSpecies);
    }
}
