Dzia³anie programu:
Program wylicza miesiêczny zarobek netto na podstawie wprowadzonego zarobku dziennego brutto.
Do wyboru s¹ kraje: Polska, Niemcy, Wielka Brytania - zarobek dzienny wprowadzany jest w walucie wybranego kraju.
Po wprowadzeniu obu czynników za pomoc¹ odpowiednich kontrolek oraz wciœniêciu przycisku, wyœwietlana jest obliczona kwota.

Konstrukcja programu:
Program zawiera 5 klas: StartGUI, Kraj, Rates, Waluta, WalutaAdapter.
Klasa StartGUI zawiera budowê interfejsu, funkcjê main, klasê WalutaAdapter (zawieraj¹c¹ w³asne deklaracje dotycz¹ce serializacji i deserializacji obiektów JSON z i do obiektów klasy Waluta.
Klasy Waluta i Rates s¹ odbiciami konstrukcji plików JSON uzyskanych z publicznego API Narodowego Banku Polskiego, zawieraj¹cych aktualne kursy walut (klasa Waluta zawiera listê obiektów typu Rates)
Klasa Kraj jest zbiorem parametrów opisuj¹cych dostêpne kraje, wraz z procentami podatkowymi oraz kosztami sta³ymi.
Plik beans.xml zawiera konfiguracjê frameworku Spring. 
Wszystkie obliczenia przeprowadzane s¹ w metodzie jButton1ActionPerformed.
Program wykorzystuje bibliotekê open-source Gson, biblioteki Spring 4.3.3, oraz bibliotekê Json-simple 1.1.

 
