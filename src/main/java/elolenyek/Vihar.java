package elolenyek;

public class Vihar extends Eloleny {

    private String villam;
    private String meghal;

    public Vihar(String name, String villam, String meghal) {
        super(name);
        this.villam = villam;
        this.meghal = meghal;
    }

    public String getVillam() {
        return villam;
    }

    public void setVillam(String villam) {
        this.villam = villam;
    }

    public String getMeghal() {
        return meghal;
    }

    public void setMeghal(String meghal) {
        this.meghal = meghal;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "A " + this.getName() + "ba belecsapott a " + this.getVillam() + " ezért " + this.getMeghal() + "!";
    }
}

    class Kiir{
        public static void main(String[] args) {
            Eloleny eloleny = new Eloleny("Bodri");

            eloleny.setName("Kántor");
            eloleny.setName("Buksi");

            Vihar vihar = new Vihar("Kántor","nagy erejű villám","meghalt");
            Vihar vihar2 = new Vihar("Buksi", "bazi nagy villám", "meghal");

            System.out.println(eloleny.getName());
            System.out.println(vihar);
            System.out.println(vihar2);
        }
    }




