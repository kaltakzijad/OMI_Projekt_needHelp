public class Lokomotive extends railVehicle{

    private int leistung;
    private int zugKraft_t;
    private int bremsKraft_t;

    public Lokomotive(int id){

        super(id);
        this.setType("L");
    }
    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getZugKraft_t() {
        return zugKraft_t;
    }

    public void setZugKraft_t(int zugKraft_t) {
        this.zugKraft_t = zugKraft_t;
    }

    public int getBremsKraft_t() {
        return bremsKraft_t;
    }

    public void setBremsKraft_t(int bremsKraft_t) {
        this.bremsKraft_t = bremsKraft_t;
    }



    @Override
    public void printInfo(){
        System.out.println("-------------------------Rail vehicle ID: "+this.getID());
        System.out.println("Rail vehicle type: "+ this.getType());
        System.out.println("Allowed weight: "+this.getZulaessigeGesamtgewicht());
        System.out.println("Caption: "+this.getBeschreibung());
        System.out.println("Power: "+this.leistung);
        System.out.println("Tractive effort: "+this.zugKraft_t);
        System.out.println("Braking force: "+this.bremsKraft_t);
    }

}
