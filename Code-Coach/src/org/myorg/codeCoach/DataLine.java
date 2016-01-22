/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.codeCoach;

import java.util.StringTokenizer;

/**
 *
 * @author bakamedi
 */
public class DataLine {
    private int startLine;
    private int endLine;
    private String wordKey;
    private String line;

    public DataLine(int startLine, int endLine, String line) {
        this.startLine = startLine;
        this.endLine = endLine;
        this.line = line;
        this.wordKey = " ";
    }

    

    public int getStartLine() {
        return startLine;
    }

    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "\nLine : "+line+"\nStart Line : "+startLine+"\n End Line : "+endLine;
    }
    
    public void calculateStartEnd(){
        int calculate = (this.endLine - this.startLine);
        if(calculate >=10 ){
            System.out.println("Line : "+this.startLine+" this "+wordKey+" is to much code is a better way write a smallest code");
        }
        if(calculate == 2 || calculate == 1){
            System.out.println("Line : "+this.startLine+" this "+wordKey+" is EMPTY o too Short you should erased");
        }
    }
    
    public void getNameLine(){
        int numTokens = 0;
        String s2;
        String cadena;
        StringTokenizer st = new StringTokenizer (this.line);
        while (st.hasMoreTokens()){
            s2 = st.nextToken();
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + s2);
            
            if (s2.equals("if")){
                this.wordKey = s2;
            }
            else if (s2.equals("else")){
                this.wordKey = s2;
            }
            else if (s2.equals("while")){
                this.wordKey = s2;
            }
            else if (s2.equals("void")){
                this.wordKey = s2;
            }
            else if (s2.equals("for(int")){
                this.wordKey = s2;
            }
            else if (s2.equals("else if")){
                this.wordKey = s2;
            }
            else if (s2.equals("switch")){
                this.wordKey = s2;
            }
            else if (s2.equals("try")){
                this.wordKey = s2;
            }
        }
    }
    
}
