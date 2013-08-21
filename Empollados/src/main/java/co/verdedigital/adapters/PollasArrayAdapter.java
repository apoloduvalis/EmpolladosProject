package co.verdedigital.adapters;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import co.verdedigital.empollados.R;
import co.verdedigital.model.Polla;

/**
 * Created by apoloduvalis on 5/16/13.
 */
public class PollasArrayAdapter extends ArrayAdapter<Polla>
{
    private final Context context;
    private final Polla[] values;

    public static class PollaViewHolder
    {
        public TextView pollas_titulo_polla;
        public ImageView pollas_logo_torneo;
        public Polla instanciaPolla;
    }

    public PollasArrayAdapter(Context context, Polla[] objects)
    {
        super(context, R.layout.mis_pollas_row, objects);
        this.context = context;
        this.values = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View rowView = convertView;
        if (rowView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.mis_pollas_row, parent, false);
            PollaViewHolder vh = new PollaViewHolder();
            vh.pollas_titulo_polla = (TextView) rowView.findViewById(R.id.pollas_titulo_polla);
            vh.pollas_logo_torneo = (ImageView) rowView.findViewById(R.id.pollas_logo_torneo);
            rowView.setTag(vh);
        }
        PollaViewHolder holder = (PollaViewHolder) rowView.getTag();

        holder.pollas_titulo_polla.setText(values[position].titulo);
        holder.pollas_logo_torneo.setImageResource(values[position].logoTorneoResourceId);
        holder.instanciaPolla = values[position];

        return rowView;
    }
}
