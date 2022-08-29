package com.mycompany.jumping;

public class Jumping {

    public static void main(String[] args) {
        
        int arrayObstacles[] = new int[]{3,5,6,7,9};
        Integer minimumJump = 0;
        //espacio vacío entre el puesto [0][1]
        int space1 = Math.abs(arrayObstacles[0] - arrayObstacles[1]);
        //no hay espacio entre los puestos [1][2][3]
        //espacio vacío entre el puesto [3][4]
        int space2 = Math.abs(arrayObstacles[3] - arrayObstacles[4]);
        
        minimumJump = space1 + space2;
        
        System.out.println("The minimum jump to avoid all obstacles is: " + minimumJump);
   
    }
}
