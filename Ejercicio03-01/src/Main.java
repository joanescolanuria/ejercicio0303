import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        
        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));
        months.add(new Month("Septiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));
        // Insertamos el objeto con atributo "Agosto" en el lugar que corresponde
        months.add(7, new Month("AGOSTO"));

        System.out.println("##LISTAR");
        for(Month meses : months) {
        	System.out.println(meses.getName());
        }
        
        System.out.println("###HASHET");
        HashSet<Month> monthsSet = new HashSet<>(months);
        System.out.println(monthsSet);

        System.out.println("###RECORRER LA LISTA CON FOR");
        for (Month mes : months) {
            System.out.println(mes.getName());
        }
        
        System.out.println("###RECORER LA LISTA CON ITERATOR");
        Iterator<Month> it = months.iterator();
        
        while(it.hasNext()) {
        	System.out.println(it.next().getName());
        }
       
    }
}