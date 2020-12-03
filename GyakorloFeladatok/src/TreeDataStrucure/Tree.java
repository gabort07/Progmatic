package TreeDataStrucure;

public class Tree<T> {
    Node<T> root;

    /**
     * Konstruktor, ami l�trehoz egy f�t egy darab gy�k�relemmel
     *
     * @param root
     */
    public Tree(T root) {
        this.root = new Node<T>();
    }

    /**
     * Megkeresi a nodeValue-t tartalmaz� cs�csot, �s azt visszaadja.
     * A keres�s az equals met�dus alapj�n t�rt�nik!
     *
     * @param nodeValue
     * @return a megtal�lt TreeDataStrucure.Tree.Node-ot, vagy null-t, ha nincs TreeDataStrucure.Tree.Node ezzel a nodeValue-val.
     */
    public Node<T> findNode(T nodeValue) {
        return root.findValue(nodeValue);
    }

    /**
     * megkeresi a f�ban azt a TreeDataStrucure.Tree.Node-ot,
     * aminek �rt�ke parentNode-al egyezik meg, �s ehhez hozz�adja
     * a new TreeDataStrucure.Tree.Node-b�l elk�sz�tett TreeDataStrucure.Tree.Node-ot
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
     * Visszadja a f�ban l�v� cs�csok sz�m�t
     *
     * @return
     */
    public int getSize() {
        return root.getChildren().size();
    }


}
