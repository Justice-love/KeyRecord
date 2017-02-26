package org.eddy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eddy on 2017/2/26.
 */
public class Type {

    public static void main(String[] args) {
        List<? super A> list = new ArrayList<>();
        B b = new B();
        A a = new A();
        list.add(a);
    }
}
