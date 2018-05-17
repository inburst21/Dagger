package iskills.com.cupOfT.di;

/**
 * lennyhicks
 * 5/8/18
 */

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import iskills.com.cupOfT.CupOfTeaApplication;

//TODO REMOVE Any of these can share dependencies between one another. Our AppModule will contain our android classes while our manager module will
// contain our Ingredient Manager needed for our presenter.
@Component(modules = {
        AppModule.class,
        ManagerModule.class,
        AndroidSupportInjectionModule.class
}
)
//TODO Step ?? Set up ApplicationComponent Simple application setup Application can be provided with this but is not needed.
public interface ApplicationComponent extends AndroidInjector<CupOfTeaApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);
        ApplicationComponent build();
    }
}
