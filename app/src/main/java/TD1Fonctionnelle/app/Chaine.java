package TD1Fonctionnelle.app;

import TD1Fonctionnelle.app.arbres.Sommable;

public class Chaine implements Sommable<Chaine> {
    public String val;

    Chaine(final String  val )
    {
        this.val = val ;
    }
    public String GetVal()
    {
        return val;
    }
    public boolean equals(Chaine c1)
    {
        if(val == c1.GetVal())return true;
        return false;
    }

    @Override
    public Chaine sommer(Chaine other) {
        return new Chaine(this.val.concat(other.val));
    }
}
