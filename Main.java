/******
The best I could do I struggled with time and sorting
all of the characters in string  

****/
public class Main{
  public static <T> void main(T[] elements){
  for(T element: elements){
    System.out.printf("%s ", element);
    System.out.println();
  }
  System.out.println();
  }
  public static void main(String[] args){
    Character[] charA={'s','t','r','l','e','n'};
    Character[] char2={'s','t','r','l','w','r' };
    Character[]char3={'s','t','r','u','p','r' };
    Character[]char4={'s','t','r','c','a','t'};
    Character[]char5={'s','t','r','c','p','y' };
    Character[]char6={'s','t','r','c','m','p'};



    main(charA);
    main(char2);
    main(char3);
    main(char4);
    main(char5);
    main(char6);
    
  }
}