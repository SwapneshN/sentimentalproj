package com.swapnesh.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class LemmaExample {
    public static void main(String args[]) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String txt = "Hey,I am Swapnesh . I am a software Developer";
        CoreDocument coreDocument = new CoreDocument(txt);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for (CoreLabel coreLabel : coreLabelList) {
            String lemma = coreLabel.lemma();
            System.out.println(coreLabel.originalText() + "=" + lemma);


        }

    }
}
