import java.util.ArrayList;
import java.util.List;

public class GenericMethods//Main
{
	static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    
    public static List arrayToList (Object [] array, List <Object> list)
    {
    	for (Object object : array)
        {
        	list.add(object);
        }
        
        return list;
    }
    
    public static void main(String[] args)
    {
    	List <Character> charList = arrayToList(charArray, new ArrayList<> ());
        List <Boolean> boolList = arrayToList(boolArray, new ArrayList<> ());
        List <Integer> intList = arrayToList(intArray, new ArrayList<> ());
        
        // <Character>
        System.out.println(charList);
        System.out.println(charList.getClass());
        System.out.println(charArray.getClass());
        System.out.println("");
        
        // <Boolean>
        System.out.println(boolList);
        System.out.println(boolList.getClass());
        System.out.println(boolArray.getClass());
        System.out.println("");
        
        // <Integer>
        System.out.println(intList);
        System.out.println(intList.getClass());
        System.out.println(intArray.getClass());
        System.out.println("");
    }
}

