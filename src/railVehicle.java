public class railVehicle {
    private String type;
    private int ID;
    private String beschreibung;
    private int zulaessigeGesamtgewicht;

    public railVehicle(int id) {
        this.ID = id;
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getZulaessigeGesamtgewicht() {
        return zulaessigeGesamtgewicht;
    }

    public void setZulaessigeGesamtgewicht(int zulaessigeGesamtgewicht) {
        this.zulaessigeGesamtgewicht = zulaessigeGesamtgewicht;
    }
    public void printInfo(){
        System.out.println("----------Rail vehicle ID: "+this.ID);
        System.out.println("Allowed weight: "+this.zulaessigeGesamtgewicht);
        System.out.println("Caption: "+this.beschreibung);

    }
}