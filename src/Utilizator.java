import java.time.LocalDateTime;
import java.util.ArrayList;

public class Utilizator extends Persoana{

    private String email;  //string
    private String parola;    //string
    private LocalDateTime dataInregistrarii;   //obiect

    //constructor default
    public Utilizator() {
        super();
        email = null;  //setam parametrii default
        parola = null;
        dataInregistrarii = null;
    }

    //constructor cu parametrii vechi plus cei noi
    public Utilizator(long id, String nume, String prenume, LocalDateTime dataNasterii, ArrayList<String> adrese
            , String email, String parola, LocalDateTime dataInregistrarii, Firma firma) {
        super(id, nume, prenume, dataNasterii, adrese, firma);   //apeleaza construcotrul clasei de baza
        this.email = email;  //pe cele noi le seteaza
        this.parola = parola;
        this.dataInregistrarii = dataInregistrarii;
    }

    //getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public LocalDateTime getDataInregistrarii() {
        return dataInregistrarii;
    }

    public void setDataInregistrarii(LocalDateTime dataInregistrarii) {
        this.dataInregistrarii = dataInregistrarii;
    }

    // toString()
    @Override
    public String toString() {
        return "Utilizator{" +
                "Persoana='" + super.toString() + '\'' +
                "email='" + email + '\'' +
                //", parola='" + parola + '\'' +   - nu afisam parola
                ", dataInregistrarii=" + dataInregistrarii +
                '}';
    }
}
