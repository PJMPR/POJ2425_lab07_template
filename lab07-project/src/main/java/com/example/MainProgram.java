package com.example;

import java.time.LocalDate;

public class MainProgram {

    public static void main(String[] args){

        /**
         * Zadanie 1:
         * Utwórz klasę 'Student' z poniższymi polami:
         * - name (imię)
         * - surname (nazwisko)
         * - dateOfBirth (data urodzenia, typ LocalDate)
         * - gender (np. Gender.MALE / Gender.FEMALE)
         * - indexNumber (numer indeksu studenta)
         */

//        Student janekKowalski = new Student("janeczek", "kowalski", LocalDate.of(1999, 01, 03), Gender.MALE);

        /**
         * Zadanie 2:
         * Dodaj metody dostępowe (gettery i settery) dla wszystkich pól klasy Student.
         * Następnie ustaw wartości za pomocą setterów i wyświetl dane w konsoli.
         */

//        janekKowalski.setName("Jan");
//        janekKowalski.setSurname("Kowalski");
//        janekKowalski.setIndex("s00001");
//        System.out.println(janekKowalski.getName()
//                +" " + janekKowalski.getSurname()
//        +" " +janekKowalski.getDateOfBirth()
//        +" " +janekKowalski.getGender()
//        +" " +janekKowalski.getIndex());


        /**
         * Zadanie 3:
         * Utwórz klasę 'Lecturer' (wykładowca) z polami:
         * - name, surname, dateOfBirth, gender (jak w Student)
         * - title (np. PhD, Prof.)
         * Dodaj gettery i settery do wszystkich pól.
         */

//        Lecturer aniaNowak = new Lecturer("ania", "nowak", LocalDate.of(1980, 05, 10), Gender.FEMALE);
//        aniaNowak.setName("Anna");
//        aniaNowak.setSurname("Nowak");
//        aniaNowak.setTitle("Phd");
//
//        System.out.println(aniaNowak.getName()
//                +" " + aniaNowak.getSurname()
//                +" " +aniaNowak.getDateOfBirth()
//                +" " +aniaNowak.getGender()
//                +" " +aniaNowak.getTitle());

        /**
         * Zadanie 4:
         * Utwórz klasę 'Scholar' (stypendysta), która dziedziczy po Student.
         * Dodaj pole:
         * - scholarship (kwota stypendium, typ double)
         * Dodaj gettery i settery dla tego pola.
         */

//        Scholar fryderykNowak = new Scholar("fryderyk", "nowak", LocalDate.of(1997, 05, 15), Gender.MALE);

//        fryderykNowak.setName("Fryderyk");
//        fryderykNowak.setSurname("Nowak");
//        fryderykNowak.setIndex("s00001");
//        fryderykNowak.setScholarship(500.00);
//        System.out.println(fryderykNowak.getName()
//                +" " + fryderykNowak.getSurname()
//                +" " +fryderykNowak.getDateOfBirth()
//                +" " +fryderykNowak.getGender()
//                +" " +fryderykNowak.getIndex()
//                +" " +fryderykNowak.getScholarship());

        /**
         * Zadanie 5:
         * Klasy Student, Lecturer i Scholar zawierają wiele wspólnych elementów.
         * Wydziel wspólne pola, konstruktory i metody (gettery/settery) do nowej klasy bazowej 'PersonBase'.
         * Następnie sprawdź, czy możesz przypisać obiekty tych klas do zmiennej typu PersonBase.
         */

//        PersonBase janeczek = janekKowalski;
//        PersonBase aniusia = aniaNowak;
//        PersonBase fredek = fryderykNowak;

        /**
         * Zadanie 6:
         * Zadbaj, aby klasa PersonBase była klasą abstrakcyjną.
         * Nie powinno być możliwe utworzenie obiektu tej klasy.
         * (Upewnij się, że próba `new PersonBase(...)` kończy się błędem kompilacji).
         */

//        PersonBase osoba =
//                new PersonBase("name", "surname", LocalDate.of(2000, 05, 15), Gender.MALE);
        //-> powyższa linijka powinna zwracać błąd kompilacji - jeśli tak jest zakomentuj ją (ta linijka ma NIE działać).

        /**
         * Zadanie 7:
         * W klasie PersonBase zadeklaruj metodę abstrakcyjną `printPersonDetails()`.
         * Każda klasa potomna powinna zaimplementować tę metodę, tak aby wypisywała komplet informacji o obiekcie.
         */

//        fredek.printPersonDetails();
//        aniusia.printPersonDetails();
//        janeczek.printPersonDetails();

        /**
         * Zadanie 8:
         * Zastosuj zasadę DRY – jeśli zauważysz powtarzające się fragmenty kodu
         * w implementacjach `printPersonDetails()`, przenieś wspólne elementy do klasy bazowej PersonBase.
         */

//        System.out.println("KONIEC");

    }
}

