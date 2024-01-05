package model;

import javafx.scene.image.Image;

public class prokaryoticCell implements cellOfFuntion{
	public static final String genome = "Contains DNA, genes and genetic information of the cell";
	public static final String ribosome = "Carry out protein synthesis from genetic information encoded in mRNA";
	public static final String cellMembrane = "Controls the movement of substances and the type of chemical reactions";
	public static final String cellWar = "Protects and maintains cell shape";
	public static final String Cytoplasm = "Chứa các cấu trúc tế bào khác, bao gồm ribosome và các thành phần tham gia vào quá trình metabolic";
	public static final String FlagellaAndPili = "Allows cells to move and adhere to other surfaces or participate in gene transfer"; 
	public static final String Plasmid = "Contains transgenes, which may carry genetic information related to the ability to resist attack by other bacteria, or other genes";

	
	public void DisplayCellOfInfor() {
		System.out.println(" Display cell components and functions ");
	}
	
	public void cellDivision() {
		System.out.println(" Start demonstrating the progress of cell division ");
	}
}
