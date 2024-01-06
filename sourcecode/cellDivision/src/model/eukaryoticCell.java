package model;

public class eukaryoticCell implements cellOfFuntion {
    public static final String Nucleus = "Stores and protects DNA";
    public static final String CellMembrane = "Maintains cell shape and metabolism";
    public static final String NuclearMembrane = "Protects nucleus, controls fluid homeostasis";
    public static final String Cytoplasm = "Site of metabolism and biological reactions";
    public static final String Riboosome = "Creates proteins";
    public static final String GolgiApparatus = "Packages proteins and lipids for transport";
    public static final String Mitochondria = "Organizes energy circulation for cells";

    public void DisplayCellOfInfor() {
        System.out.println(" Display cell components and functions ");
    }

    public void cellDivision() {
        System.out.println(" Start demonstrating the progress of cell division ");
    }
}
