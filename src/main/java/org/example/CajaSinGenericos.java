package org.example;

import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos(){

    }

    public CajaSinGenericos(Object[] contents) {
        this.content = contents;
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int pos, Object objeto){
        content[pos] = objeto;
    }
    public Object get (int pos){
        return content[pos];
    }
}
