package com.company;

public class SkyViewRunner {
    public static void main(String[] args) {
        double[] scan = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.2, 1.6, 0.6, 0.9};
        double[] scan2 ={0.3, 0.7, 0.8, 0.4, 1.4, 1.1};

        SkyView sv1=new SkyView(numRows:4, numCols:3, scan);
        SkyView sv2=new SkyView(numRows:3, numCols:2, scan2);

        System.out.println(sv1);
        System.out.println(sv2);

        System.out.println("Average 1:"+ sv1.getAverage(startRow:1, endRow:3, startCol:0, endCol:2));
        System.out.println("Average 1:"+ sv2.getAverage(startRow:0, endRow:1, startCol:0, endCol:1));


    }
}
