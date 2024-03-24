package com.example.popularmovies.ui.listafilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.popularmovies.R;
import com.example.popularmovies.data.model.Filme;

import java.util.Arrays;
import java.util.List;

public class ListaFilmeActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filme);
        findIds(); //chamando a função dos ids
        setSupportActionBar(toolbar);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //cria a referencia do layout manager e define o contexto, que é essa activity
        recyclerView.setLayoutManager(linearLayoutManager);// setar o layout manager (linear manager ou grid manager)
        recyclerView.setAdapter(new ListaFilmesAdapter(criarFilme()));//para clicar o adapter



    }

    private List<Filme> criarFilme(){
        return Arrays.asList(
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men"),
                new Filme("X-men")
        );
    }

    public void findIds(){ //função para juntar todos os ids
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
    }
}