package comsci.thanaporn.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View  ผูก View ที่หน้า UI ให้รู้จักกับตัวแปลบน Java
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detialTextView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.btnBack);

        //Show Data from MainActivity รับข้อมูลจาก MainActivity มาแสดงผลใน Detail
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detialTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));


    }   //Main Method

    public void clickBack(View view){
        finish();
    }

}   //Main Class
