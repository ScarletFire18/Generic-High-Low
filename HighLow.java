public class HighLow
   {
       public static <T extends Comparable<T>> void HighLowArray(T[] array) //Constructor
         {
         }
       
       public static <T extends Comparable<T>> void displayHighest(T[] array) //takes an array of generic object type T, with upper bound Comparable class, 
                                                                                //return type is void since it will just print the result
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
