public class Varargs //Main
{
  public static void main(String[] args) 
  {
    String item1 = "Apples";
    String item2 = "Oranges";
    String item3 = "Pears";
    //String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
    printShoppingList(item1, item2, item3);
    printShoppingList("Bread", "Milk", "Eggs", "Bananas");
  }
  
  //have to put individuals' variable in the parameter
  /*
  private static void printShoppingList(String string1, String string2)
  {
    System.out.println("1. " + string1);
    System.out.println("2. " + string2);
  }
  
  private static void printShoppingList(String string1, String string2, String string3)
  {
  	System.out.println("SHOPPING LIST");
    System.out.println("1. " + string1);
    System.out.println("2. " + string2);
    System.out.println("3. " + string3);
    System.out.println();
  }
  
  //only be able to print array of variables
  private static void printShoppingList(String[] items)
  {
  	System.out.println("SHOPPING LIST");
    for (int i = 0; i < items.length; i++)
    {
    	System.out.println(i + 1 + ": " + items[i]);
    }
    
    System.out.println();
  }
  */
  
  //using varargs, can print array of variables/ individuals' 
  //variables/ no variables 
  private static void printShoppingList(String... items)
  {
  	System.out.println("SHOPPING LIST");
    for (int i = 0; i < items.length; i++)
    {
    	System.out.println(i + 1 + ": " + items[i]);
    }
    
    System.out.println();
  }
}