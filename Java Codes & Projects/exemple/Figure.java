abstract class Figure

{
 /*   Figure(){
        System.out.println("Appel au constructeur de Figure");
    }
   */ 
   
   Figure(int a, int b)
    {
    }
    
    Figure(int p){

        System.out.println("Appel au constructeur de "+getClass()+" avec param."+p);
    }
    private int nbcotes;
    protected int surface;
    public int getNbcotes(){return nbcotes;}
    public void setNbcotes(int p){this.nbcotes=p;}
    
    abstract int calcSurface();
    abstract int calcPerimetre();
    
    public int getSurface(){return surface;}
};
