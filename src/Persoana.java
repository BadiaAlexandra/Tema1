import java.time.LocalDateTime;
import java.util.ArrayList;

public class Persoana {

     private long id;   //primitiva
     private String nume;   //string
     private String prenume;   //string
     private LocalDateTime dataNasterii;   //obiect
     private ArrayList<String> adrese;     //obiect
     private Firma angajator;    //obiect de tip firma, datele angajatorului

     // getters and setters
     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getNume() {
          return nume;
     }

     public void setNume(String nume) {
          this.nume = nume;
     }

     public String getPrenume() {
          return prenume;
     }

     public void setPrenume(String prenume) {
          this.prenume = prenume;
     }

     public LocalDateTime getDataNasterii() {
          return dataNasterii;
     }

     public void setDataNasterii(LocalDateTime dataNasterii) {
          this.dataNasterii = dataNasterii;
     }

     public ArrayList<String> getAdrese() {
          return adrese;
     }

     public void setAdrese(ArrayList<String> adrese) {
          this.adrese = adrese;
     }

     public void addAdresa(String adresaNoua) {
          this.adrese.add(adresaNoua);
     }

     public Firma getAngajator() {
          return angajator;
     }

     public void setAngajator(Firma angajator) {
          this.angajator = angajator;
     }

     //constructor default
     public Persoana() {
          id = 0;
          nume = prenume = null;
          dataNasterii = null;
          adrese = new ArrayList<String>();
          angajator = null;
     }

     //constructor pentru toate atributele
     public Persoana(long id, String nume, String prenume, LocalDateTime dataNasterii, ArrayList<String> adrese
             , Firma angajator) {
          this.id = id;
          this.nume = nume;
          this.prenume = prenume;
          this.dataNasterii = dataNasterii;
          this.adrese = adrese;
          this.angajator = angajator;
     }

     //toString() suprascris
     @Override
     public String toString() {
          return "Persoana{" +
                  "id=" + id +
                  ", nume='" + nume + '\'' +
                  ", prenume='" + prenume + '\'' +
                  ", dataNasterii=" + dataNasterii +
                  ", adrese=" + adrese +
                  ", angajator=" + angajator +
                  '}';
     }
}
