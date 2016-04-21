package com.asigner.elizabot.eliza;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *  Eliza Application.
 */
public class ElizaApp {

    public static void main(String args[]) {
        try {
            Eliza eliza = new Eliza();
            DataInputStream in = new DataInputStream(System.in);
            String s = "Hello.";
            while (true) {
                System.out.println(">> " + s);
                String reply = eliza.processInput(s);
                System.out.println(reply);
                if (eliza.isFinished()) break;
                s = in.readLine();
                if (s == null) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
