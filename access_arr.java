public class access_arr {

    public static void main(String[] args) {

        // array traversal
        int []marks={10,20,30,40,50};
        System.out.println(marks.length);
        // for(int i=0;i<=marks.length;i++)
        // {
        //     System.out.println(marks[i]);
        // }

        //printing array in reverse order

        // for(int a=marks.length-1;a>=0;a--)
        // {
        //     System.out.println(marks[a]);
        // }


        // for each loop
        for(int elements:marks)
        {
            System.out.println(elements);
        }
    }
}
