package TD1Fonctionnelle.app.arbres;

import java.util.Set;

public class Feuille<T> implements ArbreGeneral<T> {

    private final T valeur;

    public Feuille(final T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(int val) {
        return true;
    }


    @Override
    public boolean contient(final T val) {
        return val.equals(valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }


    public T somme() {
        return valeur;
    }

    public T min() {
        return valeur;
    }


    public T max() {
        return valeur;
    }

    /**
     * une feuille est toujours triée.
     */

    public boolean estTrie() {
        return true;
    }
    
}