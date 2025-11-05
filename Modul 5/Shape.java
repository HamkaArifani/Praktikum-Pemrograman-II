package soal1;

public abstract class Shape {
    protected String shapeName;

    public  Shape(String shape){
        this.shapeName=shape;
    }
    protected abstract double area();

    @Override
    public String toString(){
        return shapeName;
    }
}
