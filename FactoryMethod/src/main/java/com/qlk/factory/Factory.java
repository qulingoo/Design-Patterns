package com.qlk.factory;

public class Factory {
    public  AbstractPerson getMan(){
        return new Man();
    }
    public AbstractPerson getWoMan(){
        return new WoMan();
    }
    public static void main(String[] args){
        Factory factory = new Factory();

        AbstractPerson man = factory.getMan();
        man.sex();
    }
}
