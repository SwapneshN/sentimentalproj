package com.swapnesh.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {
    public static void main(String args[]) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String txt = "The ban on upfront commission seems to have dampened interests of those wishing to become independent financial advisors (IFAs).";
        CoreDocument coreDocument = new CoreDocument(txt);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for (CoreSentence sentence : sentences) {
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + "=" + sentence);


        }
    }
}
