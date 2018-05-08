package iskills.com.cupOfT;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
    implements MainView, AdapterView.OnItemSelectedListener {

  @BindView(R.id.image_cup)
  AppCompatImageView cupView;

  @BindView(R.id.spinner)
  AppCompatSpinner ingredientSpinner;

  MainPresenter mainPresenter = new MainPresenter();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    cupView.setImageResource(R.drawable.ic_cup_svg_icon);
    ArrayAdapter<String> adapter =
        new ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item, mainPresenter.getIngredients());

    mainPresenter.init(this);
    ingredientSpinner.setAdapter(adapter);
    ingredientSpinner.setOnItemSelectedListener(this);
  }

  @Override
  public void updateLiquidColor(Integer color) {
    cupView.setColorFilter(getResources().getColor(color));
  }

  @Override
  public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
    mainPresenter.selectIngredient(pos);
  }

  @Override
  public void onNothingSelected(AdapterView<?> adapterView) {}
}
