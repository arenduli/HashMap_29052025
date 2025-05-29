import java.util.*;

public class EvidencijaPolaznika {

    private final Map<String, Polaznik> polaznici = new HashMap<>();

    public void dodavanjePolaznika(String ime, String prezime, String email) {

        if (polaznici.containsKey(email)) {
            System.out.println("Polaznik s tom e-mail adresom već postoji!");
        } else {
            Polaznik polaznik = new Polaznik(ime, prezime, email);
            polaznici.put(email, polaznik);
            System.out.println("Polaznik je dodan!");
        }
    }

    public void ispisiPolaznike() {

        System.out.println("Polaznici na tečaju:");
        polaznici.values().stream()
                .sorted(Comparator.comparing(Polaznik::getEmail))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EvidencijaPolaznika evidencija = new EvidencijaPolaznika();

        while (true) {
            System.out.println("Upišite podatke o polazniku ili sa 0 izađite iz programa:");
            System.out.print("Ime: ");
            String ime = scanner.nextLine();
            if (ime.equalsIgnoreCase("0")) break;

            System.out.print("Prezime: ");
            String prezime = scanner.nextLine();
            if (prezime.equalsIgnoreCase("0")) break;

            System.out.print("E-mail: ");
            String email = scanner.nextLine();
            if (email.equalsIgnoreCase("0")) break;

            evidencija.dodavanjePolaznika(ime, prezime, email);
        }

        evidencija.ispisiPolaznike();
    }
}
