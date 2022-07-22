import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainTema1 {

    public static void main(String[] args)
    {
        // constructor default
        Persoana p1 = new Persoana();
        p1.setNume("pop");
        p1.setAngajator(new Firma("Garfield", 123, "Cluj")); //construit direct
        System.out.println("p1: " + p1);

        // obiect ajutator la construit p1
        ArrayList<String> adrese = new ArrayList<String>();
        adrese.add("Ploiesti nr 8");

        // obiect ajutator - Firma, folosim la setat angajotorul, dar il putem folosi si separat
        Firma f1 = new Firma();
        f1.setDenumire("IBM");
        f1.setCodFiscal(123);
        f1.setSediu("Brasov");

        // constructor cu parametrii
        Persoana p2 = new Persoana(1245, "Marin", "Ioana"
                , LocalDateTime.of(2001, 6,15,0,0), adrese, f1);
        System.out.println("p2: " + p2);
        p2.addAdresa("Brasov nr 7");   //adaugat adresa noua
        System.out.println("p2 nou: " + p2);

        // firma noua
        Firma f2 = new Firma("Bitdefender", 1234, "Bucuresti");

        p2.setAngajator(f2);
        System.out.println("p2 angajator nou: " + p2);

        // constructor cu parametrii
        Utilizator u1 = new Utilizator(1245, "Marin", "Ioana"
                , LocalDateTime.of(2001, 6,15,0,0), adrese
                , "maria@yahoo.com", "maria07", LocalDateTime.of(2022, 7,15,17,12), f1);
        System.out.println("u1: " + u1);

        u1.setEmail("ioana@yahoo.com");  //modificam emailul
        u1.setPrenume("Ioana Cristina");   //modificam prenumele
        System.out.println("u1 modificat: " + u1);

        String email = u1.getEmail();   //cerem emailul
        System.out.println("Emailul utilizatorului: " + email);

        Utilizator u2;

        u2 = u1; // nu se creeaza obiect nou, amandoua fac ref la acelasi utilizator
        u2.setEmail("u2@gmail.com");

        System.out.println("u1 final: " + u1);
        System.out.println("u2 final: " + u2);
    }

}
