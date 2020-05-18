package br.unaerp;

public class ShapeFactory {
    public Shape getShape(String tipoShape){
        if (tipoShape==null){
            return null;
        }
        if (tipoShape.equals("CIRCULO")){
            return new Circle();
        }
        else if (tipoShape.equalsIgnoreCase("RETANGULO")){
            return new Rectangle();
        }
        else if (tipoShape.equalsIgnoreCase("QUADRADO")){
            return new Square();
        }
        return null;
    }
}