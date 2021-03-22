import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Block {
    private HashMap<String, Block> blockMap;
    private HashMap<String, Object> stringMap;
    private HashMap<String, List<Block>> listMap;

    public Block(){
        this.blockMap = new HashMap<>();
        this.stringMap = new HashMap<>();
        this.listMap = new HashMap<>();
    }

    public HashMap<String, Object> getStringMap() {
        return stringMap;
    }

    public HashMap<String, Block> getRowMap() {
        return blockMap;
    }

    public HashMap<String, List<Block>> getListMap() {
        return listMap;
    }

    public void addStringStringPair(String key, Object value){
        this.stringMap.put(key, value);
    }

    public void addStringBlockPair(String key, Block block){
        this.blockMap.put(key, block);
    }

    public void addStringListPair(String key, List<Block> value){
        this.listMap.put(key, value);
    }

    public static String convertBlockToJsonString(Block block){
        String result = "{";
        for (Map.Entry<String, Object> entry : block.stringMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Boolean){
                result += "\""+ key + "\":" + value + ",";
            }
            else if(value instanceof List){
                /*result += "[";
                value = (List<Block>) value;
                for (Block temp: value){

                }
                result += "]";*/
            }
            else{
                result += "\""+ key + "\":\"" + value + "\",";
            }

        }
        for (Map.Entry<String, Block> entry : block.blockMap.entrySet()) {
            String key = entry.getKey();
            Block value = entry.getValue();
            result += "\"" + key + "\":" + convertBlockToJsonString(value);
        }

        result += "}";
        JSONObject object = new JSONObject(result);

        return object.toString(4);
    }

}
