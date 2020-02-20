package cleancode;

public class Calculatecost {
	public double constructioncost(String materialstandard,int squarefeet)
	{
		double cost=0;
		if(materialstandard.equals("standardmaterial"))
			cost=squarefeet*1200;
		else if(materialstandard.equals("abovestandardmaterial"))
			cost=squarefeet*1500;
		else if(materialstandard.equals("highstandardmaterial"))
			cost=squarefeet*1800;
		else if(materialstandard.equals("highstandardmaterial_and_fullyautomatedhome"))
			cost=squarefeet*2500;
		
	   return cost;
	}

}
