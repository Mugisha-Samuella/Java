package Basics2.Intro;

class Computer{
    public void playMusic(){
        System.out.println("Playing music..");
    }

    public String getMeAPen(int a){
        if(a > 10){
            return "A Pen!";
        }else {
            return "No Pen!";
        }
    }
}

public class Methods {
    public static void main(String arg[]){

        int cost = 5;

        Computer c = new Computer();
        c.playMusic();
        String str = c.getMeAPen(cost);
        System.out.println(str);
    }
}
