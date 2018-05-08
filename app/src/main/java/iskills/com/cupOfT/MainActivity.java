package iskills.com.cupOfT;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
    implements MainView, AdapterView.OnItemSelectedListener {

  @BindView(R.id.image_cup)
  AppCompatImageView cupView;

  @BindView(R.id.spinner)
  AppCompatSpinner ingredientSpinner;

  private final MainPresenter mainPresenter = new MainPresenter();
  private ArrayAdapter<String> adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    cupView.setImageResource(R.drawable.ic_cup_svg_icon); //TODO REMOVE_QUESTION Could show use of a cup manager that gets out a cup by temperature
    mainPresenter.init(this);
  }

  @Override
  public void renderView(final List<String> ingredients) {
    if(adapter == null){
      adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, ingredients);
      adapter.notifyDataSetChanged();
      ingredientSpinner.setAdapter(adapter);
      ingredientSpinner.setOnItemSelectedListener(this);
    } else {
      adapter.clear();
      adapter.addAll(ingredients);
      adapter.notifyDataSetChanged();
    }
  }

  @Override
  public void updateLiquidColor(Integer color) {
    cupView.setColorFilter(getResources().getColor(color));
  }

  @Override
  public void showMessage(String content) {
    Toast.makeText(this, content, Toast.LENGTH_LONG).show();
  }

  @Override
  public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
    mainPresenter.selectIngredient(pos);
  }

  @Override
  public void onNothingSelected(AdapterView<?> adapterView) {}
}
