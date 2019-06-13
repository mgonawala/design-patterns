package Structural.Composite;

/**
 *
 * Is a hierarchical pattern which stores tree-like structures.
 *
 * It treats the components of your structure the same whther it is
 * part structure of whole structure.
 *
 *
 * Component -> could be Leaf or CompositeObject
 */
public class CompositePattern {

    public static void main(String[] args) {

        Menu menu = new Menu("Main","/main");

        MenuItem safetyItem = new MenuItem("Safety","/safety");
        menu.add(safetyItem);

        Menu claimsSubMenu = new Menu("Claims","/claims");
        menu.add(claimsSubMenu);

        MenuItem personalClaimMenu = new MenuItem("Personal Claim","/personalClaim");
        claimsSubMenu.add(personalClaimMenu);

        System.out.println(menu.toString());

    }
}
