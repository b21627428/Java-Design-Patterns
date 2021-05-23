package Behavioral.IteratorPattern;

public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Iterator iterator = repository.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
