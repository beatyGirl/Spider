package com.tian.pattern.strategy;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public class Main {

    public static void main(String args[]){
        if (args.length  != 2){
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: Java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player player1 = new Player("Taro",new WinningStrategy(seed1));
        Player player2 = new Player("Hana",new ProbStrategy(seed2));

        for (int i=1;i<100;i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongThan(nextHand2)){
                System.out.println("Winner : " + player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongThan(nextHand1)){
                System.out.println("Winner : " + player2);
                player2.win();
                player1.lose();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result : ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
