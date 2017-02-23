/**
 * 
 */
package delgadosTacos;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class delgadosChoiceLoop
{

	public static void main(String[] args) 
	{
		int amount, order = 0;
		double tacoCost, burritoCost, churroCost, nachoCost, enchiladaCost, quesadillaCost, tamaleCost, empanadaCost, fajitaCost, drinkCost, 
				totalCost = 0, tacoPrice = 1.49, burritoPrice = 1.99, churroPrice = .99, nachoPrice = 1.49, enchiladaPrice = 1.99, 
				quesadillaPrice = 1.49, tamalePrice = 1.49, empanadaPrice = 2.99, fajitaPrice = 1.99, drinkPrice = .99;
		JOptionPane.showMessageDialog(null, "Welcome to Delgados Tacos");
		while(order <= 10)
		{
		order = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like? \n1 = Taco\n2 = Burrito\n3 = Churro\n4 = Nacho"
				+ "\n5 = Enchilada\n6 = Quesadilla\n7 = Tamale\n8 = Empanada\n9 = Fajita\n10 = Drink"));
			if(order <= 10)
			{
				amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many would you like?"));
				if(order == 1)
				{
					tacoCost = tacoPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + tacoCost + " for " + amount + " tacos.");
					totalCost = totalCost + tacoCost;
				}
				if(order == 2)
				{
					burritoCost = burritoPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + burritoCost + " for " + amount + " burritos.");
					totalCost = totalCost + burritoCost;
				}
				if(order == 3)
				{
					churroCost = churroPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + churroCost + " for " + amount + " churros.");
					totalCost = totalCost + churroCost;
				}
				if(order == 4)
				{
					nachoCost = nachoPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + nachoCost + " for " + amount + " nachos.");
					totalCost = totalCost + (nachoPrice*amount);
				}
				if(order == 5)
				{
					enchiladaCost = enchiladaPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + enchiladaCost + " for " + amount + " enchiladas.");
					totalCost = totalCost + enchiladaCost;
				}
				if(order == 6)
				{
					quesadillaCost = quesadillaPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + quesadillaCost + " for " + amount + " quesadillas.");
					totalCost = totalCost + quesadillaCost;
				}
				if(order == 7)
				{
					tamaleCost = tamalePrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + tamaleCost + " for " + amount + " tamales.");
					totalCost = totalCost + tamaleCost;
				}
				if(order == 8)
				{
					empanadaCost = empanadaPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + empanadaCost + " for " + amount + " empanadas.");
					totalCost = totalCost + empanadaCost;
				}
				if(order == 9)
				{
					fajitaCost = fajitaPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + fajitaCost + " for " + amount + " fajitas.");
					totalCost = totalCost + fajitaCost;
				}
				if(order == 10)
				{
					drinkCost = drinkPrice * amount;
					JOptionPane.showMessageDialog(null, "The cost will be $" + drinkCost + " for " + amount + " drinks.");
					totalCost = totalCost + drinkCost;
				}
				order = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like anything else?\nEnter 1 for yes, or 2 for no"));
				if(order == 1)
					order = 1;
				if(order == 2)
					order = 11;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "We could not understand your request. Please try again.");
				order = 1;
			}	
		}
		JOptionPane.showMessageDialog(null, "Your total will be $" + totalCost + "\nHave a nice day.");
	}
}