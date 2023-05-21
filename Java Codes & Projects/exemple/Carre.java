public class Carre extends Figure
{
    private int lon;
    
    
    Carre(int k)
    {
        super(k,2*k);
        System.out.println("Appel au constructeur de "+ getClass());
        setLon(k);
        //lon=k;
    }
    
    
    int getLon()
    {return lon;}
    
    void setLon(int l)
    {
        this.lon=l;
        calcSurface();
    }
    
    public int calcSurface(){
        this.surface=lon*lon;
        return lon*lon;
    }
    public int calcPerimetre()
    {return 4*lon;}
};
