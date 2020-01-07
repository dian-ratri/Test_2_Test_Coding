public class Deret{
    public static void main(String[] args){
        for (int i=1; i<101; i++){
            if(i%2 == 0 && i%3 == 0){
                System.out.print(" INDONESIA ");
            }else if(i%2==0){
                System.out.print(i);
            }else if(i%2==1){
                System.out.print(" ganjil ");
            }
        }
    }
}