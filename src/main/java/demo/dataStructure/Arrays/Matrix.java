package demo.dataStructure.Arrays;


class Matrix {
    public static void main(String[] args) {
        System.out.println("Example of Two Dimensional Array or Matrix");
        int[][] arr = {{1, 2}, {3, 4} ,{7,8} ,{10,11}};


        //    | C1  |  C2  |
        //R1 -|  1  |  2   |
        //R2 -| 3   |  4   |
        //R3 - | 7  |  8   |
        //R4 -| 10  |  11  |

        int[][][] arr2 = { { {1, 2,3} , {1, 2,3}, {1, 2,3}},
                          { {11, 22,33} , {111, 222,332}, {123, 234,345}}};



        //    |    C1          |  C2              |   C3            |
        //===========================================================
        //    | SC1 SC2 SC3    |  SC1 SC2   SC3   |  SC1 SC2 SC3
        //R1 -|  1   2   3     |  1     2    3    |   1   2    3    |
        //R2 -|  11  22  33    | 111   222   332  |  123  234  345    |



        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
    }
}