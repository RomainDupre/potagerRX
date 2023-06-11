package src.ListeLegumes;

import src.Croissance.Croissance;
import src.LegumeModele.Legumes;

import java.io.IOException;

public class Betteraves extends Legumes {

    public Betteraves() throws IOException {
        super(new Croissance(80, 60, 50, 10, 25));
    }
    public void pousser(float water, float sun) {
        croissance.updateCroissance(water, sun);
    }

    @Override
    public String getLabel() {
        return "Betterave";
    }
    public float getConsumption() {
        return croissance.waterConsumption;
    }

    public int getCroissance() {
        return croissance.getCroissance();
    }

}
