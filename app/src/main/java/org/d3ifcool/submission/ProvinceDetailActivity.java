package org.d3ifcool.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProvinceDetailActivity extends AppCompatActivity {

    public static final String PROVINCE = "province";
    public static final String DATE_PROVINCE = "date_province";
    public static final String CAPITAL = "capital";
    public static final String DESCRIPTION = "description";

    private TextView tvProvince;
    private TextView tvCapital;
    private TextView tvDate;
    private TextView tvDescription;
    private ImageView imageProvince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province_detail);

        tvProvince = findViewById(R.id.tv_province_name);
        tvCapital = findViewById(R.id.tv_capital_name);
        tvDate = findViewById(R.id.tv_date);
        tvDescription = findViewById(R.id.tv_description);
        imageProvince = findViewById(R.id.image_province);

        tvProvince.setText(getIntent().getStringExtra(PROVINCE));
        tvCapital.setText(getIntent().getStringExtra(CAPITAL));
        tvDate.setText(getIntent().getStringExtra(DATE_PROVINCE));
        tvDescription.setText(getIntent().getStringExtra(DESCRIPTION));
        imageProvince.setImageResource(getIntent().getIntExtra("Image",0));

    }
}
