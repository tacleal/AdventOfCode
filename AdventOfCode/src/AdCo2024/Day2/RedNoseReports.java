package AdCo2024.Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RedNoseReports {
    public static void loadData(String[] reportStorage) {
        //String filePath = "C:\\Users\\tomcl\\OneDrive\\Desktop\\AdventOfCode\\2024\\Day2\\RedNosedReport\\data\\testdata2";
        String filePath = "D:\\Projects\\EclipseProjects\\AdventOfCode\\Data\\RedNoseReports";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int reportNum = 0;
            while ((line = br.readLine()) != null) {
                reportStorage[reportNum] = line;
                reportNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

    public static int[] parseReport(String report) {
        //switch the report to an array of values
        String[] values = report.split(" ");
   
        //convert the strings to ints.
        int[] numberedReport = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            numberedReport[i] = Integer.parseInt(values[i]);
        }
        return numberedReport;
    }

    public static void evaluateReportValues(int val1, int val2) {

    }

// The levels are either all increasing or all decreasing.
// Any two adjacent levels differ by at least one and at most three.
    public static boolean safeReport( int[] report ){
        boolean reportStatus = false;
        boolean increasing = false;
        boolean decreasing = false;

        for( int i = 0; i < report.length - 1; i++ ) {
            // increasing or decreasing
            if ( (i == 0) && (report[i] > report[i + 1])) {
                decreasing = true;
            } else if ( i == 0 && report[i] < report[i + 1]) {
                increasing = true;
            }

            //check increasing within limit
            if ( increasing &&
                 (report[i] - report[i + 1]) < 0 &&
                 (Math.abs(report[i] - report[i + 1]) >= 1 &&
                  Math.abs(report[i] - report[i + 1]) <= 3) )
                    reportStatus = true;
            //check decreasing within limit
            else if ( decreasing &&
                      (report[i] - report[i + 1]) > 0 &&
                      (Math.abs(report[i] - report[i + 1]) >= 1 &&
                       Math.abs(report[i] - report[i + 1]) <= 3) )
                    reportStatus = true;
            else {
                reportStatus = false;
                i = report.length;
            }
        }

        // System.out.println("Increasing: " + increasing);
        // System.out.println("Decreasing: " + decreasing);
        // System.out.println("Status: " + reportStatus);
        // System.out.println("-------------------------------");

        return reportStatus;
    }

    private static boolean safeAnomaly(int[] badReport) {
        int[] modifiedReport = new int[badReport.length -1];

		for ( int skipLevel = 0; skipLevel < badReport.length; skipLevel++ ) {
			int newReportIndex = 0;
			
			for ( int i = 0; i < badReport.length; i++ ) {
				if ( !(i == skipLevel) ) {
					modifiedReport[newReportIndex] = badReport[i];
					newReportIndex++;
				}
			}
			
			if ( safeReport(modifiedReport) )
				return true;
		}

        return false;
    }

    public static void main(String[] args) {
        
        String[] reports = new String[1000];
        //String[] reports = new String[1000];
        boolean[] goodReport = new boolean[1000];

        loadData(reports);

        System.out.println("Number of reports: " + reports.length);
        //boolean reportStatus;
        int safeReports = 0;
        int safeAnomalyReports = 0;

        for(int i = 0; i < reports.length; i++) {

            int[] reportValues = parseReport(reports[i]);
            
            System.out.println("Report " + i + ": " + reports[i]);
            // reportStatus = safeReport(reports[i]);
            if (safeReport(reportValues)) {
                safeReports++;
                goodReport[i] = true;
            }
            else 
            	goodReport[i] = false;
            	
            if ( !goodReport[i] &&
            	 safeAnomaly(reportValues) )
                safeAnomalyReports++;
             
        }

        // find reports with anomalies

        System.out.println("Safe report count: "+ safeReports);
        System.out.println("Safe report count: "+ safeAnomalyReports);
        System.out.println("Total safe reports: " + (safeReports + safeAnomalyReports));
    }
}
