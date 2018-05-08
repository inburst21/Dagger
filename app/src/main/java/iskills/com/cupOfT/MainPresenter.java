package iskills.com.cupOfT;

import java.util.ArrayList;

import iskills.com.cupOfT.liquids.Liquid;
import iskills.com.cupOfT.models.Cup;
import iskills.com.cupOfT.models.CupState;
import iskills.com.cupOfT.models.Empty;

/** lennyhicks 5/7/18 */
class MainPresenter {

  private MainView mainView;
  private Cup cup = new Cup();
  private IngredientManager ingredientManager = new IngredientManager();

  MainPresenter() {}

  void init(MainView mainView) {
    this.mainView = mainView;
  }

  private void addLiquid(Liquid liquid) {
    cup.fillWith(liquid);
  }

  private void updateCupState(CupState state) {
    mainView.updateLiquidColor(state.color());
  }

  public ArrayList<String> getIngredients() {
    return ingredientManager.getIngredientNames();
  }

  // TODO Step 8 add support for CupState to account for Empty
  public void selectIngredient(int ingredientPosition) {

    // BELOW
    if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof Empty) {
      cup.empty();
    }

    if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof CupState) {
      updateCupState((CupState) ingredientManager.getIngredient(ingredientPosition).getContent());
    } else

    // TODO REMOVE_LATER ABOVE && .getContent for use of Boxes

        if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof Liquid) {
          addLiquid((Liquid) ingredientManager.getIngredient(ingredientPosition).getContent());
        } else
    {
      cup.add(ingredientManager.getIngredient(ingredientPosition).getContent());
    }
  }
}
