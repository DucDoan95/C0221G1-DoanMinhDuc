package optional_thuc_hanh.binary_search_tree_inorder;

public interface Tree<E> {
    public boolean insert(E element);
    public void inOrder();
    public int getSize();
}
