public class Main {
    public static void main(String[] args) {
//            for (int id = 1; id <=100 ; id++) {
//                if (id > 1 && id <= 100) {
//                    System.out.println("Уволен айтишник с id: " + id);
//                }
//            }
//
//        }
        //todo Тут увольняем айтишников
        int id = 100;
        while (id <= 100 && id > 1) {
            System.out.println("Уволен айтишник с id: " + id);
            id = id - 2;
        }
    }
}
