function add() {
  //creazione variabili ed elementi
  let element = document.createElement("li");
  let value = document.getElementById("item").value;
  element.innerHTML = value;
  
  let button = document.createElement("button");
  button.innerHTML = "x";

  //creazione eventListeners
  const f = selected.bind(null, element);
  element.addEventListener("dblclick", f);

  const f2 = del.bind(null, document.getElementById("list"), element);
  button.addEventListener("click", f2);

  //assegnazione variabili nel DOM
  element.appendChild(button);
  document.getElementById("list").appendChild(element);
  document.getElementById("item").value = null;
}

function selected(element) {
  if(element.classList.contains("cancelled")) element.classList.remove("cancelled");
  else element.classList.add("cancelled");
}

function del(lista, element) {
  lista.removeChild(element);
}