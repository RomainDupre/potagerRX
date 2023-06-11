/*
 * To change this template, choose src.Tools | Templates
 * and open the template in the editor.
 */
package src.Case;

import src.LegumeModele.Legumes;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author frederic
 */
public class Case extends JLabel implements Observer, java.io.Serializable {
    public int x;
    public int y;
    public Legumes legume;

    public float humidity = 0;

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void arroser() {
        this.humidity = 100;
    }
    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        setOpaque(true);
    }

    public Legumes getLegume() {
        return this.legume;
    }

    public Case(int x, int y, Legumes legume) {
        //this.x = x;
        //this.y = y;
        this(x, y);
        this.legume = legume;

    }
    public int getCroissance() {
        if (legume != null) {
            return legume.getCroissance();
        }
        return 0;
    }

    public void healLegume() {
        if (legume != null) {
            legume.setMaladie(null);
        }
    }

    public boolean hasLegume() {
        return legume != null;
    }

    public void setLabel(String s) {
        this.add(new JLabel(s));
    }
    public void plantLegume(Legumes legume) {
        this.legume = legume;
    }

    public void harvestLegume() {
        this.legume = null;
    }

    public void grow(float sun) {
        if (legume != null) {
            legume.pousser(humidity, sun);
            this.humidity -= this.legume.croissance.waterConsumption;
        }
    }
    @Override
    public void update(Observable o, Object arg) {

    }
}
