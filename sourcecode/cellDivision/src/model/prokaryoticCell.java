package model;

public class prokaryoticCell implements cellOfFuntion {
    public static final String genome = "Contains DNA, genes and genetic information";
    public static final String ribosome = "Carry out protein synthesis";
    public static final String cellMembrane = "Controls movement of substances and chemical reactions";
    public static final String cellWar = "Protects and maintains cell shape";
    public static final String Cytoplasm = "Contains other cellular structures";
    public static final String FlagellaAndPili = "Allows cells to move and adhere to other surfaces";
    public static final String Plasmid = "Contains transgenes, which may carry genetic information";

    @Override
    public void DisplayCellOfInfor() {
    }

    public void cellDivision() {
        System.out.println(" Start demonstrating the progress of cell division ");
    }
}
