package optional_bai_tap.binary_search_tree_preorder;

public interface Tree<E> {
    public boolean insert(E element);
    public int getSize();
    public void preOrder();
}
