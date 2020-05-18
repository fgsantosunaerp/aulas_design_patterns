package br.unaerp;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    //construtor
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Olá Mundo!");
    }
}