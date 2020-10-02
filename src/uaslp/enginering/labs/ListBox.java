package uaslp.enginering.labs;

import java.util.*;

public class ListBox extends Control{
    // Declara una lista de Strings
    private List<String> options;

    // Acepta argumentos de distintos tamaños
    public ListBox(String ... options){
        this.options = new ArrayList<>(options.length);

        // Copia los argumentos pasados a cada uno de los elementos de la lista
        Collections.addAll(this.options,options);
    }

    public void draw() {
        System.out.print(options);
    }
}
