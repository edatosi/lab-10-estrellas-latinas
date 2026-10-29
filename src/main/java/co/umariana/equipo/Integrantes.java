package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "ESTRELLAS LATINAS";
    public static final String LEMA = "Estrellas forever RHLM";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("Deivid7717", "Deivid Rosero", "Vamos mis reinas", "#831bd8"));
        lista.add(new Tarjeta("darvillota125-prog", "Darwin villota", "Vamos por ese parche tranqui", "#f40d0d"));
        // >>> AGREGUE SU TARJETA DEBAJO DE ESTA LÍNEA <<<

        return lista;
    }
}
