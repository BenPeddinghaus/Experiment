public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public void frageStellen(Dozierender doz, String frage) {
        System.out.println("Studierende/r " + name + " fragt: " + frage);
        doz.frageBeantworten(this, frage);
    }

    public void sprechstundeAnfragen(Dozierender doz, String termin) {
        System.out.println("Anfrage für Sprechstunde am " + termin + " an " + doz.getName());
    }

    public String getName() {
        return name;
    }
}