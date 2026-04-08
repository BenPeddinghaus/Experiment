public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public void frageBeantworten(Studierender studi, String frage) {
        System.out.println("Dozent " + name + " antwortet " + studi.getName() + " auf: " + frage);
    }

    public void feedbackErhalten(String feedback) {
        System.out.println("Feedback erhalten: " + feedback);
    }

    public String getName() {
        return name;
    }
}
