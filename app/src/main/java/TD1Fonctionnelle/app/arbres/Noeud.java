package TD1Fonctionnelle.app.arbres;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T> implements ArbreGeneral<T> {

    private final List<ArbreGeneral<T>> fils;

    public Noeud(final List<ArbreGeneral<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final ArbreGeneral<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }


   @Override
   public boolean contient(final int val) {
        boolean rtr = false;
        for (final ArbreGeneral<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public boolean contient(T val) {
        return true;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final ArbreGeneral<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }









    /**
     * un noeud de fils f1 ... fi ... fn est trié ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est trié</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */

    
}