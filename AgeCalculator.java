package com.jayo;

import java.util.*;
import java.text.*;
/**
 * Used for Calculating Ones Age.
 *
 * @author (John Oye)
 * @version (1.1)
 */
public class AgeCalculator
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Date Of Birth(dd/M/yyyy): ");
        String dob = sc.nextLine();
        String a1[] = dob.split("/");
       
        
        int m = Integer.parseInt(a1[1]);
       
        int d = Integer.parseInt(a1[0]);
        int y = Integer.parseInt(a1[2]);
   
        Date date = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat mon = new SimpleDateFormat("M");
        SimpleDateFormat day = new SimpleDateFormat("d");
        int yo = Integer.parseInt(year.format(date));
        int mo = Integer.parseInt(mon.format(date));
        int ds = Integer.parseInt(day.format(date));
         int age = yo - y;
        if(m > mo) {
           age--;
           System.out.println("You are "+age+" Years Old");
        } else if(m == mo) {
         if(d < ds) {
             age--;
             System.out.println("You are "+age+" Years Old");
            } else if(d == ds) {
                System.out.println("You are "+age+" Years Old");
            }
        }
       
        
        
        
        
        
    }
}
