package com.example.franquias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.franquias.models.Franchise;
import com.example.franquias.models.Restaurant;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Franchise billyTheGrill = new Franchise(
                "Billy The Grill",
                "O Billy The Grill é a casa do churrasco na pedra. Escolha entre picanha, contrafilé, ancho, entre outros cortes para sua refeição ser super especial.",
                R.drawable.billythegrill
        );

        Restaurant[] restaurantsbillyTheGrill = new Restaurant[]{
                new Restaurant("Billy The Grill", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.billythegrill),
                new Restaurant("Billy The Grill", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.billythegrill),
                new Restaurant("Billy The Grill", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.billythegrill)
        };

        billyTheGrill.setRestaurants(restaurantsbillyTheGrill);

        Franchise chinaInBox = new Franchise(
                "China in Box",
                "Conheça nosso delicioso Yakissoba, Frango Xadrez, Macarrão Oriental, Rolinhos Primaveras e Muito Mais. Faça já seu Pedido",
                R.drawable.chinainbox
        );

        Restaurant[] restaurantschinaInBox= new Restaurant[]{
                new Restaurant("China in Box", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.chinainbox),
                new Restaurant("China in Box", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.chinainbox),
                new Restaurant("China in Box", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.chinainbox),
                new Restaurant("China in Box", "Praça de Alimentação - Botafogo Praia Shopping, R. Praia de Botafogo, 400 - 8º Piso - Botafogo, 22250-040", "Rio de Janeiro", R.drawable.chinainbox)
        };

        chinaInBox.setRestaurants(restaurantschinaInBox);
        
        Franchise griletto = new Franchise(
                "Griletto",
                "Faça seu pedido online no Griletto - Floripa Shopping, delivery de Comida Brasileira em Florianopolis aqui no iFood. Acesse e peça já!",
                R.drawable.griletto
        );

        Restaurant[] restaurantsGriletto = new Restaurant[]{
                new Restaurant("Griletto", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.griletto),
                new Restaurant("Griletto", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.griletto),
                new Restaurant("Griletto", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.griletto),
                new Restaurant("Griletto", "Praça de Alimentação - Botafogo Praia Shopping, R. Praia de Botafogo, 400 - 8º Piso - Botafogo, 22250-040", "Rio de Janeiro", R.drawable.griletto)
        };

        griletto.setRestaurants(restaurantsGriletto);

        Franchise mcDonald = new Franchise(
                "McDonald's",
                "Baixe o aplicativo do McDonald's e descubra as novidades que temos para você neste mês!",
                R.drawable.mcdonald
        );


        Restaurant[] restaurantsDonald = new Restaurant[]{
                new Restaurant("McDonald's", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.mcdonald),
                new Restaurant("McDonald's", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.mcdonald),
                new Restaurant("McDonald's", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.mcdonald)
        };

        mcDonald.setRestaurants(restaurantsDonald);

        Franchise giraffas = new Franchise(
                "Girafas",
                "Giraffas é uma rede de fast-food brasileira, fundada no Lago Sul, no Distrito Federal em agosto de 1981 por dois amigos, os empresários Mauro Lacerda e Muniz Neto, com seu primeiro restaurante no comércio local da QI 09",
                R.drawable.giraffas
        );

        Restaurant[] restaurantsGiraffes = new Restaurant[]{
                new Restaurant("Girafas", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.giraffas),
                new Restaurant("Girafas", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.giraffas),
                new Restaurant("Girafas", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.giraffas),
                new Restaurant("Girafas", "Praça de Alimentação - Botafogo Praia Shopping, R. Praia de Botafogo, 400 - 8º Piso - Botafogo, 22250-040", "Rio de Janeiro", R.drawable.giraffas)
        };

        giraffas.setRestaurants(restaurantsGiraffes);

        Franchise habibs = new Franchise(
                "Habib's",
                "Rede de fast-food árabe, popular pelas esfihas, tem um ambiente simples e informal também para grandes grupos.",
                R.drawable.habibs
        );

        Restaurant[] restaurantsHabits = new Restaurant[]{
                new Restaurant("Habib's", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.habibs),
                new Restaurant("Habib's", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.habibs),
                new Restaurant("Habib's", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.habibs),
                new Restaurant("Habib's", "Praça de Alimentação - Botafogo Praia Shopping, R. Praia de Botafogo, 400 - 8º Piso - Botafogo, 22250-040", "Rio de Janeiro", R.drawable.habibs)
        };

        habibs.setRestaurants(restaurantsHabits);

        Franchise outback = new Franchise(
                "Outback",
                "Rede de restaurantes com tema australiano que serve carnes, frutos do mar e comidas típicas de um steakhouse.",
                R.drawable.outback
        );

        Restaurant[] restaurantsOutback = new Restaurant[]{
                new Restaurant("Outback", "R. Uranos, 1005 - Manguinhos, 21060-070", "Rio de Janeiro", R.drawable.outback),
                new Restaurant("Outback", "Marginal Pinheiros, 42 - Cidade Jardim, 05672-130", "São Paulo", R.drawable.outback),
                new Restaurant("Outback", "R. Maria Soares Sendas, 111 - Centro, 25575-825", "Rio de Janeiro", R.drawable.outback)
        };

        outback.setRestaurants(restaurantsOutback);

        LinearLayout ll=(LinearLayout) findViewById(R.id.llItems);

        ArrayList<Franchise> franchises = new ArrayList<Franchise>();

        franchises.add(billyTheGrill);
        franchises.add(chinaInBox);
        franchises.add(griletto);
        franchises.add(mcDonald);
        franchises.add(giraffas);
        franchises.add(habibs);
        franchises.add(outback);

        TextView inputFindFranchise = findViewById(R.id.inputFindFranchise);

        inputFindFranchise.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @SuppressLint("NewApi")
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                ll.removeAllViews();
                if (cs.equals("")){
                    franchises.add(billyTheGrill);
                    franchises.add(chinaInBox);
                    franchises.add(griletto);
                    franchises.add(mcDonald);
                    franchises.add(giraffas);
                    franchises.add(habibs);
                    franchises.add(outback);
                }else {

                    franchises.forEach(f -> {
                        boolean find = f.getName().toLowerCase().startsWith(cs.toString().toLowerCase());

                        if(find){
                            LinearLayout horizontalLL = new LinearLayout(ll.getContext());
                            horizontalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                            horizontalLL.setOrientation(LinearLayout.HORIZONTAL);

                            ll.addView(horizontalLL);

                            ImageView iv = new ImageView(getApplicationContext());
                            iv.setImageDrawable(getDrawable(f.getImage()));
                            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 300);

                            iv.setLayoutParams(lp);
                            horizontalLL.addView(iv);

                            LinearLayout verticalLL  = new LinearLayout(ll.getContext());
                            verticalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                            verticalLL.setOrientation(LinearLayout.VERTICAL);

                            TextView name= new TextView(ll.getContext());
                            name.setText(f.getName());
                            name.setTextSize(22f);
                            name.setPadding(10,30,2,15);

                            TextView description= new TextView(ll.getContext());
                            description.setText(f.getDescription());
                            description.setTextSize(9f);
                            description.setPadding(10,1,2,15);
                            description.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

                            verticalLL.addView(name);
                            verticalLL.addView(description);

                            horizontalLL.addView(verticalLL);

                            horizontalLL.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                                    intent.putExtra("Franchise", f);
                                    startActivity(intent);

                                    setContentView(R.layout.activity_restaurant);
                                }
                            });

                        }

                    });

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        for(Franchise f: franchises) {

            LinearLayout horizontalLL = new LinearLayout(this);
            horizontalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            horizontalLL.setOrientation(LinearLayout.HORIZONTAL);

            ll.addView(horizontalLL);

            ImageView iv = new ImageView(getApplicationContext());
            iv.setImageDrawable(getDrawable(f.getImage()));
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 300);

            iv.setLayoutParams(lp);
            horizontalLL.addView(iv);

            LinearLayout verticalLL  = new LinearLayout(this);
            verticalLL.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            verticalLL.setOrientation(LinearLayout.VERTICAL);

            TextView name= new TextView(ll.getContext());
            name.setText(f.getName());
            name.setTextSize(22f);
            name.setPadding(10,30,2,15);

            TextView description= new TextView(ll.getContext());
            description.setText(f.getDescription());
            description.setTextSize(9f);
            description.setPadding(10,1,2,15);
            description.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

            verticalLL.addView(name);
            verticalLL.addView(description);

            horizontalLL.addView(verticalLL);

            horizontalLL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                    intent.putExtra("Franchise", f);
                    startActivity(intent);

                    setContentView(R.layout.activity_restaurant);
                }
            });


        }
    }
}