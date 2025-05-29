public class Polaznik {

    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {  // ova metoda je za ispis objekta
        return "Polaznik {" +
                "ime = '" + ime + '\'' +
                ", prezime = '" + prezime + '\'' +
                ", e-mail = '" + email + '\'' +
                '}';
    }
}
