package src.ListeLegumes;

import src.Croissance.Croissance;
import src.LegumeModele.Legumes;

import java.io.IOException;

public class Citrons extends Legumes {
    public Citrons() throws IOException {
        super(new Croissance(50, 15, 100, 50, 5));
    }

    @Override
    public void pousser(float water, float sun) {
        croissance.updateCroissance(water, sun);
    }

    @Override
    public String getLabel() {
        return "Citron";
    }

    public int getCroissance() {
        return croissance.getCroissance();
    }
}
