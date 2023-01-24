package CreationalDP.ProtoTypeDP;

public class ProtoTypeDPDemo {

    public static void main(String[] args) {

        Soldier availableSoldier = new Soldier(100,45,20,50,60,5,"Kilic",true);
        Soldier notAvailableSoldier1 = new Soldier(100,45,20,50,60,5,"kilic",false);

        Soldier notAvailableSoldier2 =   availableSoldier.clone();
        notAvailableSoldier2.setAvailableForWar(false);

        System.out.println("*************");
        System.out.println("notAvailableSoldier1 icin cikti :");
        notAvailableSoldier1.showSoldierInfo();

        System.out.println("*************");
        System.out.println("notAvailableSoldier2 icin cikti :");
        notAvailableSoldier2.showSoldierInfo();
    }
}
