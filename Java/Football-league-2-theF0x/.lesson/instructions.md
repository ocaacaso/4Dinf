# Football league 2

Partiamo sempre dalla solita definizione di `Team` con i soliti attributi:

* nome squadra
* numero di partite vinte (_won_)
* numero di partite perse (_lost_)
* numero di partite pareggiate (_drawn_)
* numero di gol fatti (_scored_)
* numero di gol subiti (_conceded_)

Vogliamo cambiare invece la modalità di utilizzo della classe: lo scopo è quello di tenere le informazioni di una squadra durante tutto il campionato.

All'inizio del campionato la squadra avrà tutti i valori a 0, per cui **il nostro costruttore prenderà solo il nome della squadra, mentre tutti gli altri valori vengono impostati a 0**.

Vogliamo ancora il metodo **privato** `calculatePoints` e un metodo **pubblico** `printStatistics` che stampi le statistiche della squadra con questo formato:

```
A.C. Perugia
Partite giocate: 5
Partite vinte: 3
Partite perse: 1
Partite pareggiate: 1
Gol fatti: 7
Gol subiti: 3
Punti totali: 10
```

In più aggiungeremo un metodo che permetta di impostare il risultato di una nuova partita:

`void addMatch(boolean home, int goals1, int goals2)`

Il parametro `home` mi dice se la squadra giocava in casa o fuori casa. Se giocava il casa goals1 va a incrementare i gol fatti e goals2 va a incrementare i gol subiti, se giocava fuori casa, goals2 va a incrementare i gol fatti e goals1 va a incrementare i gol subiti.

Nel `main` quindi:

* creiamo una squadra
* ne stampiamo le statistiche (che saranno tutte a 0)
* aggiungiamo alcune partite
* ne stampiamo nuovamente le statistiche