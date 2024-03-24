package com.example.popularmovies.ui.listafilmes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.popularmovies.R;
import com.example.popularmovies.data.model.Filme;

import java.util.List;

public class ListaFilmesAdapter extends RecyclerView.Adapter<ListaFilmesAdapter.ListaFilmesViewHodler>{

    private List<Filme> filmes;

    public ListaFilmesAdapter(List<Filme> filmes){
        this.filmes = filmes;
    }
    @NonNull
    @Override
    public ListaFilmesViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filme, parent, false);
        return new ListaFilmesViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaFilmesViewHodler holder, int position) {
        holder.textView.setText(filmes.get(position).getname());
    }

    @Override
    public int getItemCount() {
        return (filmes != null  && filmes.size() > 0) ? filmes.size() : 0;
    }

    static class ListaFilmesViewHodler extends RecyclerView.ViewHolder{

        private TextView textView;
        public ListaFilmesViewHodler(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_titulo_filme);

            textView.setText("Filme de exemplo");
        }
    }
}
