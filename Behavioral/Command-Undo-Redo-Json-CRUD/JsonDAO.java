import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonDAO implements IDAO{
    @Override
    public List<Object> read() {
        return new ArrayList<>();
    }

    @Override
    public void write(List<Object> objects) {
        objects.forEach(block ->{
            System.out.println(Block.convertBlockToJsonString((Block) block));
        });
    }
}
