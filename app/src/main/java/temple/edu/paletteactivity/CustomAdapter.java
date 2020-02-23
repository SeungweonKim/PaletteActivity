package temple.edu.paletteactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    Context context;
    int[] colorsList;
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] colorslst) {
        this.context = applicationContext;
        this.colorsList = colorslst;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return colorsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spinner_item, null);
        TextView item = (TextView) view.findViewById(R.id.list_item);
        item.setBackgroundColor(colorsList[i]);
        return view;
    }

}
