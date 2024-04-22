package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSselectors {

	static WebDriver driver;
	
	public static void main(String[] args) {

		
		//driver.findElement(By.cssSelector(null));
		
		//id:
		// #id
		// #attrValue
		// #username
		// tagname#id
		// input#username
		
		
		//class:
		// .class
		// tagname.class
		// .login-email
		//  input.login-email
		
		//class+id:
		// .class#id
		// #id.class
		// input.login-email#username
		// input#username.login-email
		
		//.c1.c2.c3.c4...cn
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		// input.form-control#username.private-form__control.login-email
		
		
		// css with attributes:
		// tagname[attr='value'] - css
		// //tagname[@attr='value'] -xpath

		// with multiple attribute:
		// tagname[attr='value'][type='text'][name='email'] --CSS
		// input[id='input-email'][type='text'][name='email']
		// input#input-email[type='text'][name='email']
        // //input[@id='username' and type='email']  --Xpath
		 
		
		// Contains:
		// input[placeholder*='Address']

		// starts with:
		// input[placeholder^='E-Mail']

		// ends with:
		// input[placeholder$='Address']

		// text in css : Not available

		// parent to child:
		// form#hs-login > div -->direct child -- 8
		// form#hs-login div -->direct+indirect -- 22

		// select#Form_getForm_Country > option
		// select#Form_getForm_Country option

		//Major Drawbacks
		// child to parent: not allowed
        // child to grandparent: not allowed
        // preceding sibling: not allowed

		// sibling in css:
		// label[for='input-email']+input#input-email -- immediate following sibling
        // option[value='Algeria']+option -- immediate following sibling
		// option[value='Algeria'] ~ option -- all following sibling
		
		
		
		// comma in css:
		// input#username,input#password,button#loginBtn
        
//		int mand_fields_count = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn")).size();
//		
//		if(mand_fields_count == 4) {
//			System.out.println("all imp mandatory fields are present");
//		}
		
		
		// not in css:
        // div.form-group > input.form-control:not(#input-email)
		
		// index:
		// select#getForm_Country > option:nth-of-type(4)
		//  select#getForm_Country > option:nth-of-type(n) -- all
		// select#getForm_Country > option:first-child
		// select#getForm_Country > option:nth-child(even)
		// select#getForm_Country > option:nth-child(odd)
		//  select#getForm_Country > option:nth-last-child(2) -- second last element
		// select#getForm_Country > option:nth-of-type(n+4) --starts from 4 add

		// odd and even in xpath
		// (//select[@id='']/option)[position() mod 2 = 1] --> odd
		// (//select[@id='']/option)[position() mod 2 = 0] --> even

		// cascaded class in css
		// tagname.c1.c2.c3.....

		//                 xpath       vs       css
		// 1.performance:  good                   good
		// 2.syntax: complex simple
		// 3.backward: yes no
		// 4.sibling: yes yes -- only following
		// 5.text: yes no
		// 6.ancestor/parent: yes no
		// 7.ends-with: no yes
		// 8.index: yes yes+1
		// 9.not: yes yes
		// 10.comma: no yes
		// 11.SVG: yes no
         //12.shadowDOM: no yes
		//13.Psuedo: no yes
		//14.last:yes yes
		//15.first:no yes
		
		
		
		
	}

}
