public class Sticks {
    public int Sticks(Boolean[][] matrix, int howMany){
        int sum = 0;
        int checker = 0;
        while (checker < howMany){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j]!= null){
                        boolean ifUp = false;
                        boolean ifLeft = false;
                        try {
                            if (!matrix[i - 1][j]) {
                                ifUp = true;
                            }
                        }
                        catch (Exception e){};
                        try{
                            if (!matrix[i][j - 1]) {
                                ifLeft = true;
                            }
                        }catch (Exception e){}
                        if(ifUp && ifLeft){
                            sum+=2;
                        }
                        if (!ifUp && ifLeft) {
                            sum+=3;
                        }
                        if (ifUp && !ifLeft) {
                            sum+=3;
                        }
                        else if(!ifUp && !ifLeft){
                            sum+=4;
                        }
                        checker++;
                    }
                }
            }
        }
        return sum;
    }

}
