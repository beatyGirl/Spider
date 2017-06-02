package com.tian.pattern.visitor;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class FileFoundVisitor extends Visitor {

    private String name;

    private ArrayList entries = new ArrayList();
    public FileFoundVisitor(String name){
        this.name = name;
    }
    @Override
    public void visit(File file) {
        if (file.getName().contains(name)){
            entries.add(file);
        }
    }

    @Override
    public void visit(Director director) {

        Iterator iterator = director.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            if (entry.getName().contains(name)){
                entries.add(entry);
            }else {
                entry.accept(this);
            }
        }

    }

    public Iterator getFoundFiles(){
        Iterator i = entries.iterator();
        return i;
    }




}
