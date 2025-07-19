package Day_2;

import java.util.List;
import java.util.ArrayList;

public class DoWhilePascals {
    public static void main(String[] args) {
        int row = 0;
        int n = 5;
        List<List<Integer>> pascals = new ArrayList<>();
        do{
            int col = 0;
            List<Integer> data = new ArrayList<>();
            do{
                if(col == 0 || col == row){
                    data.add(1);
                }
                else{
                    data.add((pascals.get(row-1).get(col-1)+pascals.get(row-1).get(col)));
                }

            }while(col++<row);
            pascals.add(data);
        }while(row++<n-1);
        
        for(int i = 0;i<pascals.size();i++){
            String s = "";
            for(int j = 0;j<pascals.get(i).size();j++){
                s+=" ";
                s+=pascals.get(i).get(j);
            }
            String space = "";
            for(int x = 0;x<n-i;x++){
              space+=" "; 
            }
            System.out.println(space+s);
        }
    }

}
