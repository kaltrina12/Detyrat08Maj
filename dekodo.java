import javax.swing.*;
public class dekodo {
	public static void main(String[] args)
	{ int[] code = new int[27]; // this is the translate table
	
	int k = new Integer(JOptionPane.showInputDialog
	("type the basic number (an integer) ")).intValue();//type 1
	code[0] = k;
	for ( int i = 1; i != code.length; i = i+1 )
	{ code[i] = (int)((code[i-1] * 1.3) + 1); } //another code system
	String answer = "";
	boolean processing = true;
	while ( processing )
	{ String input = JOptionPane.showInputDialog
	("type an integer you want to decode" +
	"(or nothing to finish): ");//type 1 2 3 4 6 then OK if u want to see "abcd" in console
	if ( input.equals("") )
	{ processing = false; }
	else { char c = decode(code, new Integer(input).intValue());
	answer = answer + c;
	}
	}
	System.out.println(answer);
	}
	/** dekodo e përkthen një kod (numër i plotë) në karakter
	* @param kodi - vargu që i mban kodet për ' ', 'a', 'b', ..., 'z'
	* @param i - numri i plotë që do të dekodohet
	* @return (kthen) karakterin përkatës, ose '*' nëse numri nuk dekodohet */
	private static char decode(int[] kodi, int i)
	{ char c = '*';
	boolean found = false;
	int index = 0;
	while ( !found && index != kodi.length )
	{ if ( kodi[index] == i )
	{ found = true;
	if ( index == 0 )
	{ c = ' '; }
	else { c = (char)(index + 'a' - 1); }
	}
	else { index = index + 1; }
	}
	return c;
	}

}
