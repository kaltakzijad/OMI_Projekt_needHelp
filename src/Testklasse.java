import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Testklasse {
    public static void main(String[] args) {
        Lager lager = new Lager();
        System.out.println("[WAREHOUSE RAIL-VEHICLES MANAGEMENT]");
        Scanner in = new Scanner(System.in);
        String cmdString;
        int cmdInt;

        printFirstmenu();
        cmdInt = in.nextInt();
        while(cmdInt!=0){
            switch (cmdInt){
                case 1:
                    lager.printAllvehicles();
                    break;



                case 2:
                    System.out.println("VEHICLE ID: ");
                    try {
                        cmdInt = Integer.parseInt(in.next());
                        if (cmdInt<=lager.getRailVehicles().size() && !(cmdInt < 0) && lager.getRailVehicle(cmdInt)!= null){
                            lager.getRailVehicle(cmdInt).printInfo();
                            int id = cmdInt;
                            System.out.println("1 -> \t EDIT RV");
                            System.out.println("2 -> \t DELETE RV");
                            System.out.println("0 -> \t BACK");
                            cmdInt = in.nextInt();
                            if (cmdInt==1 && Objects.equals(lager.getRailVehicle(id).getType(), "L")){
                                printRvEditMenu();
                                cmdInt = in.nextInt();
                                while (cmdInt!= 0){
                                    switch (cmdInt){
                                        case 1:
                                            System.out.println("New weight: ");
                                            cmdInt = in.nextInt();
                                            lager.getRailVehicle(id).setZulaessigeGesamtgewicht(cmdInt);
                                            break;
                                        case 2:
                                            System.out.println("New power: ");
                                            cmdInt = in.nextInt();
                                            lager.getRailVehicle(id).set;////---------------------------------------
                                    }
                                }
                            }





                        }
                        else {
                            System.out.println("Vehicle with ID ["+cmdInt+"] not found");
                        }
                        break;
                    }catch (NumberFormatException e){
                        System.out.println("INVALID INPUT, ONLY NUMBERS ALLOWED");
                        break;
                    }












                case 3:
                    System.out.println("Add new: ");
                    System.out.println("1 -> \t WAGON");
                    System.out.println("2 -> \t LOKOMOTIVE");
                    cmdInt = in.nextInt();
                    if (cmdInt==1){
                        Wagon wagon = new Wagon(lager.getNextId());
                        System.out.println("Caption: ");
                        cmdString = in.next();
                        wagon.setBeschreibung(in.nextLine()); //should be repaired
                        System.out.println("Allowed weight: ");
                        cmdInt = in.nextInt();
                        wagon.setZulaessigeGesamtgewicht(cmdInt);
                        System.out.println("Seat class: ");
                        cmdInt = in.nextInt();
                        wagon.setSitzKlasse(cmdInt);
                        System.out.println("Number of seats: ");
                        cmdInt = in.nextInt();
                        wagon.setSitzPlatze(cmdInt);

                        lager.addWagon(wagon);
                        System.out.println("Wagon with ID: "+wagon.getID()+" has been added to Warehouse");
                        break;
                    }
                    else if (cmdInt==2){
                        Lokomotive lokomotive = new Lokomotive(lager.getNextId());

                        System.out.println("Caption: ");
                        cmdString = in.next();
                        lokomotive.setBeschreibung(cmdString);//should be repaired
                        System.out.println("Allowed weight: ");
                        cmdInt = in.nextInt();
                        lokomotive.setZulaessigeGesamtgewicht(cmdInt);
                        System.out.println("Power: ");
                        cmdInt = in.nextInt();
                        lokomotive.setLeistung(cmdInt);
                        System.out.println("Tractive effort: ");
                        cmdInt = in.nextInt();
                        lokomotive.setZugKraft_t(cmdInt);
                        System.out.println("Braking force: ");
                        cmdInt = in.nextInt();
                        lokomotive.setBremsKraft_t(cmdInt);

                        lager.addLokomotive(lokomotive);
                        System.out.println("Lokomotive with ID: "+lokomotive.getID()+" has been added to Warehouse");
                        break;
                    }
                case 4:
                    System.out.println("ID of the vehicle you want to remove: ");
                    cmdInt = in.nextInt();
                    if (lager.deleteRailVehicle(cmdInt)){
                        System.out.println("Vehicle with ID: "+cmdInt+" has been removed");
                    }
                default:
                    break;
            }
            printFirstmenu();
            cmdInt = in.nextInt();
        }

    }
    public static void printFirstmenu(){
        System.out.println("WRVM MENU:");
        System.out.println("1 -> \t OPEN ALL AVAILABLE RVS");
        System.out.println("2 -> \t SEARCH FOR RV");
        System.out.println("3 -> \t ADD NEW RV");
        System.out.println("4 -> \t REMOVE RV");
        System.out.println("0 -> \t EXIT");
    }

    public static void printRvEditMenu(){
        System.out.println("EDIT: ");
        System.out.println("1 -> \t WEIGHT");
        System.out.println("2 -> \t POWER");
        System.out.println("3 -> \t TRACTIVE EFFORT");
        System.out.println("4 -> \t BRAKING FORCE");
        System.out.println("5 -> \t CAPTION");
        System.out.println("0 -> \t BACK");
    }
}