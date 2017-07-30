/**
 * Created by adavi on 30.07.2017.
 */
public class BuildArray {

    public int[] arrayBuild(int n){

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (4) - 2);
            System.out.printf("%d",arr[i]);
            System.out.print(" ");

        }
        return arr;
    }
    public void countElement(int [] arr){
        int countMinusOne = 0;
        int countZero = 0;
        int countOne = 0;
        int i = 0;
        while (i < arr.length){
            switch(arr[i]){
                case -1:{
                   countMinusOne++;
                   break;
                }
                case 0:{
                     countZero++;
                    break;
                }
                case 1:{
                     countOne++;
                    break;
                }
                default:{
                   break;
                }
            }
            i++;
    }
        System.out.println("");
        System.out.println(countMinusOne );
        System.out.println(countZero  );
        System.out.println(countOne );


       int maxElement = maxCount(countMinusOne,countOne,countZero);
        getResult(maxElement);

    }
     public int maxCount(int count1, int count2,int count3){
        if(count1 > count2 && count1 > count3 && count2 != count3){
            return  count1;
        }
        if(count2 > count1 && count2 > count3 && count1 != count3){
            return  count2;
        }
        if(count3 > count2 && count3 > count1 && count1 != count2){
            return count3;
        }else {
            return 20;
        }
   }
    public void getResult(int n){
        if (n == 20){
            System.out.println("Є однакова кількість елементів");
        }else{
            System.out.println("Є " + n +" одинакових елементів");
        }
    }
}
