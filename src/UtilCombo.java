import java.util.ArrayList;

public class UtilCombo {
        public static ArrayList<String> tipoComidas(){
            ArrayList<String> tipo = new ArrayList<>();
            tipo.add("Entrada");
            tipo.add("Aperitivo");
            tipo.add("Sopas y ensaladas");
            tipo.add("Plato Principal");
            tipo.add("Postre");

            return tipo;
        }
        public static ArrayList<String> tipoBebidas(){
            ArrayList<String> tipo = new ArrayList<>();
            tipo.add("Cafeteria");
            tipo.add("Refresco");
            tipo.add("Jugo");
            tipo.add("Agua natural");
            tipo.add("Carveza");
            tipo.add("Licores");

            return tipo;
        }

}
