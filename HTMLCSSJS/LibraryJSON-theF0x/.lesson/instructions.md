# Library from JSON

L'idea è quella di leggere un file JSON contenente dei libri e mostrarli sotto forma di tabella.

Inizialmente la pagina HTML conterrà quindi una tabella vuota (solo con le intestazioni) e sarà compito del codice JS caricare il file JSON e riempire la tabella.

Per leggere un file da JSON possiamo usare questo metodo:

```JavaScript
async function myFunction() {
  // path/url al file JSON
  let json_path = '...';
  
  // attendo il caricamento del file
  let response = await fetch(json_path);
  // trasformo il file in JSON
  let json = await response.json();
  // dal JSON prendo i dati che mi servono...
  // ...
}
```

La versione senza `async/await` sarebbe così:

```JavaScript
function myFunction() {
  // path/url al file JSON
  let json_path = '...';
  
  fetch(json_path)
    .then(response => {
      // trasformo il file in JSON
      return response.json();
    })
    .then(data => {
        // dal JSON prendo i dati che mi servono...
        // ...
      });
    })
    .catch(error => {
      console.error('There was a problem fetching the JSON file:', error);
    });
  }
```