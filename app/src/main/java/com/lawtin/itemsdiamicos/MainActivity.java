package com.lawtin.itemsdiamicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView listaMesesJ;

    private String[] meses={"Enero","Febrero","Marzo","April","Mayo","Junio","Julio","Agosto","Septiembre","Octubre", "Noviembre","Diciembre"};

    private ArrayList<RowItemMes> ListaMesesArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaMesesJ=(GridView) findViewById(R.id.listaMeses);

        ListaMesesArrayList=new ArrayList<RowItemMes>();

        cargarListMes();

        messAdapter adapatadordelArregloMeses=new messAdapter(getApplicationContext(),ListaMesesArrayList);
        listaMesesJ.setAdapter(adapatadordelArregloMeses);


    }
    private void cargarListMes(){
        for (String element:meses){
            RowItemMes nombremes= new RowItemMes();
            nombremes.setTituloMes(element);

            ListaMesesArrayList.add(nombremes);
        }
    }
}