package TD1Fonctionnelle.app;

import TD1Fonctionnelle.app.arbres.Sommable;

public class Entier implements Sommable<Entier>, Comparable<Entier> {
    private int val;
    Entier(final int  val)
    {
        this.val = val ;
    }
    public int GetVal()
    {
        return val;
    }
    public boolean equals(Entier e1)
    {
        if(e1==null)return false;
        if(val == e1.GetVal())return true;
        return false;
    }

    @Override
    public Entier sommer(Entier other) {
        return new Entier(this.val + other.GetVal());
    }

    @Override
    public int compareTo(Entier o) {
        return 1;
    }
}
