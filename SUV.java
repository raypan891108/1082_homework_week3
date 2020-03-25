class SUV extends Car{
    private String maxpower,peoplenum;
    public SUV(){
        super();
        String newmaxpower,newpeoplenum;
        System.out.print("maxpower:");
        newmaxpower = scn.nextLine();
        setmaxpower(newmaxpower);

        System.out.print("peoplenum:");
        newpeoplenum = scn.nextLine();
        setpeoplenum(newpeoplenum);
    }

    public void showinfo(){
        System.out.println("SUV");
        super.showinfo();
        System.out.println("maxpower:" + getmaxpower());
        System.out.println("peoplenum:" + getpeoplenum() + "\n");
    }
    
    public void setpeoplenum(String newpeoplenum){
        this.peoplenum = newpeoplenum;
    }
    public String getpeoplenum(){
       return this.peoplenum;
    }

    public void setmaxpower(String newmaxpower){
        this.maxpower = newmaxpower;
    }
    public String getmaxpower(){
       return this.maxpower;
    }
}