package session3_2;

public class Physic implements ILesson {
    String name = "Physic";
    int unitCount = 3;
    String[] pishniaz = {"riazi"};
    String[] hamniaz ={ "az fizik"};


    @Override
    public void showPishniaz() {
        for (String item :
                pishniaz) {
            System.out.println(item);
        }
    }

    @Override
    public void showHamniaz() {
        for (String item :
                hamniaz) {
            System.out.println(item);
        }
    }

    @Override
    public void showUnitCount() {
        System.out.println(unitCount);
    }
}
