package src;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class App {
	   public static void main(String[] args) {
		//String List Of AST File Name
	    ArrayList<String> listOfAst=getNamesOfAsts();
		int numOfFile=listOfAst.size();   
		
		JavaProject p = new JavaProject("myProject");
		
	    for(int num=0; num<numOfFile;num++) {
	    
	    	//For each file new class created
	    	Classx c = new Classx((num+1) +" Class");
		    
		try {
	         File inputFile = new File("src/" + listOfAst.get(num));
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("MethodDeclaration");
	        // NodeList nList2 = doc.getElementsByTagName("VariableDeclarator");
	       
	         System.out.println("----------------------------");
	        
	         
	         /*for(int a=0; a < nList2.getLength();a++) {
		            Node nNode2 = nList2.item(a);
   
	        	 System.out.println((a+1) + "\n A2 Element :" + nNode2.getNodeName());

	         }*/
	         
	         
	         //All Methods
	         System.out.println(nList.getLength());
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	        	//method created
	     		Method m = new Method("m1");
	            Node nNode = nList.item(temp);
	            System.out.println((temp+1) + "\n Current Element :" + nNode.getNodeName());
	          
	         }
	         
	         
	         System.out.println("............................");
	         
	         //Variable
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	        	    //method created
		     		Method m = new Method("m1");
		            Node nNode = nList.item(temp);
		           /* if ((nNode.getNodeName().contains("LocalVariableDeclarator"))) {
		                Element eElement = (Element) nNode;
		                System.out.println("First Name : " 
		                        + eElement
		                        .getElementsByTagName("VariableDeclarator")
		                       ); 
		         
		            }*/
		            
	                Element eElement = (Element) nNode;
	                NodeList nlist3=eElement.getElementsByTagName("LocalVariableDeclaration");
	                for(int a=0;a< nlist3.getLength();a++) {
	            		Variable var = new Variable("Variable");
	                	Node n=nlist3.item(a);
	            		m.addVariable(var);
	                	System.out.println(n+"thiss is Variable"
	                			+ "");
	                	
	                }
	        		c.addClassComponent(m);

	         }
	         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		p.addClass(c);
		   
			
			System.out.println("NumberOf Class in Project"+p.getNumberOfClasses());
			
			System.out.println("Num of Methods "+ c.getNumberOfMethods());
			//System.out.println(v.getNumberOfMethods());
			System.out.println("Avg Num of methods" + p.getAvgNumbOfMethodsPerClass());
			System.out.println();

	 }
		
	 
	    
	    
		/*
		JavaProject p = new JavaProject("myProject");
		Classx c = new Classx("first class");
		Classx v = new Classx("seconf class");
	
		Method m = new Method("m1");
		Method m2 = new Method("m2");
		Method m3 = new Method("m3");
		Method m4 = new Method("m2");
		Method m5 = new Method("m3");
		
		Variable c1 = new Variable("varib11111");
		Variable c2 = new Variable("varib2222222222");
		Variable c3 = new Variable("varib11111");
		Variable c4 = new Variable("varib2222222222");
		Variable c5 = new Variable("varib11111");
		Variable c6 = new Variable("varib2222222222");
		Variable c7 = new Variable("varib11111");
		Variable c8 = new Variable("varib2222222222");
		
		m.addVariable(c1);
		m.addVariable(c2);
		c.addClassComponent(m);
		
		m2.addVariable(c3);
		c.addClassComponent(m2);
		c.addClassComponent(c4);
		
		m3.addVariable(c5);
		c.addClassComponent(m3);
		
		p.addClass(c);
		
		
		m4.addVariable(c6);		
		m4.addVariable(c7);
		v.addClassComponent(m4);
		
		m5.addVariable(c8);
		v.addClassComponent(m5);
		
		p.addClass(v);
		
		System.out.println(p.getNumberOfClasses());
		
		System.out.println(c.getNumberOfMethods());
		System.out.println(v.getNumberOfMethods());
		System.out.println(p.getAvgNumbOfMethodsPerClass());
		System.out.println();
		*/
	}
	   
	   
       public static ArrayList<String> getNamesOfAsts() {
				File folder = new File("src");
				File[] listOfFiles = folder.listFiles();
				ArrayList<String> namesOfAsts = new ArrayList<String>();
			    for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile()) {
			    	  if(listOfFiles[i].getName().contains(".ast")) {
			    	        namesOfAsts.add(listOfFiles[i].getName());
			    	        System.out.println(listOfFiles[i].getName());
			    	  }
			      }
			    }
			   
				return namesOfAsts;    
		 } 
}
