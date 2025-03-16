package com.example.myapplication.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;
import com.example.myapplication.R;
import com.example.myapplication.classes.Produit;
import java.util.List;

public class PizzaAdapter extends ArrayAdapter<Produit> {
    public PizzaAdapter(Context context, List<Produit> pizzas) {
        super(context, 0, pizzas);
    }

    @Override
    public View getView(int position, View pView, ViewGroup parent) {
        if (pView == null) {
            pView = LayoutInflater.from(getContext()).inflate(R.layout.item_pizza, parent, false);
        }

        Produit pizza = getItem(position);

        ImageView pizzaImage = pView.findViewById(R.id.pizzaImage);
        TextView pizzaName = pView.findViewById(R.id.pizzaName);
        TextView pizzaTime = pView.findViewById(R.id.pizzaTime);

        pizzaImage.setImageResource(pizza.getImage());
        pizzaName.setText(pizza.getNom());
        pizzaTime.setText(pizza.getTempsPreparation());

        return pView;
    }
}