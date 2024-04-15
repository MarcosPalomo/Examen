import java.util.*;

public class PrubaMap {
    public static void main(String[] args) {


        Map<Persona, List<Double>> calificacionesPorPersona = new HashMap<>();
        //Persona1 -> [4.0, 7.3, 4.9]
        //Persona2 -> [3.2, 7.5, 9.8]

        //Simulamos la creacion de un mapa con personas y calificaciones
        Persona persona1 = new Persona(1, "Paco", "123", "Profe");
        Persona persona2 = new Persona(2, "Pepe", "123", "JD");

        //Manera tradicional de crear lista y añadir valores
        List<Double> calificacionesP1 = new ArrayList<>();
        calificacionesP1.add(4.0);
        calificacionesP1.add(7.3);
        calificacionesP1.add(4.9);

        //Manera de crear rápidamente una lista de elementos
        List<Double> calificacionesP2 = Arrays.asList(3.2, 7.5, 9.8);

        //Añadir valores al mapa
        calificacionesPorPersona.put(persona1, calificacionesP1);
        calificacionesPorPersona.put(persona2, calificacionesP2);


        //Hacemos esto para simular la búsqueda de una persona en el mapa
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el ID de la persona que quieras buscar");
        int idPersonaBuscar = teclado.nextInt();

        Persona personaBuscar = new Persona(idPersonaBuscar, null, null, null);
        System.out.println("Sus calificaciones son: " + calificacionesPorPersona.get(personaBuscar));

        //Pedir al ususario una calificación
        // añadir la calificacion dentro del mapa
        //mostrar las calificaciones para ver si funcionan

        System.out.println("¿Qué nota quieres añadir?");
        double notaAnhadir = teclado.nextDouble();


    }
}
