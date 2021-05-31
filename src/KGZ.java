

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class KGZ {
    String[] cov_d = new String[4];
    KGZ() throws IOException{
        String urlKGZ = "https://www.worldometers.info/coronavirus/country/kyrgyzstan/";
        Document document_cov = Jsoup.connect(urlKGZ).get();
        org.jsoup.select.Elements All_cov = document_cov.select("div#maincounter-wrap");
        org.jsoup.select.Elements spns_cov = All_cov.select("span");
        int j = 0;
        for (Element i_cov : spns_cov){
            j++;
            cov_d[j] = i_cov.text();
        }
    }
    public String KGZ_total(){
        return cov_d[1];
    }
    public String KGZ_deaths(){
        return cov_d[2];
    }
    public String KGZ_recovered(){
        return cov_d[3];
    }
     @Override
    public String toString() {
        return "KGZ{" +
                "cov_d=" + Arrays.toString(cov_d) +
                '}';
    }

}
