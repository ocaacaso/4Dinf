# Porto turistico

Un porto turistico affitta i propri 100 posti-barca alle imbarcazioni che ne fanno richiesta. Per legge è tenuto a registrare per ogni barca ospitata le seguenti informazioni:

* nome
* nazionalità
* lunghezza
* stazza
* tipologia (vela o motore)

ma non vi è obbligo di mantenere le informazioni relative alle imbarcazioni dopo che hanno lasciato il porto.

I posti-barca sono numerati:

* i posti da 1 a 20 non possono ospitare barche più lunghe di 10m e le barche a vela devono essere piazzate in via prioritaria nei posti successivi al 50.
* Il costo dell'affitto per le barche a vela è di €10 per metro di lunghezza al giorno, mentre per le barche a motore è di €20 per tonnellata di stazza al giorno.

È richiesta la progettazione di una possibile soluzione per la gestione informatica dei posti-barca che implementi le seguenti funzionalità:

1. assegnazione di un posto a una barca in arrivo
2. liberazione di un posto occupato con calcolo dell'importo dell'affitto (in input viene fornito il numero dei giorni di sosta)
3. ricerca delle informazioni relative alla barca che occupa un dato posto
4. produrre una struttura dati (array) dei nomi delle barche di una certa nazionalità specificata dall'utente.

## Esercizio

1. Definire mediante un diagramma UML le classi che consentono di rappresentare adeguatamente la soluzione del problema
2. Implementare in linguaggio Java le classi progettate prevedendo e sollevando specifiche eccezioni
3. Dotare la classe principale di un metodo main che permetta all'utente di esercitare le funzionalità elencate visualizzando messaggi di errore in caso di sollevamento di eccezioni