import java.util.ArrayList;
import java.util.List;


public class FamilyRepresent {

    private FamilyRepresent mother;
    private FamilyRepresent father;

    private String name;

    public FamilyRepresent(String name, FamilyRepresent mother, FamilyRepresent father) {
        this.mother = mother;
        this.father = father;
    }

    public List<FamilyRepresent> getTreeParents(){

        List<FamilyRepresent> parents = new ArrayList<>();

        boolean flag = true;

        if (mother != null){
            parents.add(mother);
        }

        if (father != null){
            parents.add(father);
        }

        for (int i = 0; i < parents.size(); i++) {
            FamilyRepresent current = parents.get(i);
            FamilyRepresent parentMother = current.getMother();
            FamilyRepresent parentFather = current.getFather();

            if (parentMother != null){
                parents.add(parentMother);
            }

            if (parentFather != null){
                parents.add(parentFather);
            }
        }

        return parents;
    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "name='" + name + '\'' +
                '}';
    }

    public FamilyRepresent(String name) {
        this.name = name;
    }

    public FamilyRepresent getMother() {
        return mother;
    }

    public void setMother(FamilyRepresent mother) {
        this.mother = mother;
    }

    public FamilyRepresent getFather() {
        return father;
    }

    public void setFather(FamilyRepresent father) {
        this.father = father;
    }
    
}
