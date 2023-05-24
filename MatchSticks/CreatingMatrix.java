import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingMatrix {
int numOfBox = 0;
    private Boolean[][] matrix;
    public CreatingMatrix(int numOfSquare) {
        numOfBox = numOfSquare;
        Creating(numOfSquare);
    }
    private void Creating(int startNum) {
        int addBoxes = 0;
        int rawRaws = (int) Math.sqrt(startNum);
        System.out.println("Raw rows:"+rawRaws);
        int undeqBox = (startNum -(int)Math.pow(rawRaws,2));
        int row =0 ;
        switch (undeqBox){
            case 0:
                row = rawRaws;
                break;
            default:
                int addRow=0;
                if(undeqBox%rawRaws !=0){
                    addRow++;
                }
                addRow+=(int)undeqBox/rawRaws;
                System.out.println("Add Row:" + addRow);
                row = addRow + rawRaws;
                System.out.println("Row:" +row);
                addBoxes = row*rawRaws - startNum;
                break;
        }
        System.out.println(row+" Nums of Rows");
        matrix = new Boolean[row][rawRaws];
        Init(row);
        System.out.println("AddBoxes:" +addBoxes);
        System.out.println("Raw Rows:");
        Clearing(row, rawRaws, addBoxes);
        Print();
    }
    private void Init(int numOfRows) {
        for (int i = 0; i < numOfRows; i++) {
            Arrays.fill(matrix[i], false);
        }

    }
    private void Clearing(int numOfRows, int rawRaws, int numOfAdd1) {
        int checker = 1;
        int numOfAdd = numOfAdd1;
        int x = numOfRows-1;
        int y = rawRaws-1;
        int i = 1;
        for (int j = 0; j < numOfAdd; j++) {
            matrix[x][y-j] = null;
            checker++;
        }
        }

    private void Print() {
            try {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println();
                }
            } catch (Exception e) {

            }

        }
        public Boolean[][] getMatrix(){
        return matrix;

        }

    public int getNumOfBox() {
        return numOfBox;
    }
}


