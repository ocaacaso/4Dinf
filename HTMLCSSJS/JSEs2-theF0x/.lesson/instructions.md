# JSEs 2

L'idea è simile a quella dell'esercizio precedente. Vogliamo realizzare una tabella 3 x 3 ma in questo caso sono le singole celle che sono cliccabili. Questo è possibile perché ogni elemento può ricevere un evento `onclick`.

Ogni volta che clicchiamo su una cella, questa cambierà in sequenza il suo colore da bianco a rosso a blu a giallo, per poi tornare a bianco.

Per realizzare questo effetto, ci ricordiamo che ogni elemento HTML ha la sua `classList` che contiene le classi CSS e `classList` ci offre i seguenti metodi:

* `el.classList.add("red")`: aggiunge la classe `red` all'elemento, se non c'è già
* `el.classList.remove("red")`: remove la classe `red` all'elemento, se c'è
* `el.classList.contains("red")`: restituisce `true` se l'elemento contiene la classe `red`