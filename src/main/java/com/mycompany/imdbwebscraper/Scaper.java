package com.mycompany.imdbwebscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Scaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        final Document document = (Document) Jsoup.connect("https://www.imdb.com/chart/top").get();
             
        
       for(Element row: document.select("table.chart.full-width tr")){
           final String title = row.select(".titleColumn").text();
            final String rating = row.select(".imdbRating").text();
            
           System.out.printf("title: %s  rating of : %s \n",title,rating);
       }
    }
    
}
