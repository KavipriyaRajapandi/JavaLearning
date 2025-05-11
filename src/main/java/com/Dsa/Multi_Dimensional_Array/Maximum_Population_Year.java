package com.Dsa.Multi_Dimensional_Array;
/*
Approach to Solve the Problem
Tracking Population Changes Efficiently
Instead of iterating through each year for every person (which would be slow), we use an efficient difference array technique:

We increment the population in the birthi year (because the person is born and alive).
We decrement the population in the deathi year (because they die and are no longer counted in that year).
Processing Yearly Population

We maintain an array that keeps track of the population change for each year.
We iterate through this array, maintaining a running sum to compute the population at each year.
Finding the Earliest Year with Maximum Population

As we compute the population year by year, we keep track of:
The maximum population found so far.
The earliest year that reaches this population.

 */
public class Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};

        int[] population = new int[2051];

        for(int i=0;i<logs.length;i++){
            int birthYear = logs[i][0];
            int deathYear = logs[i][1];

            population[birthYear]++;
            population[deathYear]--;
        }

        int maxPop = 0;
        int earliestYear = 0;
        int currentPop = 0;

        for(int year = 1950 ; year<=2050;year++){
            currentPop += population[year];

            if(currentPop > maxPop){
                maxPop = currentPop;
                earliestYear = year;
            }
        }

        System.out.println(earliestYear);
    }
}
