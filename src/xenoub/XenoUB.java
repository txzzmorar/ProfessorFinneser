/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenoub;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Tarun
 */
public class XenoUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        int i = 0;
        int tasks = 100;
        Random rn = new Random();
        int Number = 01246276121 + rn.nextInt(999999999-01246276121 + 1);
        String email = Number+"@saimorar.com";
        while (i < tasks){
            Document doc = Jsoup.connect("https://www.adidas.com/com/apps/mi_ultraboost_xeno/application/crm.php")
                    .header("Accept", "*/*")
                    .header("Accept-Encoding","gzip, deflate, br")
                    .header("Accept-Language","en-US,en;q=0.8")
                    .header("Vary","Accept-Encoding")
                    .header("Connection","keep-alive")
                    .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                    .header("Host","www.adidas.com")
                    .header("Origin","https://www.adidas.com")
                    .header("Referer", "https://www.adidas.com/us/mi_ultraboost_xeno")
                    .header("User-Agent","Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Mobile Safari/537.36")
                    .data("firstName","Taylor")
                    .data("lastName","Ryan")
                    .data("dateOfBirth","1999-10-10")
                    .requestBody(email)
                    .data("email",email)
                    .data("consent","N")
                    .data("gender","F")
                    .data("market","US")
                    .data("language","EN")
                    .post();
            //System.out.println("Avoiding Ban");
            System.out.println("Success Fam || Entry #"+i);
            i++;
            Thread.sleep(2000);
            
    }
    
    
}
}
