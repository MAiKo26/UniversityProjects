import java.util.Scanner;
class Exemple
{

public static void main (String args[]){
    System.out.println("ceci est un programme. Les arguments sont:");
    Scanner in=new Scanner(System.in);
    int valeur;
    System.out.println("Donner une valeur:");
    valeur=in.nextInt();
    System.out.println("la  valeur est:" +valeur);

    Objet o1=new Objet();
    o1.setX(4);
    o1.setY(8);
    Objet o2=o1;
    o1.setX(789);
    System.out.println("o2.x="+o2.getX());
    if(o1==o2)
        System.out.println("même objet");
    else
        System.out.println("objets différents");
    }
}
