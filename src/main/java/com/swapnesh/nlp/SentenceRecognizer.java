package com.swapnesh.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {
    public static void main(String args[]) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String txt = "Hey,I am Swapnesh . I am a software Developer";
        CoreDocument coreDocument = new CoreDocument(txt);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for(CoreSentence sentence : sentences) {
            System.out.println(sentence.toString());
        }


    }
}
