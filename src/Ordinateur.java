public final class Ordinateur {
    private final String marque;
    private final String processeur;
    private final int ramGo;
    private final int stockageGo;
    private final boolean ssd;
    private final String carteGraphique;
    private final double prixEuros;

   private Ordinateur(Builder builder) {
       this.marque = builder.marque;
       this.processeur = builder.processeur;
       this.ramGo = builder.ramGo;
       this.stockageGo = builder.stockageGo;
       this.ssd = builder.ssd;
       this.carteGraphique = builder.carteGraphique;
       this.prixEuros = builder.prixEuros;
   }
    public static class Builder {
        private final String marque;
        private final String processeur;
        private final int ramGo;
        private int stockageGo = 256;
        private boolean ssd = true;
        private String carteGraphique = "Integrée";
        private double prixEuros = 0.0;

        public Builder(String marque, String processeur, int ramGo) {
            this.marque = marque;
            this.processeur = processeur;
            this.ramGo = ramGo;
        }
        public Builder stockageGo(int stockageGo) {
            this.stockageGo = stockageGo;
            return this;
        }
        public Builder ssd(boolean ssd) {
            this.ssd = ssd;
            return this;
        }
        public Builder carteGraphique(String carteGraphique) {
            this.carteGraphique = carteGraphique;
            return this;
        }
        public Builder prixEuros(double prixEuros) {
            this.prixEuros = prixEuros;
            return this;
        }
        public Ordinateur build() {
            if (ramGo < 4) {
                throw new IllegalArgumentException("La RAM doit être min 4Go");
            }
            return new Ordinateur(this);
        }

   }
    public static void main(String[] args) {
        Ordinateur pc1 = new Ordinateur.Builder("HP", "Intel i7", 32) .build();

        System.out.println(pc1);
    }
}
