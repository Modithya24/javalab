class GenMethDemo
{
    static <T> boolean isIn(T x, T[] arr)
    {
        for (T i : arr)
        {
            if (x.equals(i))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Integer[] nums = { 1, 2, 3 };

        System.out.println(isIn(2, nums));
        System.out.println(isIn(5, nums));

        String[] strs = { "A", "B", "C" };

        System.out.println(isIn("B", strs));
        System.out.println(isIn("Z", strs));
    }
}