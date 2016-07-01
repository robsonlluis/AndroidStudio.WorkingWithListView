package robsonsouza.app.workingwithlistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ess on 17/08/14.
 */
public class CountryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private Context context;
    public TextView tvName;
    public ImageView ivFlag;

    public CountryViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
        tvName = (TextView) itemView.findViewById(R.id.tvCountryName);
        ivFlag = (ImageView) itemView.findViewById(R.id.ivCountryFlag);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, tvName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
