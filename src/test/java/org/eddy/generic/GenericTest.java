package org.eddy.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eddy on 2017/2/26.
 */
public class GenericTest {

    @Test
    public void test() {
        List<? extends B> list = new ArrayList<>();
        A a = new A();
        B b = new B();
        list.add(a);//编译错误
        list.add(b);//编译错误
    }
}
