package TD1Fonctionnelle.app.arbres;
import java.util.Set;
public interface ArbreGeneral<T extends Sommable<T>> {
    int taille();
    boolean contient(int val);

    boolean contient(T val);

    Set<T> valeurs();

    T somme();
}
