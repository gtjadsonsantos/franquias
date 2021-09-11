package com.example.franquias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.franquias.models.Franchise;
import com.example.franquias.models.Restaurant;


public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        Intent i = getIntent();
        Franchise franchise = (Franchise) i.getSerializableExtra("Franchise");

        ImageView restaurantLogo = (ImageView) findViewById(R.id.RestaurantLogo);
        restaurantLogo.setImageDrawable(getDrawable(franchise.getImage()));

        TextView restaurantDescription = (TextView) findViewById(R.id.RestaurantDescription);
        restaurantDescription.setText(franchise.getDescription());

        LinearLayout ll = (LinearLayout) findViewById(R.id.llRestaurants);

        Button comeBack = (Button) findViewById(R.id.comeBack);

        comeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_main);
            }
        });

        System.out.println(franchise.getRestaurants().length);


        for (Restaurant r : franchise.getRestaurants()) {

                LinearLayout horizontalLL = new LinearLayout(this);
                horizontalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                horizontalLL.setOrientation(LinearLayout.HORIZONTAL);

                ll.addView(horizontalLL);

                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageDrawable(getDrawable(r.getImage()));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 300);

                iv.setLayoutParams(lp);
                horizontalLL.addView(iv);

                LinearLayout verticalLL = new LinearLayout(this);
                verticalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                verticalLL.setOrientation(LinearLayout.VERTICAL);

                TextView name = new TextView(ll.getContext());
                name.setText(r.getName());
                name.setTextSize(22f);
                name.setPadding(10, 30, 2, 15);

                TextView city = new TextView(ll.getContext());
                city.setText(r.getCity());
                city.setTextSize(9f);
                city.setPadding(10, 1, 2, 15);
                city.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

                TextView address = new TextView(ll.getContext());
                address.setText(r.getAddress());
                address.setTextSize(9f);
                address.setPadding(10, 1, 2, 15);
                address.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

                verticalLL.addView(name);
                verticalLL.addView(city);
                verticalLL.addView(address);

                horizontalLL.addView(verticalLL);
            }
    }
}
