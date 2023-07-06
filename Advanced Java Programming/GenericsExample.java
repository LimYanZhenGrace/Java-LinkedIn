import java.util.ArrayList;
import java.util.List;

public class GenericsExample//Main
{
	public static void main(String[] args) 
    {
    	// Example without Generics
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        names.add(7);
        //System.out.println(names);
        int name1 = (int) names.get(1);
        System.out.println("Second name: " + name1);
    
        // Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        names.add(7);
        System.out.println(names2);
    }
}