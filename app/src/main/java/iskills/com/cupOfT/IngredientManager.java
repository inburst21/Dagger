package iskills.com.cupOfT;

import java.util.ArrayList;
import java.util.LinkedList;

import iskills.com.cupOfT.liquids.Milk;
import iskills.com.cupOfT.liquids.Tea;
import iskills.com.cupOfT.models.Box;
import iskills.com.cupOfT.models.Empty;

/**
 * lennyhicks
 * 5/7/18
 */
class IngredientManager{

    //TODO Step 6 change to a list of the new Box class
    private LinkedList<Box> ingredientList = new LinkedList<>();

    //TODO Step 7 Use the addSelection method with the same arguments
    IngredientManager(){
        //BELOW

        addSelection(new Box<>(new Empty()));
        addSelection(new Box<>(new Milk()));
        addSelection(new Box<>(new Tea()));

        //Maybe show two ways

        Box<Milk> milkBox = new Box<>(new Milk());
//        milkBox.getContent().milk();  TODO REMOVE Possible lesson about this way also.
        Box teaBox = new Box<>(new Tea());
        addSelection(milkBox);
        addSelection(teaBox);
        addSelection(new Box<>(new Reminder()));
        //TODO REMOVE_LATER ABOVE && UNCOMMENT BELOW
//        ingredientList.add(new Remove());  -  This would be the point a developer would come across trying to extend everything
//        ingredientList.add(new Milk());
//        ingredientList.add(new Tea());
    }

    //TODO Step 8 - For steps 8-10 update arguments to use Box
    private LinkedList<Box> getIngredientList() {
        return ingredientList;
    }

    //TODO Step 8
    public ArrayList<String> getIngredientNames() {
            ArrayList<String> ingredientNames = new ArrayList<>();
            for (Box ingredient : getIngredientList()) {
                ingredientNames.add(ingredient.getName());
            }
            return ingredientNames;

    }

    //TODO Step 10
    public Box getIngredient(int position){
        return ingredientList.get(position);
    }

    //TODO Step 11 - Uncomment
    private void addSelection(Box ingredient){
        ingredientList.add(ingredient);
    }
}
