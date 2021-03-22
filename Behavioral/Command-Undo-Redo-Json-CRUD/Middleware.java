import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Middleware {

    private List<Block> objects;
    private IDAO dao;

    public Middleware(IDAO dao) {
        this.dao = dao;
        this.readFile();
    }

    public void readFile(){
        this.objects = dao.read().stream().map(o -> (Block) o).collect(Collectors.toList());
    }

    public void commit() {
        this.dao.write(Arrays.asList(objects.toArray()));

    }
    public void addElement(Block parameter) {
        this.objects.add(parameter);
    }

    public void removeElement(Block parameter) {
        this.objects.remove(parameter);
    }

    public List<Block> getObjects() {
        return objects;
    }

    public void setObjects(List<Block> objects) {
        this.objects = objects;
    }

    public IDAO getDao() {
        return dao;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
