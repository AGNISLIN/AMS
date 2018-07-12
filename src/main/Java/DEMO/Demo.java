package DEMO;

import java.util.List;
import java.util.Map;

public class Demo {
    int v;
    String s;
    K k;
    D2 d2;
    List<Object> list;
    Map<String, D2> d2s;
    public Demo(){}
    public Demo(int v){
        this.v = v;
    }
    public Demo(int v, K k){
        this.k = k;
        this.v = v;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setD2(D2 d2) {
        this.d2 = d2;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setD2s(Map<String, D2> d2s) {
        this.d2s = d2s;
    }
}
