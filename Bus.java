import java.util.Scanner;

public class Bus extends Car {
    private String peoplenum,doornum,company;
    Scanner scn = new Scanner(System.in);

    public Bus(){
        String newpeoplenum,newdoornum,newcompany;

        System.out.print("peoplenum:");
        newpeoplenum = scn.nextLine();
        setpeoplenum(newpeoplenum);

        System.out.print("doornum:");
        newdoornum = scn.nextLine();
        setdoornum(newdoornum);

        System.out.print("company");
        newcompany = scn.nextLine();
        setcompany(newcompany);
    }

    public void showinfo(){
        System.out.println("bus");
        System.out.println("color:" + getcolor());
        System.out.println("capacity:" + getcapacity());
        System.out.println("powertype:" + getpowertype());
        System.out.println("weight:" + getweight());
        System.out.println("displacement:" + getdisplacement());
        System.out.println("year:" + getyear());
        System.out.println("peoplenum:" + getpeoplenum());
        System.out.println("doornum:" + getdoornum());
        System.out.println("company:" + getcompany() + "\n");
    }

    public void setpeoplenum(String newpeoplenum){
        this.peoplenum = newpeoplenum;
    }
    public String getpeoplenum(){
       return this.peoplenum;
    }

    public void setdoornum(String newdoornum){
        this.doornum = newdoornum;
    }
    public String getdoornum(){
       return this.doornum;
    }

    public void setcompany(String newcompany){
        this.company = newcompany;
    }
    public String getcompany(){
       return this.company;
    }
}