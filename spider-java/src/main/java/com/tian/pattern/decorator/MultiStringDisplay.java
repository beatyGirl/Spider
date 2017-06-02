package com.tian.pattern.decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class MultiStringDisplay extends Display {

    private List<String> strings = new ArrayList<String>();

    @Override
    public int getColumns() {
        Iterator<String> iterator = strings.iterator();
        String s = "";
        if (iterator.hasNext()){
            s = iterator.next();
        }
        return s.getBytes().length;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        if (row <= strings.size() - 1){
            return strings.get(row);
        }else {
            return null;
        }

    }

    public String add(String s){
        strings.add(s);
        return s;
    }
}
