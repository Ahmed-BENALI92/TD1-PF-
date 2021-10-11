package TD1Fonctionnelle.app;

public class Paire {
    
    private Object x;
    private Object y;

    public Paire(Object x, Object y)
    {
        this.x = x;
        this.y = y;
    }

    public Object fst()
    {
        return x;
    }

    public Object snd()
    {
        return y;
    }

    public void changeFst(Object x)
    {
        this.x = x;
    }

    public void changeSnd(Object y)
    {
        this.y = y;
    }

    
    public String toString()
    {
        return "(" + x ;
        
    }
    
}
