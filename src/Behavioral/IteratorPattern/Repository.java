package Behavioral.IteratorPattern;

public class Repository implements Iterable {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                index += 1;
                return names[index-1];
            }
            return null;
        }
    }

}


