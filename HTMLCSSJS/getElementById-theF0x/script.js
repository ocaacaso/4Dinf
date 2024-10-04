function funzione1() {
  for (let i = 1; i < 11; i++) {
    let id = "v" + i;
    let el = document.getElementById(id);
    el.innerHTML += " modificato";
  }

}