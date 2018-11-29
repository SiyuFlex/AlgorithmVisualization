package v01_three_door_issue;

public class ThreeGatesExperiment {

    private int N;

    public ThreeGatesExperiment(int N){

        this.N = N;



    }

    public void run(boolean changeDoor){

        int wins = 0;

        for(int i=0; i<N; i++){
            if(play(changeDoor))
                wins ++;
        }

        System.out.println(changeDoor? "Change": "Not Change");
        System.out.println("Winning rate: "+(double)wins/N);
    }

    private boolean play(boolean changeDoor){
        // Door 0,1,2
        int prizeDoor = (int)(Math.random()*3);

        int playChoice = (int)(Math.random()*3);

        if(playChoice == prizeDoor){
            return changeDoor? false : true;
        }else{
            return changeDoor? true : false;
        }
    }

    public static void main(String args[]){
        int N = 1000000;

        ThreeGatesExperiment tge = new ThreeGatesExperiment(N);
        tge.run(false);
        tge.run(true);
    }
}
