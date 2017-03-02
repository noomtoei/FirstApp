package comsci.thanaporn.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by - Noom - on 2/3/2560.
 */
// Activity สร้างเพื่อแสดงผลในหน้า MainActivity
public class MyAdapter extends BaseAdapter{

    private Context context;
    private int[] intsImage;
    private String[] titelStrings, detailStrings;

    public MyAdapter(Context context, int[] intsImage, String[] titelStrings, String[] detailStrings) {
        this.context = context;
        this.intsImage = intsImage;
        this.titelStrings = titelStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {// Check array and give Method getView
        return intsImage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // รับจำนวนข้อมูล และ แสดงผลหน้าแอป

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview,parent,false);
        // Intitial View

        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titelTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detailTextView = (TextView) view.findViewById(R.id.txtDetailLiv);
        // Show View in firstapp

        imageView.setImageResource(intsImage[position]);
        titelTextView.setText(titelStrings[position]);
        detailTextView.setText(detailStrings[position]);


        return view;
    }
}// Main Classsssssssssssssssssssssssssssssssss