package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        ChainOfResponsibility cor = new ChainOfResponsibility();
        cor.chainOfResponsibilityDemo();
    }

    void chainOfResponsibilityDemo(){

        Approver genelMudur = new GenelMudur();
        Approver mudur= new Mudur(genelMudur);
        Approver memur = new Memur(mudur);
        System.out.println("Kredi verme limitleri : ");
        System.out.println("memur icin maksimum : <100");
        System.out.println("mudur icin maksimum : <500");
        System.out.println("genel mudur icin sinir yok");
        System.out.println("*****************");
        System.out.println("istenen limit : 50");
        memur.approveLoan(50);
        System.out.println("istenen limit : 450");
        memur.approveLoan(450);
        System.out.println("istenen limit : 1050");
        memur.approveLoan(1050);

    }
}
