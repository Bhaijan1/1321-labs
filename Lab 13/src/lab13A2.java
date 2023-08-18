import java.util.Scanner;

public class lab13A2 {

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



