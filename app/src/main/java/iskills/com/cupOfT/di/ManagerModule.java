package iskills.com.cupOfT.di;

import dagger.Module;
import dagger.Provides;
import iskills.com.cupOfT.IngredientManager;

/**
 * lennyhicks
 * 5/8/18
 */
//TODO Step ?? Make a provides method for our IngredientManager
    @Module
public class ManagerModule {
    //TODO REMOVE BELOW
    @Provides
    IngredientManager ingredientManager(){
        return new IngredientManager();
    }
    //TODO REMOVE ABOVE
}
