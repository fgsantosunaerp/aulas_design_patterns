package br.unaerp;

public class NameRepository implements Container {
    public String nomes[] = {"Carlos", "Fernando", "Gabriel", "Fabiano"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int indice;

        @Override
        public boolean hasNext() {
            if (indice < nomes.length)
                return true;
            else 
                return false;
        }

        @Override
        public Object next() {
            return nomes[indice++];
        }
    }
}