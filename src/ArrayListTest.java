import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        for (String name : names)
        {
            System.out.println(name);
        }

        int x = 0;
        while (x < names.size())
        {
            System.out.println(names.get(x));
            x++;
        }

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        for (int k = 0; k < catList.size(); k++)
        {
            System.out.println(catList.get(k).getName());
        }

        for (Cat cat : catList)
        {
            System.out.println(cat.getName());
        }

        int j = 0;
        while (j < catList.size())
        {
            System.out.println(catList.get(j).getName());
            j++;
        }

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        for(int m = 0; m < nums.length; m++)
        {
            if(m + 2 < nums.length)
            {
                numList.set(m, nums[m + 1] + nums[m + 2]);
            }
        }

        System.out.println(numList);
    }
}
