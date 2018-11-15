
public class HighLowTest
   {
      public static void main(String[] args)
         {
            //Creates array objects for Strings, Integers, Doubles to demonstrate
            String[] sArray = {"Alfonso", "Beatrice", "Celine"};  //string array
            Integer[] iArray = {6, 10, 25, 16, 5, 85};   //Integer array
            Double[] dArray = {4.536, 8.3284, 8.3234, 6.7721};  //Double array
            
            //Demonstrate the method displayLargest, which will return the largest element in each array object, independent of array object type.
            System.out.println("Highest values of each array:");
            HighLow.displayHighest(sArray);
            HighLow.displayHighest(iArray);
            HighLow.displayHighest(dArray);
            System.out.println();
            
            System.out.println("Lowest values of each array:");
            HighLow.displayLowest(sArray);
            HighLow.displayLowest(iArray);
            HighLow.displayLowest(dArray);
         }
   }         
         /**
            The dispayLargest method displays each element in an array
            @param array The array to sort and find largest
         */
         
       /**  public static <T extends Comparable<T>> void displayHighest(T[] array) takes an array of generic object type T, with upper bound Comparable class, 
                                                                                return type is void since it will just print the result
            {
               T max = array[0];
               for (int i = 0; i < array.length; i++)
                  {
                    T test = array[i];
                    if(test.compareTo(max) > 0)
                    max = test;
                  }
               System.out.println(max);
            }
            
         public static <T extends Comparable<T>> void displayLowest(T[] array) //takes an array of generic object type T, with upper bound Comparable class, 
                                                                                //return type is void since it will just print the result
            {
               T min = array[0];
               for (int i = 0; i < array.length; i++)
                  {
                    T test = array[i];
                    if(test.compareTo(min) < 0)
                    min = test;
                  }
               System.out.println(min);
            }

   }
   
*/