package AdCo2024.Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.NumberFormatException;

public class HistorianHysteria {

    
    public HistorianHysteria(){}

    
    @SuppressWarnings("unchecked")
    private static void loadValues (@SuppressWarnings("rawtypes") ArrayList list, String LorR) throws NumberFormatException {
        //String filePath = "C:\\Users\\tomcl\\OneDrive\\Desktop\\AdventOfCode\\2024\\Day1\\Data\\part1testdata.txt";
        String filePath = "C:\\Users\\tomcl\\OneDrive\\Desktop\\AdventOfCode\\2024\\Day1\\Data\\part1input.txt";

        int whichSide;
        if (LorR == "left"){
            whichSide = 0;
        } else {
            whichSide = 1;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\s+");
                int intValue;
                intValue = Integer.parseInt(values[whichSide]);
                
                list.add(intValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    @SuppressWarnings("unchecked")
    public static void sortList (@SuppressWarnings("rawtypes") ArrayList list) {
        Collections.sort(list);
    }
        
    @SuppressWarnings("rawtypes")
    public static void main (String[] args) {
                
    
        @SuppressWarnings("unchecked")
        ArrayList<Integer> leftList = new ArrayList();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> rightList = new ArrayList();
        
        loadValues(leftList, "left");
        loadValues(rightList, "right");

        sortList(leftList);
        sortList(rightList);

        int total = 0;
        for(int i = 0; i < leftList.size(); i++) {
            int left = leftList.get(i);
            int right = rightList.get(i);
            
            total = total + Math.abs(left - right);
        }

        System.out.println("Total Distance: " + total);

        // Calculate Correlation

        int correlation = 0;
        int rightCounterKeeper = 0;
        for ( int leftCounter = 0; leftCounter < leftList.size(); leftCounter++){
            int corrCounter = 0;
            int location = leftList.get(leftCounter);

            for (int rightCounter = rightCounterKeeper; rightCounter < rightList.size(); rightCounter++) {
               // int corrNumber = rightList.get(rightCounter);
                //System.out.println(location + " : " + rightList.get(rightCounter));
                if (location == rightList.get(rightCounter)) {
                    corrCounter++;
                }
                // } else {
                //     System.out.println("here");
                //     rightCounterKeeper = rightCounter;
                //     rightCounter = rightList.size();
                // }
            }

            correlation = correlation + (location * corrCounter);
//            System.out.println(corrCounter);
        }

        System.out.println( "Correlaion Value: " + correlation);

    }
}
