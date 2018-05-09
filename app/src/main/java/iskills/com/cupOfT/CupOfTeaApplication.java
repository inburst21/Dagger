package iskills.com.cupOfT;

import android.app.Activity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerApplication;
import iskills.com.cupOfT.di.DaggerApplicationComponent;

/** lennyhicks 5/8/18 */
//TODO Step ?? MakeYourApplication
public class CupOfTeaApplication extends DaggerApplication {

  @Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  @Override
  protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerApplicationComponent.builder().application(this).build(); //TODO Step ?? Compile for dagger to build this class.
  }
}
