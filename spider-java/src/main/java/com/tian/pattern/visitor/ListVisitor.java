package com.tian.pattern.visitor;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Iterator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";
    @Override
    public void visit(File file) {

        System.out.println(currentDir + "/" + file);

    }

    @Override
    public void visit(Director director) {
        System.out.println(currentDir + "/" + director);
        String saveDir = currentDir;

        currentDir = currentDir + "/" + director.getName();

        Iterator iterator = director.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
