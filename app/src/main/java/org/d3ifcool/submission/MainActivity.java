package org.d3ifcool.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProvince;
    private ArrayList<Province> list = new ArrayList<>();
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProvince = findViewById(R.id.rv_province);
        rvProvince.setHasFixedSize(true);

        list.addAll(ProvinceData.getListData());
        showCardView();
    }

    private void showCardView(){
        rvProvince.setLayoutManager(new LinearLayoutManager(this));
        GridProvinceAdapter cardHeroAdapter = new GridProvinceAdapter(list);
        rvProvince.setAdapter(cardHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void moveProfile(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(intent);
    }
}
