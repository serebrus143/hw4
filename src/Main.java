public class Main {
    public static void main(String[] args){
        System.out.println("Задача 1");
        int age = 18;
        if (age >=18){
            System.out.println("Если возраст человека равен " + age + ", то он достиг совершеннолетия");
            }
        if (age <18){
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }
        System.out.println("Задача 2");
        int temp = 12;
        if (temp <5){
            System.out.println("На улице " + temp + " градусов, холодно, нужно надеть шапку");
        } if (temp>5){
            System.out.println("На улице " + temp + " градусов, сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60){
            System.out.println("Если скорость = " + speed + " км/ч, то скорость превышена, она больше 60 км/ч");
        } if (speed <= 60){
            System.out.println("Если скорость = " + speed + " км/ч, то превышения нет, она меньше 60 км/ч");
        }
        System.out.println("Задача 4");
        int year = 25;
        if (year >= 2 && year <= 6){
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад");
        } if (year >= 7 && year <= 17){
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        } if (year >= 18 && year <= 24){
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int childAde = 12;
        if (childAde < 5) {
            System.out.println("Если возраст ребенка равен " + childAde + ", то ему нельзя кататься на атракционе");
        } else if (childAde >= 5 && childAde < 14){
            System.out.println("Если возраст ребенка равен " + childAde + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + childAde + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int totalPlaces = 102;
        int sitDown = 60;
        int busy = 86;
        if (busy < sitDown){
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (busy > sitDown && busy < totalPlaces){
            System.out.println("В вагоне есть свободные только стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Из этих чисел, наибольшее число " + one);
        } else if (two > one && two > three){
            System.out.println("Из этих чисел, наибольшее число " + two);
        } else {
            System.out.println("Из этих чисел, наибольшее число " + three);
        }

    }

}