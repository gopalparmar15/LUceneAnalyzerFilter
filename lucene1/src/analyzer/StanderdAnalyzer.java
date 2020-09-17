package analyzer;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.TermAttribute;
import org.apache.lucene.util.Version;

import java.io.IOException;
import java.io.StringReader;

public class StanderdAnalyzer {
    void standerdAnalyzer()throws IOException
    {
        //create string
        String string="my gmail id - parmargopal055@gmail.com";
        //create StandardAnalyzer
        Analyzer analyzer=new StandardAnalyzer(Version.LUCENE_36);
        //create token in token stream
        TokenStream tokenStream=analyzer.tokenStream(null,new StringReader(string));
        //add token using
        TermAttribute termAttribute=tokenStream.addAttribute(TermAttribute.class);
        //while loop
        while (tokenStream.incrementToken())
        {
            //print termAttribute
            System.out.println(termAttribute);
        }
    }
    public static void main(String[] args)throws IOException {
        //WhitespaceAnalyzer class object
        StanderdAnalyzer standerdAnalyzer=new StanderdAnalyzer();
        //standerdAnalyzer method call
        standerdAnalyzer.standerdAnalyzer();
    }
}
