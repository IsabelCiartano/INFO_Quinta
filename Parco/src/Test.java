public class Test {
    static void main(String[] args) {
try{
    Pedestre p=new Pedestre("lago",10,Tipo_difficolta.INTERMEDIO,100);
    Visita v=new Visita("24/7/26","mario rossi",p);
    Area a=new Area("lago",200);
    Animale an1=new Animale("trota","Salmo trutta","pesce",Stato.NT);
    Animale an2=new Animale("capriolo","Capriolus capreolus","mammifero",Stato.EN);
    a.addAnimale(an1);
    a.addAnimale(an2);

    p.addArea(a);
    Persona p1=new Persona("luca","334453355432","italiano,inglese");
    Persona p2=new Persona("andrea","587487539654736","inglese,italiano");
    Persona p3=new Persona("Anne","43792638647658210","inglese,tedesco");
    Persona p4=new Persona("nicole","20492342345354","italiano,inglese,francese");

    v.addPersone(p1);
    v.addPersone(p2);
    v.addPersone(p3);
    v.addPersone(p4);

    System.out.println(a);
    System.out.println(p);
    System.out.println(v);
} catch (Errore e) {
    throw new RuntimeException(e);
}
    }
}
