package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public abstract class Support {

    private String name;
    private Support next;

    protected abstract boolean resolve(Trouble trouble);

    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        }else if (next != null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " is unresolved by " + this + ".");
    }

    public String toString(){
        return "[" + name + "]";
    }
}
