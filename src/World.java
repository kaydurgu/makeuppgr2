
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class World {
    String[] cov_d = new String[4];
    World() throws IOException{
        String urlWorld = "https://www.worldometers.info/coronavirus/";
        Document document_covd = Jsoup.connect(urlWorld).get();
        org.jsoup.select.Elements All_covd = document_covd.select("div.maincounter-number");
        org.jsoup.select.Elements spns_covd = All_covd.select("span");
        int j = 0;
        for (Element id : spns_covd){
            j++;
            cov_d[j] = id.text();
        }
    }
    public String world_total(){
        return cov_d[1];
    }
    public String world_deaths(){
        return cov_d[2];
    }
    public String world_recovered(){
        return cov_d[3];
    }
     @Override
    public String toString() {
        return "World{" +
                "cov_d=" + Arrays.toString(cov_d) +
                '}';
    }

}
