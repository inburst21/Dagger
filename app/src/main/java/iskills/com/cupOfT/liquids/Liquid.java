package iskills.com.cupOfT.liquids;

import iskills.com.cupOfT.models.CupState;

/**
 * lennyhicks
 * 5/7/18
 */

//TODO Step 3 have liquid extend CupState after step 2
public abstract class Liquid extends CupState {

    public abstract Integer color();

    //TODO Step 9 this should no longer be used
    protected String getName() {
        return getClass().getSimpleName();
    }
}
