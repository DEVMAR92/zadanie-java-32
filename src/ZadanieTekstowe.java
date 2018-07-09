public class ZadanieTekstowe {
    public static void main(String[] args) {

        System.out.println("Klasa to SZABLON POZWALAJĄCY ZDEFINIOWAC BARDZIEJ ZŁOŻONE TYPY DANYCH.");
        System.out.println("Obiekt to KONKRETNY EGZEMPLAŻ DANEJ KLASY i jest tworzony na podstawie KLASY.");
        System.out.println("Zmienna to PODSTAWOWY ELEMENT DO PRZECHOWYWANIA DANYCH.");
        System.out.println("Każda zmienna musi mieć określony TYP, np int, albo String.");
        System.out.println("W klasie mogą się znajdować POLA, METODY i ZMIENNE ");
        System.out.println("INICJACJE są wywoływane przez operator \"new\" i służą do tworzenia nowych obiektów.");
        System.out.println("Jeśli w klasie zdefinoiwano chociaż jeden KONSTRUKTOR " +
                "to kompilator nie wygeneruje dla nas KONSTRUKTORA domyślnego");
        System.out.println("Zakładając, że istnieje klasa Car, to przy zapisie:");
        System.out.println("Car car1 = new Car(\"BMW\",\"M5\",2007,2.6);");
        System.out.println("car1 nazywamy REFERENCJOM,");
        System.out.println("a przy zapisie:");
        System.out.println("Car car1 = new Car(\"BMW\",\"M5\",2007,2.6); Car car2 = car1;");
        System.out.println("car1 i car2 to dwie REFERENCJE wskazujące na ten sam OBJEKT");
    }
}
