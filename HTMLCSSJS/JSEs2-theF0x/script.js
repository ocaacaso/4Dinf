function funzione(el) {
  
  if (el.classList.contains("red")) {
    el.classList.add("black");
    el.classList.remove("red");
  } else if (el.classList.contains("black")) {
    el.classList.add("purple");
    el.classList.remove("black");
  } else if (el.classList.contains("purple")) {
    el.classList.add("white");
    el.classList.remove("purple");
  } else {
    el.classList.add("red");
    el.classList.remove("white");
  }

}

function reset() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.remove("purple");
    element.classList.remove("red");
    element.classList.remove("black");
  }
}

function red() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.add("red");
    element.classList.remove("purple");
    element.classList.remove("white");
    element.classList.remove("black");
  }
}

function black() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.add("black");
    element.classList.remove("purple");
    element.classList.remove("white");
    element.classList.remove("red");
  }
}

function purple() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.add("purple");
    element.classList.remove("red");
    element.classList.remove("white");
    element.classList.remove("black");
  }
}