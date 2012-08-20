import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class mochilaResolver {
	public mochilaResolver() { }
	
	public ArrayList<item> resolver(ArrayList<item> totalItems, int max_items, int peso_max) {
		ArrayList<item> mochila = new ArrayList<item>(max_items);
		
		// Comparador para ordenar las tareas del scrum por prioridad del cliente
	    Comparator<item> cmp = new Comparator<item>() {
	        public int compare(item x, item y) {
	            return (int) (x.getNivelPrioridad()/x.getPeso()- y.getNivelPrioridad()/y.getPeso());
	        }
	    };
	    Collections.sort(totalItems,cmp);  // ordena usando el comparador anterior
	    Collections.reverse(totalItems);   // reversa el orden de los elementos
		
	    double pesoMochila=0;
	    int    posicion=0;
	    while(pesoMochila<peso_max && posicion < totalItems.size()) {
	        item tmp = totalItems.get(posicion);
	        if(pesoMochila + tmp.getPeso() <= peso_max) {
	            mochila.add(tmp);
	            pesoMochila+=tmp.getPeso();
	        }
	        posicion++;
	    }
	    
		return mochila;
	}
	
}
