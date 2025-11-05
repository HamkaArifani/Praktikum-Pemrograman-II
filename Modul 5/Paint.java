package soal1;

public class Paint {
    private Double coverage;

    public Paint(Double c) {
        this.coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
}
