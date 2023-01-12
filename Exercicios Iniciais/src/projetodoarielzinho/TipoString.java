package projetodoarielzinho;

public class TipoString {
public static void main(String[] args) {
	String a = "     aadasdasdasds        a   ";
	System.out.println(a.length());
	System.out.println(a.equals("asdasdasdasdas"));
	System.out.println(a.codePointAt(0));
	System.out.println(a.replace("aadasdasdasdsa", "truco"));
	
}
}
