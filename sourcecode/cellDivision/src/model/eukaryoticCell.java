package model;

public class eukaryoticCell implements cellOfFuntion {
	public static final String Nucleus = "Stores and protects DNA, where genetic information is copied and cell activities are regulated";
	public static final String CellMembrane = "Protects and maintains cell shape, controlling metabolism with the surrounding environment";
	public static final String NuclearMembrane = "Protects and keeps the nucleus safe, controls fluid homeostasis inside the nucleus";
	public static final String Cytoplasm = "Cellular processes such as metabolism and biological reactions take place";
	public static final String Riboosome = "Creates proteins through gene translation";
	public static final String GolgiApparatus  = "Decide and package proteins and lipids so they can be sent where they are needed inside or outside the cell"; 
	public static final String Mitochondria = "Organize the energy circulation process (cellular respiration) to create energy for cells";

	
	public void DisplayCellOfInfor() {
		System.out.println(" Display cell components and functions ");
	}
	
	public void cellDivision() {
		System.out.println(" Start demonstrating the progress of cell division ");
	}
}
