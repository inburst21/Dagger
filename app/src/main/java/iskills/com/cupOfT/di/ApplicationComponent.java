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

@Component(modules = {
        AppModule.class,
        ManagerModule.class,
        AndroidSupportInjectionModule.class
}
)
//TODO Step ?? Set up ApplicationComponent
public interface ApplicationComponent extends AndroidInjector<CupOfTeaApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);
        ApplicationComponent build();
    }
}
