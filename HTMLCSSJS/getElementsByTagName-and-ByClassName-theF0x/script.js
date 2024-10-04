function click1() {
  let allByClass = document.getElementsByClassName("par-a");
  for (element of allByClass) {
    element.innerHTML = "ciao";
  }
}

function click2() {
  let allByClass = document.getElementsByClassName("par-b");
  for (element of allByClass) {
    element.innerHTML = "addio";
  }
}

function reset() {
  let allByTag = document.getElementsByTagName("p");
  let i = 1;
  for (element of allByTag) {
    element.innerHTML = "Paragrafo " + i;
    i = i + 1;
  }
}

function addStyle() {
  let allByTag = document.getElementsByTagName("p");
  for (element of allByTag) {
    element.classList.add("mystyle");
  }
}

function removeStyle() {
  let allByTag = document.getElementsByTagName("p");
  for (element of allByTag) {
    element.classList.remove("mystyle");
  }
}