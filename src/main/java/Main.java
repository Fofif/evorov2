
    import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random rd = new Random();
            int[] y = new int [9];
            int x = 0;
            int k = 1;
            int s = 0;
            for(int i=0; i<y.length; i++){
                y[i]=rd.nextInt(10);
                System.out.print(y[i]+" ");
            }
            for(int i =0; i<y.length; i++){
                s=s+(y[i]*y[i]);
                k=k*y[i];
            }
            System.out.println();
            x = (s+k)/9;
            System.out.println(x);
        }
    }

