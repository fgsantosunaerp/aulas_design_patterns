package br.unaerp;

public class App {
    public static void main( String[] args ) {

        // Implementação do Padrão Factory
        /*
        ShapeFactory obj = new ShapeFactory();

        Shape s1 = obj.getShape("CIRCULO");
        s1.draw();

        Shape s2 = obj.getShape("quadrado");
        s2.draw();

        Shape s3 = obj.getShape("Retangulo");
        s3.draw();
        */

        //Implementação do padrão Singleton
        //SingleObject obj = new SingleObject(); -> forma errada de criar uma instancia dessa classe
        /*
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
        */

        //Implementação do Iterator
        NameRepository repositorio = new NameRepository();
        for(Iterator i = repositorio.getIterator(); i.hasNext();){
            String nome = (String) i.next();
            System.out.println("Nome: " + nome);
        }
    }
}
