public class wolf {
    String namewolf
    String color;
    int score;
    double speed;


    void horn(){

        System.out.println("Beep!");
    }

    void eatMeat(wolf meat){
        score += 30;
    }

    void eatVegetable(wolf vege){
        score -= 20;
    }

    void bingo(wolf bingo){
        speed +=20;
    }

}
