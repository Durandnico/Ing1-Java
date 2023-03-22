package Exercice_Poste;

public class Lettre extends Courrier{
    enum format {
        A5,
        A4,
        A3
    };

    private format format;

    public Lettre(String destinataire, double poids, eType mode, format format) {
        super(destinataire, poids, mode);
        this.format = format;
    }

    public format getFormat() {
        return format;
    }

    public void setFormat(format format) {
        this.format = format;
    }

    public String getFormatString() {
        switch (getFormat()) {
            case A3:
                return "A3";
            case A4:
                return "A4";
            case A5:
                return "A5";
            default:
                return "N/A";
        }
    }

    @Override
    public void afficher() {
        System.out.println("Lettre");
        super.afficher();
        System.out.println("Format : " + getFormatString() + "\n");
    }

    @Override
    public double getTarif() {
        double tarif = (getFormat() == format.A4) ? 2.5 : 3.5;
        return (tarif + getPoids() / 1000 ) * (getMode() == eType.EXPRESS ? 2 : 1) ;
    }

}
