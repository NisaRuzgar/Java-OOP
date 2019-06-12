package dataAccess;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JSONWrite
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        // creating JSONObject
        JSONObject jo = new JSONObject();
         
        // putting data to JSONObject
        jo.put("name", "Radiohead");
       
         
        JSONArray jaSong = new JSONArray();
        Map m = new LinkedHashMap(2);
        m.put("title", "Separator");
        m.put("length", "5:20");
        jaSong.add(m);
        
        JSONArray jaAlbum = new JSONArray();
         
        m = new LinkedHashMap(3);
        m.put("title", "The King of Limbs");
        m.put("description", "\"\\n\\tThe King of Limbs is the eighth studio album by English rock band Radiohead, produced by Nigel Godrich. It was self-released on 18 February 2011 as a download in MP3 and WAV formats, followed by physical CD and 12\\\" vinyl releases on 28 March, a wider digital release via AWAL, and a special \\\"newspaper\\\" edition on 9 May 2011. The physical editions were released through the band's Ticker Tape imprint on XL in the United Kingdom, TBD in the United States, and Hostess Entertainment in Japan.\\n      \"");
        m.putAll((Map) jaSong);
        
        jaAlbum.add(m);
         
        jo.put("albums", jaAlbum);
         
        // writing JSON to file:"JSONExample.json" in cwd
        PrintWriter pw = new PrintWriter("music.json");
        pw.write(jo.toJSONString());
         
        pw.flush();
        pw.close();
    }
}
