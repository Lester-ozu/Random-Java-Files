import java.util.Scanner;

public class ExIncSortedList {

   public static void main (String [] args) {
   
        int toSearch, toExclude, numAdded = 0, numExcluded = 0, count = 0, n = 0, temp;
        String toPrint = "", toPrint2 = "";;
   
        Scanner scanner = new Scanner (System.in);
        
        int [] searchList = new int [5];
        
        System.out.println("Enter numbers in the search list:");
        
        while (true) {
        
            toSearch = scanner.nextInt();
            
            if (toSearch == 0) {
            
               break;
            }
            
            if (searchList[searchList.length -1] != 0) {
            
               int [] searchList2 = new int [searchList.length*5];
               for (int i = 0 ; i < searchList.length ; i++) {
               
                  searchList2[i] = searchList[i];
               }
               
               searchList = searchList2;
            }
            
            searchList[numAdded] = toSearch;
            numAdded++;
        }
        
        System.out.println();
        
        System.out.println("Enter numbers to be excluded from the search list:");
        
        while (true) {
        
            toExclude = scanner.nextInt();
            
            if (toExclude == 0) {
            
               break;
            }
            
            for (int j = 0 ; j < searchList.length ; j++) {
            
               if(toExclude == searchList[j]) {
               
                  searchList[j] = 0;
                  numExcluded++;
               }
            }
        }
        
        System.out.println();
        
        for (int i = 0 ; i < searchList.length ; i++) {
        
            if(searchList[i] != 0) {
            
               count++;
            }
        }
        
        int [] finalArray = new int [numAdded - numExcluded];
        
        for (int i = 0 ; i < searchList.length ; i++) {
        
            if(searchList[i] != 0) {
            
               finalArray[n] = searchList[i];
               n++;
            }
        }
        
        int [] finalArray2 = new int [numAdded - numExcluded];
        
        for (int i = 0 ; i < finalArray.length ; i++) {
        
            finalArray2[i] = finalArray[i];
        }
        
        System.out.println("Found " + count + " numbers:");
        
        for (int i = 0 ; i < finalArray.length ; i++) {
            for (int j = i ; j > 0 ; j--) {
            
               if (finalArray[j] < finalArray[j-1]) {
               
                  temp = finalArray[j-1];
                  finalArray[j-1] = finalArray[j];
                  finalArray[j] = temp;
               }
            }
        }
        
        for(int i = 0 ; i < finalArray.length ; i++) {
        
            toPrint += finalArray[i] + " ";
        }
        
        System.out.print(toPrint);
        
        System.out.println();
        
        for (int i = 0 ; i < finalArray2.length ; i++) {
            for (int j = i ; j > 0 ; j--) {
            
               if (finalArray2[j] > finalArray2[j-1]) {
               
                  temp = finalArray2[j-1];
                  finalArray2[j-1] = finalArray2[j];
                  finalArray2[j] = temp;
               }
            }
        }
        
        for(int i = 0 ; i < finalArray2.length ; i++) {
        
            toPrint2 += finalArray2[i] + " ";
        }
        
        System.out.print(toPrint2);

   
   }
}