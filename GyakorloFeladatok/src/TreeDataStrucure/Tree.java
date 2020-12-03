package TreeDataStrucure;

public class Tree<T> {
    Node<T> root;

    /**
     * Konstruktor, ami létrehoz egy fát egy darab gyökérelemmel
     *
     * @param root
     */
    public Tree(T root) {
        this.root = new Node<T>();
    }

    /**
     * Megkeresi a nodeValue-t tartalmazó csúcsot, és azt visszaadja.
     * A keresés az equals metódus alapján történik!
     *
     * @param nodeValue
     * @return a megtalált TreeDataStrucure.Tree.Node-ot, vagy null-t, ha nincs TreeDataStrucure.Tree.Node ezzel a nodeValue-val.
     */
    public Node<T> findNode(T nodeValue) {
        return root.findValue(nodeValue);
    }

    /**
     * megkeresi a fában azt a TreeDataStrucure.Tree.Node-ot,
     * aminek értéke parentNode-al egyezik meg, és ehhez hozzáadja
     * a new TreeDataStrucure.Tree.Node-ból elkészített TreeDataStrucure.Tree.Node-ot
     *
     * @param parentnodeValue
     * @param newNodeValue
     * @return
     */
    public Node<T> addAsChild(T parentnodeValue, T newNodeValue) {
        Node<T> newNode = new Node<>(newNodeValue);
        findNode(parentnodeValue).addToNode(newNode);
        return newNode;
    }

    /**
     * Visszadja a fában lévõ csúcsok számát
     *
     * @return
     */
    public int getSize() {
        return root.getChildren().size();
    }


}
