package src.ListeLegumes;

import src.Croissance.Croissance;
import src.LegumeModele.Legumes;

import java.io.IOException;

public class Tomates extends Legumes {
    public Tomates() throws IOException {
        super(new Croissance(75, 40, 75, 50, 10));

    }

    @Override
    public void pousser(float water, float sun) {
        croissance.updateCroissance(water, sun);
    }

    @Override
    public String getLabel() {
        return "Tomate";
    }

    public int getCroissance() {
        return croissance.getCroissance();
    }
}
