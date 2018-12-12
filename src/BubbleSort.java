import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        MyTimer.start();
        //int [] intArray = {1,6,9,3,3,6,8,9,2,1,4,7,9};

        int [] intArray = new int[100000];
        for (int p = 0; p < intArray.length; p++) {
            intArray[p] = 0+ ((int)(Math.random()*100));
        }



        int temp;
        for (int i = 0; i < intArray.length; i++)
        {

            for (int j = 0; j < intArray.length; j++)
            {
                if (intArray[i]<intArray[j])
                {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        MyTimer.stop();
        // for (int l = 0; l < intArray.length ; l++) {
        //System.out.println(intArray[l]+"\n");
        //}

    }

}