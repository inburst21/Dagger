package iskills.com.cupOfT;

import android.app.Activity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerApplication;
import iskills.com.cupOfT.di.DaggerApplicationComponent;

/** lennyhicks 5/8/18 */
//TODO Step ?? MakeYourApplication this is a simple application setup
public class CupOfTeaApplication extends DaggerApplication {

  @Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector; // Dagger application will inject in your onCreate before the super.onCreate is called.

  @Override
  protected AndroidInjector<? extends DaggerApplication> applicationInjector() { // Creates an AndroidInjector<DaggerApplication> from your component
    return DaggerApplicationComponent.builder().application(this).build(); //TODO Step ?? Compile for dagger to build this class.
  }
}
