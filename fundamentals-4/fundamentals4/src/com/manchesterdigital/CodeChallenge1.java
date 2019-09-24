package com.manchesterdigital;

public class CodeChallenge1 {

    private static final int BAD_OUTCOME = 0;
    private static final int GOOD_OUTCOME = 1;
    private static final int GREAT_OUTCOME = 2;


    public static int teaParty(int tea, int candy){
        if((tea < 5) || (candy < 5)){
            return BAD_OUTCOME;
        }else if(tea >= (candy * 2) || candy >= (tea * 2)) {
            return GREAT_OUTCOME;
        }
        return GOOD_OUTCOME;
    }


    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(20, 6));

    }

}
