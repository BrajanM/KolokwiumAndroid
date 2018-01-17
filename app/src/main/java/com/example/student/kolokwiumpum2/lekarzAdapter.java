package com.example.student.kolokwiumpum2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-17.
 */

public class lekarzAdapter extends RecyclerView.Adapter<lekarzAdapterAdapter.ViewHolder> {
    private ArrayList<Lekarz> lekarze = new ArrayList<>();
    private OnClickPlace listener;

    lekarzAdapterAdapter(ArrayList<Lekarz> kawy , OnClickPlace listener)
    {
        this.lekarze = kawy;
        this.listener = listener;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, null);

        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setImie(lekarze.get(position).getImie());
        holder.setNazwisko(lekarze.get(position).getNazwisko());
        holder.setSpecjalka(lekarze.get(position).getSpecjalizacja());



    }

    @Override
    public int getItemCount() {
        return lekarze.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.imie)
        TextView imie_l;

        @BindView(R.id.nazwisko)
        TextView nazwisko;

        private OnClickPlace listener;

        @BindView(R.id.specjalizacja)
        TextView specjalizacja;


        @OnClick(R.id.wybierz_lekarza)
        void onNameClick() {
            if (Wybrane.getVisibility() == View.INVISIBLE) {
                Wybrane.setVisibility(View.VISIBLE);
            } else {
                Wybrane.setVisibility(View.INVISIBLE);
            }
        }

        public ViewHolder(View itemView, OnClickPlace listener) {

            super(itemView);
            ButterKnife.bind(this,itemView);
            this.listener = listener;
            itemView.setOnClickListener(this::OnClick);

        }

        private void setName(String nazwa){name.setText(nazwa);}
        private void setCost(String cena) {cost.setText(cena);}



        public void OnClick(View view)
        {
            listener.onClickPlace(view, getAdapterPosition());


        }
    }


}
