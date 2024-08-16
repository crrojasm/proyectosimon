package Java;

public class ciclofor {
    public static void main(String[] args){
    String [] mariobroscharacters = {"Luigui","Mario", "Peach", "Yoshi", "Bowser", "Toad"};
    


    for (int i = 0; i <  mariobroscharacters.length ; i++) {
      //System.out.println((i + 1) + ":" + mariobroscharacters[i]);
        
        String Inicial = mariobroscharacters[i];
        
        if(Inicial.equals("Luigui")){
            System.out.println("L");
        } else if (Inicial.equals("Mario")){
            System.out.println("M");
        } else if (Inicial.equals("Peach")){
            System.out.println("P");
        } else if (Inicial.equals("Toad")){
            System.out.println("T");
        } else if (Inicial.equals("Mario")){
            System.out.println("M");
        }    else if (Inicial.equals("Bowser")){
                System.out.println("B");    
        }


        }


    }

}



   