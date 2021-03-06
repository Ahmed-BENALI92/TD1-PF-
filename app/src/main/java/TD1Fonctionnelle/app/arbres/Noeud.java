package TD1Fonctionnelle.app.arbres;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable<T>> implements ArbreGeneral<T> {

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

    public T somme()
    {
        int i;
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        T v= fils.get(0).somme();
        for (i=1; i<fils.size(); i++)
        {
            v=v.sommer(fils.get(i).somme());
        }
        return v;
    }

    @Override
    public T min() {
        int i;
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        int s;
        T v= fils.get(0).min();
        for (i=1; i<fils.size(); i++)
        {
            s=i-1;
            if(fils.get(s).min().compareTo(fils.get(i).min()) == 1 )
            {
                v= fils.get(i).min();
            }
        }
        return v;
    }

    @Override
    public T max() {
        int i;
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        int s;
        T v= fils.get(0).min();
        for (i=1; i<fils.size(); i++)
        {
            s=i-1;
            if(fils.get(s).min().compareTo(fils.get(i).min()) == 1 )
            {
                v= fils.get(i).min();
            }
        }
        return v;
    }

    @Override
    public boolean estTrie() {
        return false;
    }


    /**
     * un noeud de fils f1 ... fi ... fn est tri?? ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est tri??</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */

    
}