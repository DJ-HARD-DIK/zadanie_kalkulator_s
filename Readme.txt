Dzia�anie programu:
Program wylicza miesi�czny zarobek netto na podstawie wprowadzonego zarobku dziennego brutto.
Do wyboru s� kraje: Polska, Niemcy, Wielka Brytania - zarobek dzienny wprowadzany jest w walucie wybranego kraju.
Po wprowadzeniu obu czynnik�w za pomoc� odpowiednich kontrolek oraz wci�ni�ciu przycisku, wy�wietlana jest obliczona kwota.

Konstrukcja programu:
Program zawiera 5 klas: StartGUI, Kraj, Rates, Waluta, WalutaAdapter.
Klasa StartGUI zawiera budow� interfejsu, funkcj� main, klas� WalutaAdapter (zawieraj�c� w�asne deklaracje dotycz�ce serializacji i deserializacji obiekt�w JSON z i do obiekt�w klasy Waluta.
Klasy Waluta i Rates s� odbiciami konstrukcji plik�w JSON uzyskanych z publicznego API Narodowego Banku Polskiego, zawieraj�cych aktualne kursy walut (klasa Waluta zawiera list� obiekt�w typu Rates)
Klasa Kraj jest zbiorem parametr�w opisuj�cych dost�pne kraje, wraz z procentami podatkowymi oraz kosztami sta�ymi.
Plik beans.xml zawiera konfiguracj� frameworku Spring. 
Wszystkie obliczenia przeprowadzane s� w metodzie jButton1ActionPerformed.
Program wykorzystuje bibliotek� open-source Gson, biblioteki Spring 4.3.3, oraz bibliotek� Json-simple 1.1.

 
