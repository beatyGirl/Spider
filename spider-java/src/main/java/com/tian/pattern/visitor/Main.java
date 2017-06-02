package com.tian.pattern.visitor;


import com.tian.pattern.decorator.Display;

import java.util.Iterator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class Main {

    public static void main(String args[]){
        try {

            Director rootDir = new Director("root");
            Director bindDir = new Director("bind");
            Director tmpDir = new Director("tmp");
            Director usrDir = new Director("usr");

            rootDir.add(bindDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            bindDir.add(new File("vi",10000));
            bindDir.add(new File("latex",20000));
            //rootDir.accept(new ListVisitor());

            Director yuki = new Director("yuki");
            Director hanako = new Director("hanako");
            Director tomura = new Director("tomura");

            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);

            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanako.add(new File("memo.txt",300));
            hanako.add(new File("index.html",350));
            tomura.add(new File("game.doc",400));
            tomura.add(new File("junk.mail",500));

            FileFoundVisitor visitor = new FileFoundVisitor(".html");
            rootDir.accept(visitor);

            System.out.println("HTML files are:");
            Iterator iterator = visitor.getFoundFiles();
            while (iterator.hasNext()){
                File file = (File)iterator.next();
                System.out.println(file.toString());
            }



            //练习题13-3
            Director root1 = new Director("root1");
            root1.add(new File("diary.html",100));
            root1.add(new File("index.html",200));

            Director root2 = new Director("root2");
            root2.add(new File("diary.html",1000));
            root2.add(new File("index.html",2000));

            ElementArrayList list = new ElementArrayList();
            list.add(root1);
            list.add(root2);
            list.add(new File("etc.html",1234));

            list.accept(new ListVisitor());
        }catch (FileTreatmentException e){
            e.printStackTrace();
        }


    }
}
