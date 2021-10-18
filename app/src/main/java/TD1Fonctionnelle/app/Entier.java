package TD1Fonctionnelle.app;

public class Entier {
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
}
