import java.util.List;

public class FamilyRepresentTestDrive {
    public static void main(String[] args){

        FamilyRepresent fm = new FamilyRepresent("fm");
        FamilyRepresent fm1 = new FamilyRepresent("fm1");
        FamilyRepresent fm2 = new FamilyRepresent("fm2");
        FamilyRepresent fm3 = new FamilyRepresent("fm3");
        FamilyRepresent fm4 = new FamilyRepresent("fm4");
        FamilyRepresent fm5 = new FamilyRepresent("fm5");
        FamilyRepresent fm6 = new FamilyRepresent("fm6");
        // FamilyRepresent fm7 = new FamilyRepresent("fm7");
        // FamilyRepresent fm8 = new FamilyRepresent("fm8");

        fm.setMother(fm1);
        fm.setFather(fm2);
        fm1.setFather(fm3);
        fm1.setMother(fm4);
        fm2.setFather(fm5);
        fm2.setMother(fm6);

        System.out.println("genealogical tree for fm");
        List<FamilyRepresent> listFM = fm.getTreeParents();

        for (FamilyRepresent current : listFM){
            System.out.println(current);
        }

        System.out.println("_________________________");
        List<FamilyRepresent> listFM1 = fm1.getTreeParents();

        for (FamilyRepresent current : listFM1){
            System.out.println(current);
        }

    }
    
}