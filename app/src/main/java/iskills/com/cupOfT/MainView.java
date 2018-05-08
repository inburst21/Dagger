package iskills.com.cupOfT;

import java.util.List;

/**
 * lennyhicks
 * 5/7/18
 */
interface MainView {
    void renderView(List<String> ingredients); // Or easily show list
    void updateLiquidColor(Integer color);

    void showMessage(String content);
}
