package iskills.com.cupOfT;

import java.util.ArrayList;

import javax.inject.Inject;

import iskills.com.cupOfT.liquids.Liquid;
import iskills.com.cupOfT.models.Cup;
import iskills.com.cupOfT.models.CupState;
import iskills.com.cupOfT.models.Empty;

/** lennyhicks 5/7/18 */
class MainPresenter {

  private MainView mainView;
  private Cup cup = new Cup();
  private final IngredientManager ingredientManager;

  // TODO Step ?? Inject the ingredient manager constructor injection preferred
  @Inject
  MainPresenter(final IngredientManager ingredientManager) {
    this.ingredientManager = ingredientManager;
  }

  protected void init(MainView mainView) {
    this.mainView = mainView;
    this.mainView.renderView(getIngredients());
  }

  private void addLiquid(Liquid liquid) {
    cup.fillWith(liquid);
  }

  private void updateCupState(CupState state) {
    mainView.updateLiquidColor(state.color());
  }

  private ArrayList<String> getIngredients() {
    return ingredientManager.getIngredientNames();
  }

  public void selectIngredient(int ingredientPosition) {
    if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof Empty) {
      cup.empty();
    }

    if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof CupState) {
      updateCupState((CupState) ingredientManager.getIngredient(ingredientPosition).getContent());
    } else if (ingredientManager.getIngredient(ingredientPosition).getContent()
        instanceof Reminder) {
      for (Object box : cup.getIngredients()) {
        mainView.showMessage(box.getClass().getSimpleName());
      }
    } else if (ingredientManager.getIngredient(ingredientPosition).getContent() instanceof Liquid) {
      addLiquid((Liquid) ingredientManager.getIngredient(ingredientPosition).getContent());
    } else {
      cup.add(ingredientManager.getIngredient(ingredientPosition).getContent());
      mainView.showMessage(
          ingredientManager
              .getIngredient(ingredientPosition)
              .getContent()
              .getClass()
              .getSimpleName());
    }
  }
}
