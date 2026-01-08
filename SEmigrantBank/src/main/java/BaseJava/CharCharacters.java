package BaseJava;

public class CharCharacters extends MethodOverloading {
public static void main(String[] args) {
		
	CharCharacters obj = new CharCharacters();
	obj.M_Overloading(400	);
	obj.M_Overloading(300, 100);
	obj.M_Overloading("JJ", "Ahmad");

	
		char a = 'a';
		char b = 'b';
		
		//char c= a+b;     NOT allowed to do this way you have to casting it first line line 12th 
		System.out.println((char)('c'));
		System.out.println(a<b);
		System.out.println((int)('c'+'b'));
	}
}
