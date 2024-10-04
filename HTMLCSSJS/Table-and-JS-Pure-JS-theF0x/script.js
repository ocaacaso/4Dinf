function add() {
  let row = document.createElement("tr");

  
  let element = document.createElement("td");
  let name = document.getElementById("name_in").value;
  element.innerHTML = name;

  let elemen2 = document.createElement("td");
  let age = document.getElementById("age_in").value;
  elemen2.innerHTML = age;

  row.appendChild(element);
  row.appendChild(elemen2);
  document.getElementById("table").appendChild(row);
  
  document.getElementById("name_in").value = null;
  document.getElementById("age_in").value = null;
}