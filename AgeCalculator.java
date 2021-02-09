package com.jayo;

import java.util.*;
import java.text.*;
/**
 * Age Calculator is used to calculate your age.
 *
 * @author (John Oye)
 * @version (V2.0)
 */
public class AgeCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year Of Birth: ");
        int yob = sc.nextInt();
        System.out.println("Input Month Of Birth: ");
        int mob = sc.nextInt();
        System.out.println("Input Day Of Birth: ");
        int dob = sc.nextInt();
        Date d = new Date();
        SimpleDateFormat y = new SimpleDateFormat("yyyy");
        SimpleDateFormat m = new SimpleDateFormat("M");
        SimpleDateFormat db = new SimpleDateFormat("d");
        int yo = Integer.parseInt(y.format(d));
        int mo = Integer.parseInt(m.format(d));
        int ds = Integer.parseInt(db.format(d));
         
        int age = yo - yob;
        if(mob > mo) {
           age--;
           System.out.println("You are "+age+" Years Old");
        } else if(mob == mo) {
         if(dob < ds) {
             age--;
             System.out.println("You are "+age+" Years Old");
            } else if(dob == ds) {
                System.out.println("You are "+age+" Years Old");
            }
        }
       
        
        
        
        
    }
}
