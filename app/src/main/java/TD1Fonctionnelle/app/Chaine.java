package TD1Fonctionnelle.app;

public class Chaine {
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
}
