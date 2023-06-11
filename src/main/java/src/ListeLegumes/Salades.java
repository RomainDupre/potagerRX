package src.ListeLegumes;

import src.Croissance.Croissance;
import src.LegumeModele.Legumes;

import java.io.IOException;

public class Salades extends Legumes {
    public Salades() throws IOException {
        super(new Croissance(75, 75, 25, 10, 30));
    }

    @Override
    public void pousser(float water, float sun) {
        croissance.updateCroissance(water, sun);
    }

    public int getCroissance() {
        return croissance.getCroissance();
    }

    @Override
    public String getLabel() {
        return "Salade";
    }
}
