package BattleTests;
import MedievalBattles.*;

import org.junit.*;
import static org.junit.Assert.*;

public class BattleTest{
    private Knight kn1;
    private FireMage fm1;
    private Priest p1;
    private IceGolem ig1;
    private Goblin gob1;
    private Undead ud1;
    private FruitTree ft;
    private Rock r;

    @Before public void testSetup(){
        kn1 = new Knight(10,200,"God Emperor Trump");
        fm1 = new FireMage(5,60,"Bin Laden");
        p1 = new Priest(4,50,"Karadima");
        ig1 = new IceGolem(7,150);
        gob1 = new Goblin(2,100);
        ud1 = new Undead(10,70);
        ft = new FruitTree();
        r = new Rock();
    }

    @Test public void testAttackable(){
        //Test no overheal
        kn1.attack(ft);
        assertEquals(kn1.getHP(), kn1.getMaxHP());

        //Leave all at 10 HP
        kn1.hurt(190);
        fm1.hurt(50);
        p1.hurt(40);
        gob1.hurt(90);
        ig1.hurt(140);
        ud1.hurt(60);

        assertTrue(kn1.getHP() == 10);

        kn1.attack(ft);
        fm1.attack(ft);
        p1.attack(ft);
        gob1.attack(ft);
        ig1.attack(ft);
        ud1.attack(ft);

        assertTrue(kn1.getHP() == 70);
        assertTrue(fm1.getHP() == 28);
        assertTrue(p1.getHP() == 25);
        assertTrue(gob1.getHP() == 25);
        assertTrue(ig1.getHP() == 10);
        assertTrue(ud1.getHP() == 10);

        kn1.attack(r);
        fm1.attack(r);
        p1.attack(r);
        gob1.attack(r);
        ig1.attack(r);
        ud1.attack(r);

        assertTrue(kn1.getHP() == 60);
        assertTrue(fm1.getHP() == 23);
        assertTrue(p1.getHP() == 21);
        assertTrue(gob1.getHP() == 25);
        assertTrue(ig1.getHP() == 10);
        assertTrue(ud1.getHP() == 10);
    }

    @Test public void testAllAttacker(){
        kn1.attack(ud1);
        assertTrue(ud1.getHP() == 60);

        fm1.attack(ig1);
        assertTrue(ig1.getHP() == 125);

        p1.attack(kn1);
        assertEquals(kn1.getHP(), kn1.getMaxHP()); //Deals 0 damage

        ig1.attack(fm1);
        assertTrue(fm1.getHP() == 46);

        ud1.attack(gob1);
        assertTrue(gob1.getHP() == 90);

        gob1.attack(p1);
        assertTrue(p1.getHP() == 48);

        Goblin gob2 = new Goblin(10, 10);
        gob1.attack(gob2);
        assertEquals(gob2.getHP(), gob2.getMaxHP());
        ig1.attack(gob2);
        assertEquals(gob2.getHP(), 0);
        ig1.attack(gob2);
        assertEquals(gob2.getHP(), 0);
        gob2.attack(ig1);
        assertEquals(ig1.getHP(), 125); //No damage from dead enemies
    }

    @Test public void testPriest(){
        p1.attack(kn1);
        p1.attack(fm1);
        p1.attack(new Priest(10, 100, "Bob"));
        p1.attack(gob1);
        p1.attack(ig1);
        p1.attack(ud1);
        assertEquals(kn1.getHP(), kn1.getMaxHP());
        assertEquals(ud1.getHP(), 50);
    }

    @Test public void testUndead(){
        ud1.attack(kn1);
        ud1.attack(fm1);
        ud1.attack(p1);
        ud1.attack(ig1);
        ud1.attack(gob1);
        ud1.attack(new Undead(10, 10));
        assertEquals(ig1.getHP(), ig1.getMaxHP());
        assertEquals(kn1.getHP(), 190);
    }

    @Test public void testGoblin(){
        gob1.attack(kn1);
        gob1.attack(fm1);
        gob1.attack(p1);
        gob1.attack(ig1);
        gob1.attack(ud1);
        gob1.attack(new Goblin(10, 10));
        assertEquals(ig1.getHP(), ig1.getMaxHP());
        assertEquals(p1.getHP(), 48);
    }

    @Test public void testFiremage(){
        fm1.attack(kn1);
        fm1.attack(new FireMage(10, 30, "Rick"));
        fm1.attack(p1);
        fm1.attack(ig1);
        fm1.attack(ud1);
        fm1.attack(gob1);
        assertEquals(ig1.getHP(), 125);
        assertEquals(p1.getHP(), 40);
    }

    @Test public void testIceGolem(){
        ig1.attack(kn1);
        ig1.attack(fm1);
        ig1.attack(p1);
        ig1.attack(new IceGolem(10, 100));
        ig1.attack(ud1);
        ig1.attack(new Goblin(10, 10));
        assertEquals(fm1.getHP(), 46);
    }

    @Test public void testNames(){
        String karam = "Karadima";
        assertFalse(kn1.getName().equals(karam));
        assertEquals(p1.getName(), karam);
        assertFalse(kn1.getName().equals(fm1.getName()));
    }
}
