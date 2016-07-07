import javax.swing.*;
public class detyra2 {
	

	
	    public static void main(String[] args) {
	        int[] cards = new int[13];
	        
	        cards[0]=1;
	        for (int i =1; i < cards.length; i++) {
	            cards[i] = i;
	        }
	        String answer = "";
	        int numriNdarjeve = Integer.parseInt(JOptionPane.showInputDialog("type the number of players"));
	        if (numriNdarjeve > 10) {
	            JOptionPane.showMessageDialog(null, "there can't be more than 10 players !");
	        } else {
	            for (int i =0; i < numriNdarjeve; i++) {
	                answer += "\n \n player " + (i+1) + ": \n";
	                for (int j = 0; j <5; j++) {
	                    int letra = (int)(Math.floor(13*Math.random()));
	                    cards[letra] = cards[letra] + 1;
	                    if (cards[letra] - letra > 4) {
	                        j--;
	                    }  else {
	                        answer += letra + " ";
	                    }
	                }
	            }
	        }
	        System.out.println(answer);
	    }
	}


