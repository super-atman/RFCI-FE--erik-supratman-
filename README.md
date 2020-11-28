#FIle lengkap nomor 2 ada di tes.rar


#Nomor 1 Codinganya disini

public static void main(String[] args)
   {
      int[] array1 = { 4, 9, 7, 5, 8, 9, 3};
      bubbleSort(array1);
   }

   public static void bubbleSort(int[] array2)
   {      
      
      System.out.println("input: ");
      for (int element : array2)
         System.out.print(element + " ");

      
      int index;       
      int temp;        
      int count = 0;
      int count2 = 0;
      boolean swapped = true;


      while (swapped == true)
      {
         swapped = false;
         
         for (index = 0; index < array2.length - 1; index++)
         {
            count2++;
            
            if (array2[index] > array2[index + 1])
            {
               count++;
               
               temp = array2[index];
               array2[index] = array2[index + 1];
               array2[index + 1] = temp;
               swapped = true;
            }

         }
      }
      
      System.out.println("\n output: ");
      for (int element : array2)
         System.out.print(element + " ");

      System.out.print("\n jumlah Swaps:" + count);
      


   }
