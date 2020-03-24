import java.util.Scanner;

public class Truck extends Car{
    private String goodscapacity,tairsnum;
    Scanner scn = new Scanner(System.in);
    public Truck(){
        String newgoodscapacity,newtairsnum;

        System.out.print("goodscapacity:");
        newgoodscapacity = scn.nextLine();
        setgoodscapacity(newgoodscapacity);

        System.out.print("tairsnum:");
        newtairsnum = scn.nextLine();
        settairsnum(newtairsnum);
    }

    public void showinfo(){
        System.out.println("truck");
        System.out.println("color:" + getcolor());
        System.out.println("capacity:" + getcapacity());
        System.out.println("powertype:" + getpowertype());
        System.out.println("weight:" + getweight());
        System.out.println("displacement:" + getdisplacement());
        System.out.println("year:" + getyear());
        System.out.println("goodscapacity:" + getgoodscapacity());
        System.out.println("tairsnum:" + gettairsnum() + "\n");
    }

    public void setgoodscapacity(String newgoodscapacity){
        this.goodscapacity = newgoodscapacity;
    }
    public String getgoodscapacity(){
        return this.goodscapacity;
    }

    public void settairsnum(String newtairnum){
        this.tairsnum = newtairnum;
    }
    public String gettairsnum(){
        return this.tairsnum;
    }
}