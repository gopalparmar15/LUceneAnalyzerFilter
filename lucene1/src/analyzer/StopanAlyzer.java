package analyzer;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.TermAttribute;
import org.apache.lucene.util.Version;

import java.io.IOException;
import java.io.StringReader;

class StopAnalyzer {
    void stopanAnalyzer()throws IOException
    {
        //create string
        String str="the emailid parmargopal@gmail.com";
        //create StopAnalyzer
        Analyzer analyzer=new org.apache.lucene.analysis.StopAnalyzer(Version.LUCENE_36);
        //create token in token stream
        TokenStream tokenStream=analyzer.tokenStream("a",new StringReader(str));
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
        //stopAnalyzer class object
        StopAnalyzer stopAnalyzer=new StopAnalyzer();
        //call stopAnalyzer() method
        stopAnalyzer.stopanAnalyzer();

    }
}
