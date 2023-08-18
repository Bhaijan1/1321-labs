//import java.util.*;
//public class Lab13A {
//
//
//
//
// //-----------------------------------
//    static int numEnemies(Enemy[] enemies){
//
//
//        int sum =0;
//        for(int i=0; i<enemies.length;i++){
//            if(enemies[i].isAlive)
//            {
//                sum=sum+1;
//            }
//        }
//
//        return sum;
//    }
////------------------------------------------
//    public static void printArray(Enemy[] enemies) {
//        for (int i = 0; i < enemies.length; i++) {
//            System.out.println("|" + enemies[i].HP);
//        }
//        System.out.println();
//    }
// //---------------------------------
//
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//
//        int enemyHP;
//        int heroDamage;
//        int heroHP;
//        int numEnemiesLeft;
//       // Enemy[] enemies;
//       //Hero hero;
//
//        System.out.println("Enter the number of eneimes");
//        int numEnemies = input.nextInt();
//        System.out.println("Enter enemy damage");
//        int enemyDamage = input.nextInt();
////        System.out.println("Enter Enemy H");
////        enemyHP= input.nextInt();
//        System.out.println("Enter the Hero's Starting HP: ");
//        heroHP= input.nextInt();
//        System.out.println("Enter the Hero's Damage: ");
//        heroDamage= input.nextInt();
////        System.out.println("Enter the number of eneimes left: ");
////        numEnemiesLeft= input.nextInt();
//
//
//            Enemy[] enemies = new Enemy[numEnemies];
//
//
//        for (int i = 0; i <numEnemies ;i++){
//            enemies[i]=new Enemy(10+(i*2), enemyDamage);
//
//        }
//       Hero hero= new Hero(heroHP,heroDamage);
//        int roundCount=1;
//        do {
//            for(int i=0; 1<enemies.length; i++){
//                if(enemies[i].isAlive){
//                    enemies[i].takeDamage(hero.damage);
//                }
//
//            }
//            System.out.println("==== After round "+roundCount+" ====");
//            numEnemiesLeft=numEnemies(enemies);
//            System.out.println("Number of enemies "+numEnemiesLeft);
//            printArray(enemies);
//            System.out.println("Hero HP "+hero.HP);
//            roundCount++;
//
//        }
//        while ((numEnemiesLeft>0)&&(hero.isAlive));
//        if(hero.isAlive){
//            System.out.println("Hero Wins!");
//
//        }
//        else{
//            System.out.println("Enemies Win!");
//        }
//
//
//    }
//}
//class Enemy{
//    int HP,damage;
//    boolean isAlive;
//    Enemy(int HP,int damage ){
//
//
//    }
//    void takeDamage(int amount){
//        HP-= amount;
//        if(HP<=0) isAlive=false;
//
//    }
//}
//class Hero{
//    int HP,damage;
//    boolean isAlive;
//    Hero(int HP, int damage ){
//        HP=1;
//        damage=0;
//
//
//
//    }
//    void takeDamage(int amount){
//        HP-=amount;
//        if(HP<=0) isAlive=false;
//    }
//
//
//}

import java.util.Scanner;

public class Lab13A {
//-----------
public static int aliveEnemies(Enemy[] arrEnemies)

        {

        int numEnemiesAlive = 0;

        for (int i = 0; i < arrEnemies.length; i++)

        {

        if (arrEnemies[i].alive)

        {

        numEnemiesAlive = numEnemiesAlive + 1;

        }

        }

        return numEnemiesAlive;

        }

//--------------------------------------
public static void printEnemyHP(Enemy[] arrEnemies)

        {

        for (int i = 0; i < arrEnemies.length; i++)

        {

        System.out.print("|" + arrEnemies[i].hp);

        }

        System.out.println();

        }

///----------------main---------
public static void main (String [] args)

        {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of enemies: ");

        int numEnemies = scan.nextInt();

        System.out.print("Enter the enemy damage: ");

        int enemyDmg = scan.nextInt();

        System.out.print("Enter the hero's starting HP: ");

        int heroHP = scan.nextInt();

        System.out.print("Enter the hero's damage: ");

        int heroDmg = scan.nextInt();



        Enemy[] arrayEnemies = new Enemy[numEnemies];

        for (int i = 0; i < numEnemies; i++)

        {

        int enemyHP = 10 + (2 * i);

        arrayEnemies[i] = new Enemy(enemyHP, enemyDmg);

        }


        Hero hero = new Hero(heroHP,heroDmg);


        int roundCount = 1;

        do

        {

        for (int i = 0; i < arrayEnemies.length; i++)

        {

        if (arrayEnemies[i].alive)

        {

        hero.takeDamage(enemyDmg);

        arrayEnemies[i].takeDamage(heroDmg);

        }

        }


        System.out.println("==== After round " + roundCount + " ====");

        System.out.println("Num enemies left: " + aliveEnemies(arrayEnemies));

        printEnemyHP(arrayEnemies);

        System.out.println("Hero HP: " + hero.hp);

        roundCount++;

        numEnemies = aliveEnemies(arrayEnemies);


        } while (hero.alive && numEnemies >= 1);


        if (hero.alive)

        {

        System.out.println("Hero wins!");

        }

        else

        {

        System.out.println("Enemies win!");

        }

        }

//--------------------------------
public static class Enemy

{

    int hp, damage;

    boolean alive;


    public Enemy (int hp, int damage)

    {

        this.hp = hp;

        this.damage = damage;

        alive = true;

    }



    public void takeDamage(int damageReceived)

    {

        hp = hp - damageReceived;

        if (hp <= 0)

        {

            alive = false;

        }


    }

}

//---------------------------------
public static class Hero

{

    int hp, damage;

    boolean alive;


    public Hero (int hp, int damage)

    {

        this.hp = hp;

        this.damage = damage;

        alive = true;

    }



    public void takeDamage(int damageReceived)

    {

        hp = hp - damageReceived;

        if (hp <= 0)

        {

            alive = false;

        }


    }

}

}




