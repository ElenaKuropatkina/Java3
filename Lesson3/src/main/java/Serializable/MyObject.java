package Serializable;

import java.io.Serializable;

public class MyObject implements Serializable {
    int i;
    double j;
    String s;

    public MyObject(int i, double j, String s){
        this.i = i;
        this.j = j;
        this.s = s;
    }

    public String printObj(){
        return "object = " + i + " " + j + " " + s;
    }
}
