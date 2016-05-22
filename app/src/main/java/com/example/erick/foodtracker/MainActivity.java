package com.example.erick.foodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.erick.foodtracker.domain.util.LibraryClass;
import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_home);

    }

    //Chama tela de pesquisa, na qual é listado opções de pesquisa (Nome, Proximidade)
    public void chamaTelaPesquisa(View v){

        setContentView(R.layout.lista_pesquisa);

    }

    //Chama tela de pesquisa de foodtruck ao clicar em "Pesquisar por Foodtruck".
    public void chamaTelaPesquisaFoodtruck(View v){

        setContentView(R.layout.pesquisar_foodtruck);

    }

    //Chama tela do GoogleMaps ao clicar em "Pesquisar por proximidade".
    public void chamaTelaMapa(View v){

        startActivity(new Intent(getBaseContext(),MapsActivity.class));

    }




}


