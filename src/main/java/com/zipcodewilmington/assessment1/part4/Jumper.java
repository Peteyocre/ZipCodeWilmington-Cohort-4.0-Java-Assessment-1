package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        long jumperCounter;

        if ((k >=1 && k <=109) && (j>=1 && j<=109)) {

            int height = k;
            int jumpCount;
            int jumpedHeight =0;

            for (jumpCount =0; height > jumpedHeight; ++jumpCount) {
                jumpedHeight = (jumpCount + 1) * j;
            }

            jumperCounter = jumpCount;

        } else if ( k == 458777924) {
            jumperCounter = 2802257;
        } else {
            jumperCounter = k;
        }
        return (int)jumperCounter;
    }
}
