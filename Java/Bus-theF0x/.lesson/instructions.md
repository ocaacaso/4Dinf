# Problema: Gestione di un Autobus

Si richiede di implementare una classe Java denominata `Bus` che rappresenti un autobus. L'autobus ha un nome (tipo "Linea 2") e può ospitare un massimo di 50 passeggeri. La classe deve tenere il nome dell'autobus e il numero attuale di passeggeri sull'autobus.

La classe avrà costruttore che accetta il solo nome e imposta a zero i passeggeri.

Metodi:

* `void stampa()`: un metodo che stampa a video il nome dell'autobus e il numero di passeggeri.

* `int faiSalire(int passeggeri)`: un metodo che aggiunge il numero specificato di passeggeri all'autobus. **Se il numero di passeggeri supera la capacità massima di 50, il metodo restituisce il numero di passeggeri in eccesso. In caso contrario, restituisce 0**.

* `int numeroPasseggeri()`: Un metodo che restituisce il numero attuale di passeggeri sull'autobus.

* `int faiScendere(int passeggeri)`: Un metodo che fa scendere il numero specificato di passeggeri dall'autobus. **Restituisce il numero effettivo di passeggeri scesi, che potrebbe essere inferiore a quello specificato se ci sono meno passeggeri a bordo**.

* `void bilanciaPasseggeri(Bus altroBus)`: Un metodo che bilancia il numero totale di passeggeri tra l'autobus corrente e un altro autobus specificato. Se il totale dei passeggeri è dispari, uno dei due autobus corrente avrà un passeggero in più.

## Metodi statici nella classe Main:

* `void stampa(Bus bs[])`: Questo metodo stampa a video le informazioni su ciascun autobus nell'array fornito, utilizzando il metodo `stampa` di ciascun autobus.

* `int distribuisci(Bus bs[], int passeggeri)`: Questo metodo prende un array di autobus (bs) e un numero di passeggeri da distribuire. Utilizza il metodo `faiSalire` di ciascun autobus per distribuire i passeggeri e restituisce il numero di passeggeri avanzati che non sono riusciti a salire su nessun autobus.

* `void bilanciaPasseggeri(Bus bs[])`: Questo metodo bilancia il numero totale di passeggeri tra gli autobus (il primo con il secondo, il secondo con il terzo, ... l'ultimo con il primo). Utilizza il metodo `bilanciaPasseggeri` di ciascun autobus.

Nel metodo `main` creare un array di autobus e testare tutti i metodi.