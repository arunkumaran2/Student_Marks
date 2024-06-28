package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

	@GetMapping("/givenmarks") //localhost:8080/givenmarks
	public ModelAndView display()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		return mav;
	}
	
	@GetMapping("/calculateMarks")
	public ModelAndView Calculate(SSLC givemark)
	{
		int Tamil = givemark.getTamil(); //Tamil,English,Maths,Science,Socialscience;
		int English = givemark.getEnglish();
		int Maths = givemark.getMaths();
		int Science = givemark.getScience();
		int Socialscience = givemark.getSocialscience();
		
	    int Total_mark =Tamil + English + Maths + Science + Socialscience;
	    float Percentage = ((float)Total_mark/5);
		
	    int highestMark = Math.max(Tamil, Math.max(English, Math.max(Maths, Math.max(Science, Socialscience))));
        int lowestMark = Math.min(Tamil, Math.min(English, Math.min(Maths, Math.min(Science, Socialscience))));
        
	    
	    ModelAndView mav = new ModelAndView();
				
	    mav.addObject("chagre", Tamil);
	    mav.addObject("TamilResult", Tamil >= 35 ? "Pass" : "Fail");
	    
	    mav.addObject("chagre1", English);
	    mav.addObject("EnglishResult", English >=35 ? "Pass" : "Fail");
	    
	    mav.addObject("chagre2", Maths);
	    mav.addObject("MathsResult", Maths >=35 ? "Pass" : "Fail");
	    
	    mav.addObject("chagre3", Science);
	    mav.addObject("ScienceResult", Science >=35 ? "Pass" : "Fail");
	    
	    mav.addObject("chagre4", Socialscience);
	    mav.addObject("SocialscienceResult", Socialscience >=35 ? "Pass" : "Fail");
	    
	    mav.addObject("chagre5", Total_mark);
	    mav.addObject("chagre6", Percentage);
	    mav.addObject("chagre7", highestMark);
	    mav.addObject("chagre8", lowestMark);
	    
	    if (Percentage >= 70)
	    {
	    	//System.out.println("class : First class");
	    	mav.addObject("chagre9", "First class");
	    	//mav.setViewName("class.jsp");
	    }
	    else if (Percentage >=50 && Percentage <=70)
	    {
	    	//System.out.println("class : Second class");
	    	mav.addObject("chagre10", "Second class");
	    	//mav.setViewName("class.jsp");
	    }
	    else
	    {
	    	//System.out.println("class : Third class");
	    	mav.addObject("chagre11", "Third class");
	    	//mav.setViewName("class.jsp");
	    }
	    mav.setViewName("output.jsp");
	    //mav.setViewName("class.jsp");
		return mav;
		
	}
}
