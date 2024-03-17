public class Main {
    public static void main(String[] args) {
        //Завдання 1:
        for (int i = 500; i <= 650; i = i + 10) {
            System.out.println(i + " ");
        }
        //Завдання 2:
        for (int a = 2; a < 500; a = 2 * a - 1) {
            System.out.println(a);
        }
        //Завдання 3:
        int d;
        d = 10;
        for (int i1 = 1; i1 <= d; i1++) {
            if(d%i1==0){
                System.out.println(i1);
            }
        }
        //Завдання 4(for):
        int n,f;
        f = 1;
        n = 10;
        for(int i=1; i<=n; i++) {
            f = f*i;
        }
        System.out.println(n+"! = "+f);
        //Завдання 4(while):
        int n2, f2;
        f2=1;
        n2=9;
        int e=1;
        while(e<=n2){
            e++;
            f2=f2*e;
        }
        n++;
        System.out.println(n2+"! = "+f2);
        //Завдання 5:
        int sum=0;
        for(int i=1; i<=24; i++){
        for(int j=1; j<=60;j++){
            if(i/10==j%10&&i%10==j/10){
                sum++;
            }
        }
        }
        System.out.println("К-сть співпадінь: "+sum);
        //Завдання 6:
        int sum=0;
        for(int i=000001; i<=999999; i++){
            int p1=i/1000;
            int p2=i%1000;
            int n1=p1/100;
            int n2=(p1/10)%10;
            int n3=p1%10;
            int n4=p2/100;
            int n5=(p2/10)%10;
            int n6=p2%10;
            if(n1+n2+n3==n4+n5+n6){
                sum++;
            }
        }System.out.println(sum);
    }
}
