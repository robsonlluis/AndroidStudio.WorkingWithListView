package robsonsouza.app.workingwithlistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ess on 17/08/14.
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private Context context;
    private ArrayList<Country> items;

    public CountryAdapter(Context context, ArrayList<Country> items) {
        this.context = context;
        this.items = items;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_country, parent, false);
        CountryViewHolder viewHolder = new CountryViewHolder(context, view);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CountryViewHolder viewHolder, int position) {
        Country country = items.get(position);
        viewHolder.tvName.setText(country.getName());
        viewHolder.ivFlag.setImageResource(country.getFlagResID());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
