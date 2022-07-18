package animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(),
                new Turle(),
                new Eagle()};

        Shark[] sharks = {new Shark()};
        Turle[] turles={new Turle()};

        for (Animal a : animals) {
           if (a instanceof Shark)
                    ((Shark) a).attack();


            if (a instanceof Turle) {
                ((Turle) a).swim();
            }

            if (a instanceof Eagle){
                ((Eagle)a).fly();
            }
            if (a.getClass().getName().equals("animal.Eagle")){
                ((Eagle)a).fly();
            }
            if (a.getClass().getName().equals("animal.Turle")) {
                ((Turle) a).swim();
            }
             if (a.getClass().getName().equals("animal.Shark")) {
                ((Shark) a).attack();
            }
        }




        }
    }
