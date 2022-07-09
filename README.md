# Zajecia
<b>
Projekt nazwa ŻYCIEIWALKA na githubie
</b>
	<br>
gra życie i walka
człowiek jest stworzony za pomocą klasy 
</br>
	Zmienne: życie, exp, obrazenia
	</br>
	Funkcje: walka, leczenie, wyswietlanie statystyk
</br>
</br>
</br>
opcje do wyboru w programie:
1.wyjscie
</br>
2.walka-program losowo zadaje nam obrażenia od 1-100 i dodaje exp jeśli wygraliśmy jeśli nie to pisze ze zgineliśmy
</br>
3.wyswietlenie statystyk:wyświetla wszystkie zmienne z klasy Człowiek
</br>
4.leczenie: dodaje życie +100


</br>
</br>
</br>
</br>

1. Klasa zajecia1.Program i Człowiek
2. Konstruktor klasy Człowiek (pierwsze wartości)
3. Wyświetlenie statystyk
4. Pętla Gry (while z 4 opcjami wyboru co mozemy zrobic)
5. Dodawanie życia o 100 za pomocą funkcji w klasie Człowiek i podłączacie do Pętli gry
6. Walka(program losuje obrażenia w pętli gry 
odejmujemy za pomocą funkcji walka obrazenia wylosowane od życia
i dodajemy w tej samej funkcji exp (stała wartość)
7. if że jeśli mamy mniej niż 0 życia to przegraliśmy
</br>
</br>
<p>
   <b>
   Projekt nazwa FIRMA na githubie
   </b>
</p>
<p>
Program polega na zarządzaniu pracownikami w firmie.
Dwie klasy Firma(główna w niej jest funkcja main) i Pracownik
</p>
<p>
   <b>
Firma:
   </b>
</p>
<ul>
<li>ArrayLista pracowników</li>
<li>wyjscie z programu</li>
<li>dodaj pracownika nowego</li>
<li>Wyswietl wszystkich pracowników</li>
<li>zwolnij pracownika</li>
<li>podnieś płace pracownika</li>
<li>suma wydatków miesięcznych</li>
<li>zapis danych pracowników w formie tabeli do pliku txt</li>
</ul>
<p>
   <b>
Pracownik:
   </b>
</p>
<ul>
<li>Imie i Nazwisko</li>
<li>Płaca</li>
<li>Adres</li>
<li>wszystkie zmienne prywatne</li>
<li>funkcja toString która zwraca String z wszystkimi danymi</li>
</ul>


<p>ls -wyswietlenie wszystkich plikow i folderów</p>
<p>ls -l -wyswietlanie z wiekszą ilością danych</p>
<p>cd - zmiana sciezki </p>
<p>cd ../ -cofniecie sie</p>
<p>clear -czyszczenie widoku terminala</p>
<p>rm - usuwanie plikow</p>
<p>rm -rf usuwanie folderów</p>
<p>nano -notatnik terminalowy</p>

<p>git init -inicjowanie lokalnego repozytorium</p>
<p>git status -pokazuje ktr pliki są dodane do commita a ktr nie</p>
<p>git add . -dodawanie wszystkich plików do commita</p>
<p>git reset -usuwa wszystko z commita</p>
<p>git commit -m "komentarz" --tworzy commita </p>
<p>git remote add origin link -łączy nam z zewnętrznym repozytorium</p>
<p>git push origin master -wysyłamy do zdalnego repozytorium</p>
<p>git branch -wyswietlanie gałęzi</p>
<p>git branch nazwa_galezi -tworzy nową galąź</p>
<p>git checkout -przeskakuje na ogpowiedni branch</p>
<p>git mergetool</p>

<p>vim wyjscie :wqa -</p>
http://www.algorytm.org/algorytmy-sortowania/

__________________________________________________

Testowanie:
	-jednostkowe (NISKOPOZIOMOWYM KODOWANIEM) JUnit 4 5
	-funkcjonalne
	-integracyjne
	-wydajnościowe
	....
https://mvnrepository.com/
Maven i Gradle różnice

assertEquals()-
assertTrue()
assertFalse()
assertNull()
assertNotNull()
assertNotEquals()
assertThrows()

@BeforeEach
@BeforeAll
@AfterEach
@AfterAll
@DisplayName("")
@Disabled

|| - lub
&& - i

TDD BDD (Test Driven Development, Behaviour Driven Development)
user dodaje cos do koszyka
	-wybrac produkt
		
	-powinien byc dodany do koszyka
		czyWybranyProduktZostalDodanyDoKoszyka()
	-mozliwe usuniecie z koszyka
		czyZostałPoprawnieUsuniety()
		czyMoznaUsunąćWiecejNizJeden()

Nie sprawdzac oczywistych rzeczy
Nazywamy wszystkie funkcje tak zeby kazdy wiedzial co ona robi
Kazdy test niezalezny od innych
Testujemy warunki brzegowe
___________________________________________________
Zadanie koszyk na stronie internetowej
	-dodawanie produktów ze sklepu
	-usuwanie
	-ilosc tego samego przedmiotu
	-cena przedmiotu
	-obliczanie ceny za wszystko
1.Tworzymy historyjki (story)
2.Tworzymy nazwy testów jednostkowych
3.Piszemy aplikacje

		Koszyk klasa 
			Map zmienna z wyszystkimi produktam 			zamowionymi wraz z iloscią

			funkcja liczenia wszystkich cen
		Przedmiot klasa
			Cena 
			Nazwa
			
			
___________________________________________________
Zadanie wypożyczalnia aut
<p>Plik Pom.xml i aplication.properties potrzebne do połączenia z bazą danych znajdują się w folderze serwerZadanie</p>
<p>Do stworzenia jest aplikacja kliencka, aplikacja serwerowa i baza danych.</p>
<p>Baza danych:</p>
<ul>
	<li>-minimum 3 tabele (cennik, klienci, auta) Jesli potrzebujecie ich wiecej to śmiało można tworzyć</li>
	<li>-tabela klienci ma być powiązana z autami za pomocą id_auta</li>
</ul>
<p>Aplikacja serwerowa:</p>
<p>	-serwlety:</p>
	<ul>
		<li>-tworzący połączenie klienta z autem</li>
		<li>-usuwający połączenie klienta z autem</li>
		<li>-wyświetlający wszystkie wypożyczenia</li>
		<li>-wyświetlający cennik do danego auta</li>
	</ul>
<p>Aplikacja kliencka: ma wykonywać zapytania na wszystkie serwlety</p>





