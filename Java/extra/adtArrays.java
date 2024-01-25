package com.extra;

class AR {
    int[] tSize = {3, 7, 6, 6, 7};
    int[] eSize = {4, 6, 6, 7, 8};
}

class ConArray {
    int[] tSize;
    int[] eSize;

    public ConArray(int[] tSize, int[] eSize) {
        this.tSize = tSize;
        this.eSize = eSize;
    }

    public int[] gettSize() {
        return tSize;
    }

    public void settSize(int[] tSize) {
        this.tSize = tSize;
    }

    public int[] geteSize() {
        return eSize;
    }

    public void seteSize(int[] eSize) {
        this.eSize = eSize;
    }
}

public class adtArrays {
    public static void main(String[] args) {
        AR ar = new AR();
        ConArray ca = new ConArray(ar.tSize, ar.eSize);

        // The example of accessing and printing the values has been removed.
    }
}
