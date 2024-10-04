async function start() {
  // path/url al file JSON
  let json_path = 'books.json';

  // attendo il caricamento del file
  let response = await fetch(json_path);
  // trasformo il file in JSON
  let json = await response.json();
  // dal JSON prendo i dati che mi servono...
  // ...

  for(let i = 0; i < json.books.length; i++) {
    let row = document.createElement("tr");


    let title = document.createElement("td");
    title.innerHTML = json.books[i].title;

    let author = document.createElement("td");
    author.innerHTML = json.books[i].author;

    let year = document.createElement("td");
    year.innerHTML = json.books[i].year_published;

    let isbn = document.createElement("td");
    isbn.innerHTML = json.books[i].isbn;

    row.appendChild(title);
    row.appendChild(author);
    row.appendChild(year);
    row.appendChild(isbn);
    document.getElementById("table").appendChild(row);
  }
}

start();