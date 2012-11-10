package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void simplerender(){
    	
    	String fname="bala";
    	String sname="kumar";
    	render(fname,sname);
    }
    public static void rxml(){
    	String fname="bala";
    	renderXml("<name>"+fname+"</name>");
    }

    public static void rjson(){
    	String fname="bala";
    	renderJSON("{\"messages\": " + fname +"}");
    	    	
    }
    public static void rtext(){
    	String fname="bala";
    	renderText(fname);
    }
    public static void rdirect(){
    	redirect("http://www.google.com");
    }
    public static void rtemplate(){
    	String fname="bala";
    	String sname="kumar";
    	renderTemplate("app/views/Application/simplerender.html",fname,sname);
    	
    }
}