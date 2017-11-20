package simulator;
public class FIFO {
    int Output;
    public FIFO(int fr, int[] in ) {

        int[] a = new int[fr];

        int[] flag = new int[ in .length];

        for (int i = 0; i < in .length; i++) {
            flag[i] = 0;
        }

        for (int i = 0; i < fr; i++) {
            a[i] = -1;
        }
        Output = 0;

        int j = 0;
        for (int i = 0; i < in .length; i++) {
            int k = 0;

            for (int y = 0; y < fr; y++) {
                if (a[y] == in [i]) {
                    k = 1;
                }
            }
            if (k == 0) {

                for (j = 0; j < fr - 1; j++) {
                    a[j] = a[j + 1];


                }
                a[j] = in [i];

                Output = Output + 1;
            }
        }
        System.out.println(Output);
    }
    public int method() {
        return Output;
    }
}