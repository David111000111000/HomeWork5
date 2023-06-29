public class Main {
    public static void main(String[] args) {
        PriorityQue myPriotityQue=new PriorityQue(5);
        try {
            myPriotityQue.pop("Обама".length());
        }catch (Exception e){//Было бы правильнее поставить рантайм, но это не в моем вкусе(Тем более в тестах)
            System.out.println("Error, empty structure");
        }
        myPriotityQue.enQueue(1);
        myPriotityQue.enQueue(2);
        myPriotityQue.enQueue(3);
        myPriotityQue.enQueue(4);
        myPriotityQue.enQueue(5);
        try {
            myPriotityQue.enQueue(54);
        }catch (Exception e){
            System.out.println("Full");
        }
    }
}