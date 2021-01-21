package service;

import model.User;

// Type your code
/*Create a class called AstroCalculator inside the service package.*
2.*Create a public method findSign of type String.*
3.*Your method takes User as input and returns a String as output.*
4.*Calculate the sign based on your birth date.*
5.*Return the output as a string.*
*/
public class AstroCalculator{
	public String findsign(User user) {
		String astro_sign= ""; 
        String[] date = user.getDob().split("-");
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[0]);
        if (month == 12){ 
              
            if (day < 22) 
            astro_sign = "Sagittarius"; 
            else
            astro_sign ="Capricorn"; 
        } 
              
        else if (month == 1){ 
            if (day < 20) 
            astro_sign = "Capricorn"; 
            else
            astro_sign = "Aquarius"; 
        } 
              
        else if (month == 2){ 
            if (day < 19) 
            astro_sign = "Aquarius"; 
            else
            astro_sign = "Pisces"; 
        } 
              
        else if(month ==3){ 
            if (day < 21)  
            astro_sign = "Pisces"; 
            else
            astro_sign = "Aries"; 
        } 
        else if (month == 4){ 
            if (day < 20) 
            astro_sign = "Aries"; 
            else
            astro_sign = "Taurus"; 
        } 
              
        else if (month == 5){ 
            if (day < 21) 
            astro_sign = "Taurus"; 
            else
            astro_sign = "Gemini"; 
        } 
              
        else if( month == 6){ 
            if (day < 21) 
            astro_sign = "Gemini"; 
            else
            astro_sign = "Cancer"; 
        } 
              
        else if (month == 7){ 
            if (day < 23) 
            astro_sign = "Cancer"; 
            else
            astro_sign = "Leo"; 
        } 
              
        else if( month == 8){ 
            if (day < 23)  
            astro_sign = "Leo"; 
            else
            astro_sign = "Virgo"; 
        } 
              
        else if (month == 9){ 
            if (day < 23) 
            astro_sign = "Virgo"; 
            else
            astro_sign = "Libra"; 
        } 
              
        else if (month == 10){ 
            if (day < 23) 
            astro_sign = "Libra"; 
            else
            astro_sign = "Scorpio"; 
        } 
              
        else if (month == 11){ 
            if (day < 22) 
            astro_sign = "Scorpio"; 
            else
            astro_sign = "Sagittarius"; 
        }      
		return astro_sign;
	}
}