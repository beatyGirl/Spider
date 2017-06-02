package com.tian.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class ElementArrayList implements Element {

    private ArrayList arrayList = new ArrayList();

    public boolean add(Entry entry){
        return arrayList.add(entry);
    }

    @Override
    public void accept(Visitor visitor) {
        Iterator i = arrayList.iterator();
        while (i.hasNext()){
            Entry entry = (Entry)i.next();
            if (entry instanceof File){
                visitor.visit((File)entry);
            }else if (entry instanceof Director){
                visitor.visit((Director)entry);
            }
        }
    }
}
