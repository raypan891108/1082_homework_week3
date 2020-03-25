import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<Car>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            menu();
            String operation = scn.nextLine();
            switch (operation) {
                case "1":
                    carlist.add(new Truck());
                    break;
                case "2":
                    carlist.add(new Bus());
                    break;
                case "3":
                    carlist.add(new Sedan());
                    break;
                case "4":
                    carlist.add(new SUV());
                    break;
                case "5":
                System.out.println(carlist.size());
                    for(int i=0;i<carlist.size();i++){
                        carlist.get(i).showinfo();
                    }
                    break;
                case "6":
                    bool = false;
                    break;
                default:
                    System.out.println("error!!!");
                    break;
            }
        }
        
    }

    public static void menu(){
        System.out.println("1.Truck");
        System.out.println("2.Bus");
        System.out.println("3.Sedan");
        System.out.println("4.SUV");
        System.out.println("5.showinfo");
        System.out.println("6.End");
        System.out.print("operation:");
    }
}