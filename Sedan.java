import java.util.Scanner;

public class Sedan extends Car {
    private String type,use,peoplenum;
    Scanner scn = new Scanner(System.in);
    public Sedan(){
        String newtype,newuse,newpeoplenum;
        System.out.print("type:");
        newtype = scn.nextLine();
        settype(newtype);

        System.out.print("use:");
        newuse = scn.nextLine();
        setuse(newuse);

        System.out.print("peoplenum:");
        newpeoplenum = scn.nextLine();
        setpeoplenum(newpeoplenum);
    }

    public void showinfo(){
        System.out.println("Sedan");
        System.out.println("color:" + getcolor());
        System.out.println("capacity:" + getcapacity());
        System.out.println("powertype:" + getpowertype());
        System.out.println("weight:" + getweight());
        System.out.println("displacement:" + getdisplacement());
        System.out.println("year:" + getyear());
        System.out.println("type:" + gettype());
        System.out.println("use:" + getuse() + "\n");
    }

    public void settype(String newtype){
        this.type = newtype;
    }
    public String gettype(){
        return this.type;
    }

    public void setuse(String newuse){
        this.use = newuse;
    }
    public String getuse(){
        return this.use;
    }

    public void setpeoplenum(String newpeoplenum){
        this.peoplenum = newpeoplenum;
    }
    public String getpeoplenum(){
       return this.peoplenum;
    }
}