package elolenyek;

public class Dog extends Eloleny{

    private int labakszama;

    public int getLabakszama() {
        return labakszama;
    }

    public void setLabakszama(int labakszama) {
        this.labakszama = labakszama;
    }

    public Dog(String name, int labakszama) {
        super(name);
        this.labakszama = labakszama;
    }

    public Dog(String name){
        this(name,4);
    }


}
