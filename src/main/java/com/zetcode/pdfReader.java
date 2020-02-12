package com.zetcode;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class pdfReader {
    static void testParser(String inputDirectory) throws IOException {
        File myFile = new File(inputDirectory);

        try (PDDocument doc = PDDocument.load(myFile)) {

            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(doc);

            System.out.println("Text size: " + text.length() + " characters:");
            System.out.println(text);
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++++++");



        }
    }

}
