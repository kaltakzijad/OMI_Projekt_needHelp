public class Wagon extends railVehicle{


    private int sitzKlasse;
    private int sitzPlatze;


    public Wagon(int id){
        super(id);
        this.setType("W");
    }

    public int getSitzKlasse() {
        return sitzKlasse;
    }

    public void setSitzKlasse(int sitzKlasse) {
        this.sitzKlasse = sitzKlasse;
    }

    public int getSitzPlatze() {
        return sitzPlatze;
    }

    public void setSitzPlatze(int sitzPlatze) {
        this.sitzPlatze = sitzPlatze;
    }

    @Override
    public void printInfo(){
        System.out.println("-------------------------RAIL VEHICLE ID: "+this.getID());
        System.out.println("Rail vehicle type: \t"+this.getType());
        System.out.println("Allowed weight: \t"+this.getZulaessigeGesamtgewicht());
        System.out.println("Caption: \t"+this.getBeschreibung());
        System.out.println("Seat class: \t"+this.sitzKlasse);
        System.out.println("Number of seats: \t"+this.sitzPlatze);
    }
}
