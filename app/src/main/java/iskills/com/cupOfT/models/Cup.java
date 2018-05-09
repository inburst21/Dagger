package iskills.com.cupOfT.models;

import java.util.ArrayList;

/**
 * lennyhicks
 * 5/7/18
 */
public class Cup<T> {
    private ArrayList<T> ingredients = new ArrayList<>();

    public void fillWith(T liq){
        add(liq);
    }

    public void empty(){
        ingredients = new ArrayList<>();
    }

    public void add(T ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList<T> getIngredients() {
        return ingredients;
    }
}
