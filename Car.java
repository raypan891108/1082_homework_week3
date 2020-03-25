import java.util.Scanner;

class Car{
    private String color;
	private String capacity;
	private String powertype;
	private String weight;
	private String displacement;
	private String year;
    Scanner scn = new Scanner(System.in);

    public Car() {
        String newcolor,newcapacity,newpowertype,newweight,newdisplacement,newyear;
        System.out.print("color:");
        newcolor = scn.nextLine();
        setcolor(newcolor);
        
        System.out.print("capacity:");
        newcapacity = scn.nextLine();
        setcapacity(newcapacity);

        System.out.print("powertype:");
        newpowertype = scn.nextLine();
        setpowertype(newpowertype);

        System.out.print("weight:");
        newweight = scn.nextLine();
        setweight(newweight);

        System.out.print("displacement:");
        newdisplacement = scn.nextLine();
        setdisplacement(newdisplacement);

        System.out.print("year:");
        newyear = scn.nextLine();
        setyear(newyear);
    }
    
    public void showinfo(){
        System.out.println("color:" + getcolor());
        System.out.println("capacity:" + getcapacity());
        System.out.println("powertype:" + getpowertype());
        System.out.println("weight:" + getweight());
        System.out.println("displacement:" + getdisplacement());
        System.out.println("year:" + getyear());

    }

    public void setcolor(String newcolor) {
        this.color = newcolor;
    }

    public String getcolor() {
        return this.color;
    }

    
    public void setcapacity(String newcapacity){
        this.capacity = newcapacity;
    }
    public String getcapacity(){
        return this.capacity;
    }

    public void setpowertype(String newpowertype){
        this.powertype = newpowertype;
    }
    public String getpowertype(){
        return this.powertype;
    }

    public void setweight(String newweight){
        this.weight = newweight;
    }
    public String getweight(){
        return this.weight;
    }
    
    public void setdisplacement(String newdisplacement){
        this.displacement = newdisplacement;
    }
    public String getdisplacement(){
        return this.displacement;
    }

    public void setyear(String newyear){
        this.year = newyear;
    }
    public String getyear(){
        return this.year;
    }

}