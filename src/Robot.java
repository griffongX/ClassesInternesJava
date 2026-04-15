public class Robot {
    private String nom;
    private boolean allume = false;
    private int energie;
    private Bras bras;

    public Robot(String nom, int energie) {
        this.nom = nom;
        this.energie = Math.max(0, Math.min(100, energie));
        this.bras = new Bras();
    }
    public void allumer() {
        allume = true;
    }
    public void eteindre() {
        allume = false;
    }
    public Bras getBras() {
        return bras;
    }

    public class Bras {

        public void saisir(String objet) {
            if (allume && energie > 20) {
                System.out.println(nom + " " + "est allumé");
                energie = Math.max(0, energie -10);
            }
        }
        public void deposer(String objet) {
            if (allume) {
                System.out.println(nom + " " + "est allumé");
                energie = Math.max(0, energie -5);
            }
        }
        public void afficherEtat() {
            System.out.println ("Nom : " + nom);
            System.out.println ("Etat : " + (allume));
            System.out.println ("Energie : " + energie);
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Mim", 50);

        robot.allumer();
        robot.getBras().saisir("box");
        robot.getBras().deposer("box");
        robot.getBras().afficherEtat();
    }
}
