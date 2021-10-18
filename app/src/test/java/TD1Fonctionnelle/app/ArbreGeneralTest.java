package TD1Fonctionnelle.app;

import TD1Fonctionnelle.app.arbres.Arbre;
import TD1Fonctionnelle.app.arbres.ArbreGeneral;
import TD1Fonctionnelle.app.arbres.Feuille;
import TD1Fonctionnelle.app.arbres.Noeud;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArbreGeneralTest {



    public static final ArbreGeneral<Entier> arbre1() {
        final ArbreGeneral<Entier> f1 = new Feuille<>(Entier(3));
        final ArbreGeneral<Entier> f2 = new Feuille<>(Entier(5));
        final ArbreGeneral <Entier> n1 = new Noeud(List.of(f1,f2));
        final ArbreGeneral<Entier> f3 = new Feuille<>(Entier(21));
        final ArbreGeneral <Entier> n2 = new Noeud(List.of(n1,f3));
        return n2;
    }



    @Test
    public void testSize() {

        assertEquals(3, arbre1().taille());
    }

    @Test public void testContient() {
        assertTrue(arbre1().contient(1));
        assertTrue(arbre1().contient(2));
        assertTrue(arbre1().contient(3));
        assertFalse(arbre1().contient(4));
    }

    @Test public void testValeurs() {
        final Set<Integer> contenu = Set.of(1,2,3);
        assertEquals(contenu, arbre1().valeurs());
    }


    @Test public void TestTaille()
    {
        ArbreGeneral<Entier> v = new Feuille(new Entier(4));
        assertEquals(v.taille(),1);
        ArbreGeneral<Entier> v2 = new Feuille(new Entier(2));
        assertEquals(v.taille(),1);

    }
}
