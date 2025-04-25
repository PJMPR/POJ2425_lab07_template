# 🧠 Dziedziczenie w Javie – Zadanie

Twoim zadaniem jest zaprojektowanie i zaimplementowanie hierarchii klas w języku Java, aby przećwiczyć podstawy dziedziczenia, abstrakcji oraz zasady DRY (*Don't Repeat Yourself*).

## 🧱 Struktura klas

### 1. **🧍 PersonBase** *(klasa abstrakcyjna)*
Klasa bazowa dla wszystkich pozostałych typów osób. Powinna zawierać:
- 🔹 Pola:
  - `name`
  - `surname`
  - `dateOfBirth` (typ `LocalDate`)
  - `gender` (np. `Gender.MALE`, `Gender.FEMALE`)
- 🔹 Konstruktor inicjalizujący wszystkie pola
- 🔹 Gettery i settery
- 🔹 **Abstrakcyjną metodę** `printPersonDetails()`, którą będą implementować klasy potomne
- 🛠️ (Opcjonalnie) metodę pomocniczą, która wypisuje wspólne dane – aby ograniczyć duplikację kodu

### 2. **🎓 Student** *(dziedziczy po `PersonBase`)*
- ➕ Dodatkowe pole: `indexNumber`
- 🖨️ Implementacja metody `printPersonDetails()` wyświetlająca wszystkie informacje o studencie

### 3. **👩‍🏫 Lecturer** *(dziedziczy po `PersonBase`)*
- ➕ Dodatkowe pole: `title` (np. "PhD", "Prof.")
- 🖨️ Implementacja metody `printPersonDetails()`

### 4. **💰 Scholar** *(dziedziczy po `Student`)*
- ➕ Dodatkowe pole: `scholarship` (typ `double`)
- 🖨️ Implementacja metody `printPersonDetails()`

## 💡 Wskazówki do implementacji

Kod, który powinieneś utworzyć, znajduje się w pliku `MainProgram.java`. Poszczególne etapy są opisane w komentarzach poprzedzających fragmenty kodu do odkomentowania.

Zadanie polega na:
1. ✅ Utworzeniu klas zgodnie z powyższą strukturą.
2. 📦 Przeniesieniu wspólnych pól i metod do klasy bazowej `PersonBase`.
3. 📐 Zastosowaniu zasad:
   - 🔍 **Abstrakcja** – `PersonBase` nie powinna być instancjonowana bezpośrednio.
   - 🧬 **Dziedziczenie** – wykorzystaj `extends`, aby unikać powtórzeń.
   - ♻️ **DRY** – wyodrębnij wspólne fragmenty kodu do klasy nadrzędnej.

## 🧪 Przykładowe dane testowe

W `MainProgram.java` znajdziesz zakomentowane przykłady tworzenia obiektów:
- `Student janekKowalski = new Student(...)`
- `Lecturer aniaNowak = new Lecturer(...)`
- `Scholar fryderykNowak = new Scholar(...)`

Po poprawnym zaimplementowaniu klas, odkomentuj kod i sprawdź, czy wszystkie dane wyświetlają się poprawnie za pomocą metody `printPersonDetails()`.

## 🎯 Cel zadania

Celem jest:
- 🧠 Zrozumienie mechanizmów dziedziczenia w Javie
- 🧩 Umiejętność wydzielania wspólnych cech do klas nadrzędnych
- 🛠️ Wykorzystanie klas abstrakcyjnych i metod abstrakcyjnych
- ✅ Stosowanie dobrych praktyk programistycznych

---
Powodzenia! 🙂 Jeśli kod działa zgodnie z założeniami, na końcu powinieneś zobaczyć dane studentów, wykładowców i stypendystów wyświetlane w czytelnej formie.

```java
// Przykład wywołania
student.printPersonDetails();
lecturer.printPersonDetails();
scholar.printPersonDetails();
```

