/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eric.calculator;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author eric.lu
 */
@ManagedBean
@SessionScoped
public class CalculatorController {
    private String display, operation;
    private int tmp;
    
    @PostConstruct
    public void init(){
        display="";
    }
    
    public void clear(){
        display=display.substring(0,display.length()-1);        
    }
    
    public void calculate(){
        int value=Integer.parseInt(display);
        if("+".equals(operation)){
            display=(tmp+value)+"";
        }else if("-".equals(operation)){
            display=(tmp-value)+"";
        }else if("*".equals(operation)){
            display=(tmp*value)+"";
        }else if("/".equals(operation)){
            display=(tmp/value)+"";
        }
    }
    
    public void addOperation(String operation){
        tmp= Integer.parseInt(display);
        this.operation=operation;
        display="";
    }
    
    public void add(String digit){
        display=display+digit;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    
    
}
