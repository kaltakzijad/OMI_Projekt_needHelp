import java.util.ArrayList;

public class Lager {
    private ArrayList <railVehicle> railVehicles;
    private static int nextId=0;
    public Lager(){

        railVehicles = new ArrayList<railVehicle>();
    }

    public ArrayList<railVehicle> getRailVehicles() {
        return this.railVehicles;
    }

    public railVehicle getRailVehicle(int id){
        if (id > railVehicles.size() || id<1){
            return null;
        }
        for (int i = 0; i<railVehicles.size(); i++){
            if (railVehicles.get(i).getID()==id){
                return railVehicles.get(i);
            }
        }
        return null;
    }
    public boolean deleteRailVehicle(int id){
        for (int i = 0; i< railVehicles.size(); i++){
            if (railVehicles.get(i).getID()== id){
                railVehicles.remove(i);
                return true;
            }
        }
        return false;
    }
    public void addLokomotive(Lokomotive lokomotive){
        for (int i = 0; i< railVehicles.size(); i++){
            if (railVehicles.get(i).getID()== lokomotive.getID()){
                return;
            }
        }
        railVehicles.add((Lokomotive)lokomotive);
    }
    public void addWagon(Wagon wagon){
        for (int i = 0; i< railVehicles.size(); i++){
            if (railVehicles.get(i).getID()== wagon.getID()){
                return;
            }
        }
        railVehicles.add((Wagon)wagon);
    }

    int getNextId(){
        nextId++;
        return nextId;
    }

    public void printAllvehicles(){
        if (railVehicles.isEmpty()){
            System.out.println("There are no RVs in warehouse.");
            return;
        }
        for (int i = 0; i< railVehicles.size(); i++){
            railVehicles.get(i).printInfo();
        }
    }
}
