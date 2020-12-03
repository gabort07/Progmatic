//package TreeDataStrucure;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Tree<T> {
//
//    TreeDataStrucure.Node<T> node;
//
//    /**
//     * Konstruktor, ami létrehoz egy fát egy darab gyökérelemmel
//     *
//     * @param root
//     */
//    public Tree(T root) {
//        this.node = new Node<root>();
//    }
//
//    /**
//     * Megkeresi a nodeValue-t tartalmazó csúcsot, és azt visszaadja.
//     * A keresés az equals metódus alapján történik!
//     *
//     * @param nodeValue
//     * @return a megtalált TreeDataStrucure.Tree.Node-ot, vagy null-t, ha nincs TreeDataStrucure.Tree.Node ezzel a nodeValue-val.
//     */
//    public Node<T> findNode(T nodeValue)
//
//    /**
//     * megkeresi a fában azt a TreeDataStrucure.Tree.Node-ot,
//     * aminek értéke parentNode-al egyezik meg, és ehhez hozzáadja
//     * a new TreeDataStrucure.Tree.Node-ból elkészített TreeDataStrucure.Tree.Node-ot
//     *
//     * @param parentnodeValue
//     * @param newNodeValue
//     * @return
//     */
//    public Node<T> addAsChild(T parentnodeValue, T newNodeValue)
//
//    /**
//     * Visszadja a fában lévõ csúcsok számát
//     *
//     * @return
//     */
//    public int getSize()
//
//    public static class Node {
//
//        private List<Node> children = new LinkedList<>();
//    }
//}
