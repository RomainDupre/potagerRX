package src.ListeLegumes;

import src.Croissance.Croissance;
import src.LegumeModele.Legumes;

import java.io.IOException;

public class Oranges extends Legumes {


    public Croissance croissance = new Croissance(75, 50, 25, 10, 5);
    public Oranges() throws IOException {
        super(new Croissance(75, 25, 100, 40, 15));
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
        return "Orange";
    }
}
