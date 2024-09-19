package co.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia boton
        Button findBeerButton = findViewById(R.id.find_beer);

        //Listener para el boton
        findBeerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findBeer();
            }
        });

    }

    // Método que se llama cuando se presiona el botón
    private void findBeer() {
        // Obtener referencia al spinner
        Spinner beerType = findViewById(R.id.beer_type);

        // Obtener el tipo de localidad seleccionado
        String beerChoice = String.valueOf(beerType.getSelectedItem());

        // Obtener la lista de actividades por localidad
        List<String> brandsList = expert.getBrands(beerChoice);

        // Convertir la lista a una cadena de texto
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append("\n");
        }

        // Mostrar las recomendaciones en el TextView
        TextView beerBrands = findViewById(R.id.beer_brands);
        beerBrands.setText(brandsFormatted.toString());
    }

}