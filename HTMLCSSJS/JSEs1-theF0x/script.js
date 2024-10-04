function noStyle() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.remove("black");
    element.classList.remove("red");
  }
  document.getElementById("noStyle").classList.add("btnSelected");
  document.getElementById("red").classList.remove("btnSelected");
  document.getElementById("black").classList.remove("btnSelected");
  document.getElementById("mixed").classList.remove("btnSelected");
}

function red() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.remove("black");
    element.classList.add("red");
  }
  document.getElementById("noStyle").classList.remove("btnSelected");
  document.getElementById("red").classList.add("btnSelected");
  document.getElementById("black").classList.remove("btnSelected");
  document.getElementById("mixed").classList.remove("btnSelected");
}

function black() {
  let allByTag = document.getElementsByTagName("td");
  for (element of allByTag) {
    element.classList.remove("red");
    element.classList.add("black");
  }
  document.getElementById("noStyle").classList.remove("btnSelected");
  document.getElementById("red").classList.remove("btnSelected");
  document.getElementById("black").classList.add("btnSelected");
  document.getElementById("mixed").classList.remove("btnSelected");
}

function mixed() {
  let allByClass = document.getElementsByClassName("td-a");
  for (element of allByClass) {
    element.classList.remove("black");
    element.classList.add("red");
  }
  let allByClass2 = document.getElementsByClassName("td-b");
  for (element of allByClass2) {
    element.classList.add("black");
  }
  document.getElementById("noStyle").classList.remove("btnSelected");
  document.getElementById("red").classList.remove("btnSelected");
  document.getElementById("black").classList.remove("btnSelected");
  document.getElementById("mixed").classList.add("btnSelected");
}