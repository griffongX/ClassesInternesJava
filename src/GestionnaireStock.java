import java.util.ArrayList;
import java.util.List;

public class GestionnaireStock {
    private List<Produit> stock;

    public GestionnaireStock() {
        stock = new ArrayList<>();
    }
    public List<Produit> filtrerEtTrier(String categorie, double prixMax, int quantiteMin) {
        interface Filtre {
            boolean accepter(Produit p);
        }
        class FiltreCompose implements Filtre {
            @Override
            public boolean accepter(Produit p) {
                return p.getCategorie().equalsIgnoreCase(categorie)

            }
        }
    }
}
