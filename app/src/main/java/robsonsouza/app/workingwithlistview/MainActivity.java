package robsonsouza.app.workingwithlistview;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Country> countries;
    private CountryAdapter countryAdapter;

    List<String> permissionItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References:
        //http://ediposouza.com/recycling-view-o-novo-listview-do-android

        //Paises
        createAndPopulateCountriesArray();
        countryAdapter = new CountryAdapter(this, countries);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(countryAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(8));
    }


    private void createAndPopulateCountriesArray() {
        countries = new ArrayList<Country>();
        countries.add(new Country("Argentina", R.drawable.argentina));
        countries.add(new Country("Australia", R.drawable.australia));
        countries.add(new Country("Brazil", R.drawable.brazil));
        countries.add(new Country("Canada", R.drawable.canada));
        countries.add(new Country("Chile", R.drawable.chile));
        countries.add(new Country("China", R.drawable.china));
        countries.add(new Country("Egypt", R.drawable.egypt));
        countries.add(new Country("France", R.drawable.france));
        countries.add(new Country("Germany", R.drawable.germany));
        countries.add(new Country("Greece", R.drawable.greece));
        countries.add(new Country("Mexico", R.drawable.mexico));
        countries.add(new Country("Paraguay", R.drawable.paraguay));
        countries.add(new Country("United Kingdom", R.drawable.united_kingdom));
        countries.add(new Country("United States", R.drawable.united_states));
        countries.add(new Country("Uruguay", R.drawable.uruguay));
    }

    public class VerticalSpaceItemDecoration extends RecyclerView.ItemDecoration {

        private final int mVerticalSpaceHeight;

        public VerticalSpaceItemDecoration(int mVerticalSpaceHeight) {
            this.mVerticalSpaceHeight = mVerticalSpaceHeight;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                                   RecyclerView.State state) {
            outRect.bottom = mVerticalSpaceHeight;
        }
    }
}
