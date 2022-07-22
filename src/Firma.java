public class Firma {

    private String denumire;
    private int codFiscal;
    private String sediu;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getCodFiscal() {
        return codFiscal;
    }

    public void setCodFiscal(int codFiscal) {
        this.codFiscal = codFiscal;
    }

    public String getSediu() {
        return sediu;
    }

    public void setSediu(String sediu) {
        this.sediu = sediu;
    }

    public Firma() {
        denumire = null;
        codFiscal = 0;
        sediu = null;
    }

    public Firma(String denumire, int codFiscal, String sediu) {
        this.denumire = denumire;
        this.codFiscal = codFiscal;
        this.sediu = sediu;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "denumire='" + denumire + '\'' +
                ", codFiscal=" + codFiscal +
                ", sediu='" + sediu + '\'' +
                '}';
    }
}
