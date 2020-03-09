import JSON.ConvertToJSON;
import org.json.JSONException;

import java.io.FileNotFoundException;

public class TestMain
{
    public static void main(String[] args) throws JSONException, FileNotFoundException {
        ConvertToJSON c= new ConvertToJSON();
        c.convertToJSON();
    }
}
