/*1.22.25
*melike yildirim
*this creates a countries quiz 
*i just watched like probably an hours worth of tf2 animations while making this
*gotta say sniper is still my favorite
*even if he doesn't show up that much
*JARATE!
*/

public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;

  // add constructors
  public Country(String initName, String initCapital, String initLanguage,String initImageFile ){
    name = initName;
    capital = initCapital;
    language = initLanguage;
    imageFile=initImageFile; 
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
  return name;
  }

  public String getCapital(){
  return capital;
}
public String getLanguage(){
  return language;
}  
public String getImageFile(){
  return imageFile;
}

  // Write a toString() method that returns a co ncatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
public String toString(){
  return( name + "'s capital is " + capital + " and its primary language is " + language);
}

  
}