package nvrsettle.swipeablecardstack;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class CardsDataAdapter extends ArrayAdapter<String> {

    public CardsDataAdapter(Context context) {
        super(context, R.layout.card_content);
    }

    @Override
    public View getView(int position, final View contentView, ViewGroup parent){
        EditText v = (EditText) (contentView.findViewById(R.id.title_punch));
        v.setText(getItem(position));
        return contentView;
    }

}

