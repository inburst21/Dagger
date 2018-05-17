package iskills.com.cupOfT;

import java.util.ArrayList;
import java.util.LinkedList;

import iskills.com.cupOfT.liquids.Coffee;
import iskills.com.cupOfT.liquids.Tea;
import iskills.com.cupOfT.models.Box;
import iskills.com.cupOfT.models.Empty;

/**
 * lennyhicks
 * 5/7/18
 */
public class IngredientManager{

    private LinkedList<Box> ingredientList = new LinkedList<>();

    public IngredientManager(){
        addSelection(new Box<>(new Empty()));
        addSelection(new Box<>(new Coffee()));
        addSelection(new Box<>(new Tea()));
    }

    private LinkedList<Box> getIngredientList() {
        return ingredientList;
    }

    public ArrayList<String> getIngredientNames() {
            ArrayList<String> ingredientNames = new ArrayList<>();
            for (Box ingredient : getIngredientList()) {
                ingredientNames.add(ingredient.getName());
            }
            return ingredientNames;

    }

    public Box getIngredient(int position){
        return ingredientList.get(position);
    }

    private void addSelection(Box ingredient){
        ingredientList.add(ingredient);
    }
}
