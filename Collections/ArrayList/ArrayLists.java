import java.util.ArrayList;

class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements using .add()
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get elements using .get() we need to pass index

        int element = list.get(0);
        System.out.println(element);

        // add element in between
        // list.add(index, element);
        list.add(1, 1);
        System.out.println(list);

    }

}