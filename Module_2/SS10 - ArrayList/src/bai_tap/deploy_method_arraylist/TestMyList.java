package bai_tap.deploy_method_arraylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0,1);
        System.out.println("(1) " + myList.toString());
        myList.add(2);
        System.out.println(myList.contains(1));
        System.out.println("(1) " + myList.toString());
        System.out.println(myList.get(1));
        System.out.println(myList.size());

    }
}
